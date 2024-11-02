package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm01 extends JFrame {
    static final long serialVersionUID = 1L;
    JTextField txtDividendo, txtDivisor, txtCociente, txtResto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm01 frame = new frm01();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm01() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDividendo = new JLabel("Dividendo:");
        lblDividendo.setBounds(50, 50, 100, 30);
        getContentPane().add(lblDividendo);

        txtDividendo = new JTextField();
        txtDividendo.setBounds(150, 50, 100, 30);
        txtDividendo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDividendo);

        JLabel lblDivisor = new JLabel("Divisor:");
        lblDivisor.setBounds(50, 100, 100, 30);
        getContentPane().add(lblDivisor);

        txtDivisor = new JTextField();
        txtDivisor.setBounds(150, 100, 100, 30);
        txtDivisor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDivisor);

        JLabel lblCociente = new JLabel("Cociente:");
        lblCociente.setBounds(50, 150, 100, 30);
        getContentPane().add(lblCociente);

        txtCociente = new JTextField();
        txtCociente.setFocusable(false);
        txtCociente.setBounds(150, 150, 100, 30);
        getContentPane().add(txtCociente);

        JLabel lblResto = new JLabel("Resto:");
        lblResto.setBounds(50, 200, 100, 30);
        getContentPane().add(lblResto);

        txtResto = new JTextField();
        txtResto.setFocusable(false);
        txtResto.setBounds(150, 200, 100, 30);
        getContentPane().add(txtResto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 250, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    void btnCalcular_actionPerformed() {
        int dividendo = Integer.parseInt(txtDividendo.getText());
        int divisor = Integer.parseInt(txtDivisor.getText());

        if (divisor == 0) {
            txtCociente.setText("Error");
            txtResto.setText("Error");
            return;
        }

        int[] resultado = dividir(dividendo, divisor);
        txtCociente.setText(String.valueOf(resultado[0]));
        txtResto.setText(String.valueOf(resultado[1])); 
    }

    int[] dividir(int dividendo, int divisor) {

        int[] resultado = new int[2];
        
        if (dividendo < divisor) {
            resultado[0] = 0;
            resultado[1] = dividendo;
            return resultado;
        }

        dividendo -= divisor;
        resultado = dividir(dividendo, divisor);
        resultado[0]++;
        return resultado;
    }
}
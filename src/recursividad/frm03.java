package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm03 extends JFrame {
    static final long serialVersionUID = 1L;
    JTextField txtNumero, txtBase, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm03 frame = new frm03();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 50, 100, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 50, 100, 30);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(50, 100, 100, 30);
        getContentPane().add(lblBase);

        txtBase = new JTextField();
        txtBase.setBounds(150, 100, 100, 30);
        txtBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBase);

        JLabel lblResultado = new JLabel("Potencia:");
        lblResultado.setBounds(50, 150, 100, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(150, 150, 100, 30);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 200, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        int base = Integer.parseInt(txtBase.getText());

        boolean esPotencia = esPotenciaDe(numero, base);
        txtResultado.setText(esPotencia ? "Sí" : "No");
    }

    boolean esPotenciaDe(int numero, int base) {
        if (numero == 1) {
            return true;
        }
        if (numero < base || numero % base != 0) {
            return false;
        }
        return esPotenciaDe(numero / base, base);
    }
}
package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm10 extends JFrame {
    static final long serialVersionUID = 1L;
    JTextField txtNumero, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm10 frame = new frm10();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 50, 120, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 50, 100, 30);
        getContentPane().add(txtNumero);

        JLabel lblResultado = new JLabel("Resultados:");
        lblResultado.setBounds(50, 100, 120, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(180, 100, 200, 30);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 150, 150, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    void btnCalcular_actionPerformed() {
        int numeroMaximo = Integer.parseInt(txtNumero.getText());
        String resultado = calcular(1, numeroMaximo);
        txtResultado.setText(resultado);
    }

    String calcular(int numero, int limite) {
        if (numero * numero > limite) {
            return "";
        }
        String resultado = (numero * numero) + ", ";
        return resultado + calcular(numero + 1, limite);
    }
}
package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm02 extends JFrame {
    static final long serialVersionUID = 1L;
    JTextField txtNumero, txtEsPrimo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm02 frame = new frm02();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm02() {
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

        JLabel lblEsPrimo = new JLabel("Es primo:");
        lblEsPrimo.setBounds(50, 100, 100, 30);
        getContentPane().add(lblEsPrimo);

        txtEsPrimo = new JTextField();
        txtEsPrimo.setBounds(150, 100, 100, 30);
        getContentPane().add(txtEsPrimo);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 150, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        boolean esPrimo = esPrimo(numero, 2);
        txtEsPrimo.setText(esPrimo ? "Sí" : "No");

    }

    boolean esPrimo(int numero, int divisor) {
        if (numero < 2) {
            return false;
        }
        if (divisor * divisor > numero) {
            return true;
        }
        if (numero % divisor == 0) {
            return false;
        }
        return esPrimo(numero, divisor + 1);
    }
}

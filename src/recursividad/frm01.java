package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm01 extends JFrame {
    static final long serialVersionUID = 1L;
    JTextField txtNumero, txtCifras;

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

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 50, 100, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 50, 100, 30);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        JLabel lblCifras = new JLabel("Cifras:");
        lblCifras.setBounds(50, 100, 100, 30);
        getContentPane().add(lblCifras);

        txtCifras = new JTextField();
        txtCifras.setBounds(150, 100, 100, 30);
        getContentPane().add(txtCifras);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 150, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        int cifras = contarCifras(numero);
        txtCifras.setText(String.valueOf(cifras));
    }

    int contarCifras(int numero) {
        if (numero == 0) {
            return 1;
        }
        if (numero < 0) {
            numero = -numero;
        }
        return contarCifras(numero, 0);
    }

    int contarCifras(int numero, int contador) {
        if (numero == 0) {
            return contador;
        }
        return contarCifras(numero / 10, contador + 1);
    }
}
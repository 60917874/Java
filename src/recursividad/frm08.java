package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm08 extends JFrame {
    static final long serialVersionUID = 1L;
    JTextField txtNumero, txtValorAbsoluto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm08 frame = new frm08();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 50, 100, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 50, 100, 30);
        getContentPane().add(txtNumero);

        JLabel lblValorAbsoluto = new JLabel("Valor Absoluto:");
        lblValorAbsoluto.setBounds(50, 100, 100, 30);
        getContentPane().add(lblValorAbsoluto);

        txtValorAbsoluto = new JTextField();
        txtValorAbsoluto.setBounds(150, 100, 100, 30);
        getContentPane().add(txtValorAbsoluto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 150, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        int valorAbsoluto = calcularValor(numero);
        txtValorAbsoluto.setText(String.valueOf(valorAbsoluto));
    }

    int calcularValor(int numero) {
        if (numero < 0) {
            return calcularValor(-numero);
        }
        return numero;
    }
}
package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtDivisores;

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
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 50, 80, 30);
        getContentPane().add(lblNumero);

        JLabel lblDivisores = new JLabel("Divisores:");
        lblDivisores.setBounds(50, 90, 80, 30);
        getContentPane().add(lblDivisores);

        txtNumero = new JTextField();
        txtNumero.setBounds(140, 50, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtDivisores = new JTextField();
        txtDivisores.setBounds(140, 90, 100, 30);
        txtDivisores.setFocusable(false);
        txtDivisores.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDivisores.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDivisores);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 140, 100, 30);
        btnCalcular.addActionListener(e -> calcularDivisores());
        getContentPane().add(btnCalcular);
    }

    protected void calcularDivisores() {
        int numero = Integer.parseInt(txtNumero.getText());
        int divisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        txtDivisores.setText("" + divisores);
    }
}
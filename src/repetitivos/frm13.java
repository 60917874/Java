package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm13 frame = new frm13();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm13() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 50, 150, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 50, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 100, 150, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(150, 100, 100, 30);
        txtResultado.setFocusable(false);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 150, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int n = Integer.parseInt(txtNumero.getText());
        int suma = suma(n);
        txtResultado.setText(String.valueOf(suma));
    }

    int suma(int n) {
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                suma += i;
            }
        }

        return suma;
    }
}
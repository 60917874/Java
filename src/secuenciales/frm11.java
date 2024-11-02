package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm11 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPrimerNumero, txtSegundoNumero, txtPrimerResultado, txtSegundoResultado;
    JLabel lblPrimerNumero, lblSegundoNumero, lblPrimerResultado, lblSegundoResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm11 frame = new frm11();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm11() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(50, 70, 120, 30);
        getContentPane().add(lblNumero2);

        JLabel lblPrimerResultado = new JLabel("Resultado 1:");
        lblPrimerResultado.setBounds(50, 110, 120, 30);
        getContentPane().add(lblPrimerResultado);

        JLabel lblSegundoResultado = new JLabel("Resultado 2:");
        lblSegundoResultado.setBounds(50, 150, 120, 30);
        getContentPane().add(lblSegundoResultado);

        txtPrimerNumero = new JTextField();
        txtPrimerNumero.setBounds(180, 30, 60, 30);
        txtPrimerNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrimerNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrimerNumero);

        txtSegundoNumero = new JTextField();
        txtSegundoNumero.setBounds(180, 70, 60, 30);
        txtSegundoNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSegundoNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSegundoNumero);

        txtPrimerResultado = new JTextField();
        txtPrimerResultado.setBounds(180, 110, 60, 30);
        txtPrimerResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrimerResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrimerResultado);

        txtSegundoResultado = new JTextField();
        txtSegundoResultado.setBounds(180, 150, 60, 30);
        txtSegundoResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSegundoResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSegundoResultado);

        JButton btnCalcular = new JButton("Intercambiar");
        btnCalcular.setBounds(80, 190, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int numero1 = Integer.parseInt(txtPrimerNumero.getText());
        int numero2 = Integer.parseInt(txtSegundoNumero.getText());

        int primer_cifra1 = numero1 / 100;
        int primer_cifra2 = (numero1 / 10) % 10;
        int primer_cifra3 = numero1 % 10;

        int segundo_cifra1 = numero2 / 100;
        int segundo_cifra2 = (numero2 / 10) % 10;
        int segundo_cifra3 = numero2 % 10;

        int nuevoNumero1 = segundo_cifra1 * 100 + segundo_cifra2 * 10 + segundo_cifra3;
        int nuevoNumero2 = primer_cifra1 * 100 + primer_cifra2 * 10 + primer_cifra3;

        lblPrimerResultado.setText("Primer resultado : " + nuevoNumero1);
        lblSegundoResultado.setText("Segundo resultado : " + nuevoNumero2);
    }
}
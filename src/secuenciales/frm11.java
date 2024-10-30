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
    JTextField txtPrimerNumero, txtSegundoNumero;
    JLabel lblPrimerResultado, lblSegundoResultado;

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

        JLabel lblNumero1 = new JLabel("Número 1 (3 cifras):");
        lblNumero1.setBounds(50, 50, 120, 30);
        getContentPane().add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Número 2 (3 cifras):");
        lblNumero2.setBounds(50, 90, 120, 30);
        getContentPane().add(lblNumero2);

        lblPrimerResultado = new JLabel("Resultado 1:");
        lblPrimerResultado.setBounds(50, 130, 200, 30);
        getContentPane().add(lblPrimerResultado);

        lblSegundoResultado = new JLabel("Resultado 2:");
        lblSegundoResultado.setBounds(50, 170, 200, 30);
        getContentPane().add(lblSegundoResultado);

        txtPrimerNumero = new JTextField();
        txtPrimerNumero.setBounds(180, 50, 60, 30);
        txtPrimerNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrimerNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrimerNumero);

        txtSegundoNumero = new JTextField();
        txtSegundoNumero.setBounds(180, 90, 60, 30);
        txtSegundoNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSegundoNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSegundoNumero);

        JButton btnCalcular = new JButton("Intercambiar");
        btnCalcular.setBounds(80, 210, 120, 30);
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

        // Crear los números intercambiados
        int nuevoNumero1 = segundo_cifra1 * 100 + segundo_cifra2 * 10 + segundo_cifra3;
        int nuevoNumero2 = primer_cifra1 * 100 + primer_cifra2 * 10 + primer_cifra3;

        lblPrimerResultado.setText("Primer resultado : " + nuevoNumero1);
        lblSegundoResultado.setText("Segundo resultado : " + nuevoNumero2);
    }
}
package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblSuma;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm09 frame = new frm09();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm09() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número (4 cifras):");
        lblNumero.setBounds(50, 50, 120, 30);
        getContentPane().add(lblNumero);

        lblSuma = new JLabel("Suma:");
        lblSuma.setBounds(50, 130, 200, 30);
        getContentPane().add(lblSuma);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 50, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 210, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        
        int cifra1 = numero / 1000;
        int cifra2 = (numero / 100) % 10;
        int cifra3 = (numero / 10) % 10;
        int cifra4 = numero % 10;     

        int suma = cifra1 + cifra2 + cifra3 + cifra4;

        lblSuma.setText("Suma: " + suma);
    }
}
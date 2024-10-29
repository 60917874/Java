package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblNReverso;

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
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número (4 cifras):");
        lblNumero.setBounds(50, 50, 120, 30);
        getContentPane().add(lblNumero);

        lblNReverso = new JLabel("Número al revés:");
        lblNReverso.setBounds(50, 130, 200, 30);
        getContentPane().add(lblNReverso);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 50, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        JButton btnCalcular = new JButton("Invertir");
        btnCalcular.setBounds(80, 210, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());

        int primeraCifra = numero % 10;
        int segundaCifra = (numero / 10) % 10;
        int terceraCifra = (numero / 100) % 10;
        int cuartaCifra = (numero / 1000) % 10;


        int numeroReverso = cuartaCifra * 1000 + terceraCifra * 100 + segundaCifra * 10 + primeraCifra;

        lblNReverso.setText("Número al revés: " + numeroReverso);
    }
}
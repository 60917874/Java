package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;

    JTextField txtKilometros, txtPies, txtMillas, txtMetros, txtYardas;
    JLabel lblMetros, lblYardas;

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
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblKilometros = new JLabel("Tramo en km: ");
        lblKilometros.setBounds(50, 30, 100, 30);
        getContentPane().add(lblKilometros);

        JLabel lblPies = new JLabel("Tramo en pies: ");
        lblPies.setBounds(50, 70, 100, 30);
        getContentPane().add(lblPies);

        JLabel lblMillas = new JLabel("Tramo en millas: ");
        lblMillas.setBounds(50, 110, 100, 30);
        getContentPane().add(lblMillas);

        JLabel lblMetros = new JLabel("0.0 m");
        lblMetros.setBounds(50, 150, 120, 30);
        getContentPane().add(lblMetros);

        JLabel lblYardas = new JLabel("0.0 yd");
        lblYardas.setBounds(50, 190, 120, 30);
        getContentPane().add(lblYardas);

        txtKilometros = new JTextField();
        txtKilometros.setBounds(160, 30, 100, 30);
        txtKilometros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtKilometros.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtKilometros);

        txtPies = new JTextField();
        txtPies.setBounds(160, 70, 100, 30);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPies);

        txtMillas = new JTextField();
        txtMillas.setBounds(160, 110, 100, 30);
        txtMillas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMillas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMillas);

        txtMetros = new JTextField();
        txtMetros.setBounds(160, 150, 100, 30);
        txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMetros);

        txtYardas = new JTextField();
        txtYardas.setBounds(160, 190, 100, 30);
        txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtYardas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtYardas);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 230, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {

        double kilometros = Double.parseDouble(txtKilometros.getText());
        double pies = Double.parseDouble(txtPies.getText());
        double millas = Double.parseDouble(txtMillas.getText());

        double metros = kilometros * 1000 + pies / 3.2808 + millas * 1609;
        double yardas = metros * 1.09361;

        DecimalFormat df = new DecimalFormat("###.##");
        lblMetros.setText(df.format(metros) + " m");
        lblYardas.setText(df.format(yardas) + " yd");
    }
}
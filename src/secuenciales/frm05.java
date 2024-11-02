package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtGigabytes, txtMegabytes, txtKilobytes, txtBytes;
    JLabel lblMegabytes, lblKilobytes, lblBytes;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm05 frame = new frm05();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm05() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblGigabytes = new JLabel("Gigabytes:");
        lblGigabytes.setBounds(30, 30, 80, 30);
        getContentPane().add(lblGigabytes);

        txtGigabytes = new JTextField();
        txtGigabytes.setBounds(130, 30, 100, 30);
        txtGigabytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGigabytes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtGigabytes);

        JLabel lblMegabytes = new JLabel("Megabytes: 0.0");
        lblMegabytes.setBounds(30, 70, 200, 30);
        getContentPane().add(lblMegabytes);

        JLabel lblKilobytes = new JLabel("Kilobytes: 0.0");
        lblKilobytes.setBounds(30, 110, 200, 30);
        getContentPane().add(lblKilobytes);

        JLabel lblBytes = new JLabel("Bytes: 0.0");
        lblBytes.setBounds(30, 150, 200, 30);
        getContentPane().add(lblBytes);

        txtMegabytes = new JTextField();
        txtMegabytes.setBounds(130, 70, 100, 30);
        txtMegabytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMegabytes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMegabytes);

        txtKilobytes = new JTextField();
        txtKilobytes.setBounds(130, 110, 100, 30);
        txtKilobytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtKilobytes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtKilobytes);

        txtBytes = new JTextField();
        txtBytes.setBounds(130, 150, 100, 30);
        txtBytes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBytes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBytes);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 190, 100, 30);
        btnCalcular.setMnemonic('C');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> calcularCapacidad());
    }

    protected void calcularCapacidad() {
        double gigabytes = Double.parseDouble(txtGigabytes.getText());

        double megabytes = gigabytes * 1024;
        double kilobytes = megabytes * 1024;
        double bytes = kilobytes * 1024;

        DecimalFormat df = new DecimalFormat("###,###.##");
        lblMegabytes.setText("Megabytes: " + df.format(megabytes));
        lblKilobytes.setText("Kilobytes: " + df.format(kilobytes));
        lblBytes.setText("Bytes: " + df.format(bytes));
    }
}
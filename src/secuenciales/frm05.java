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
    JTextField txtGigabytes;
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

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 80, 100, 30);
        btnCalcular.setMnemonic('C');
        getContentPane().add(btnCalcular);

        lblMegabytes = new JLabel("Megabytes: ");
        lblMegabytes.setBounds(30, 130, 200, 30);
        getContentPane().add(lblMegabytes);

        lblKilobytes = new JLabel("Kilobytes: ");
        lblKilobytes.setBounds(30, 170, 200, 30);
        getContentPane().add(lblKilobytes);

        lblBytes = new JLabel("Bytes: ");
        lblBytes.setBounds(30, 210, 200, 30);
        getContentPane().add(lblBytes);

        btnCalcular.addActionListener(e -> calcularCapacidad());
    }

    protected void calcularCapacidad() {
        double gigabytes = Double.parseDouble(txtGigabytes.getText());

        // Conversión
        double megabytes = gigabytes * 1024;
        double kilobytes = megabytes * 1024;
        double bytes = kilobytes * 1024;

        DecimalFormat df = new DecimalFormat("###,###.##");
        lblMegabytes.setText("Megabytes: " + df.format(megabytes));
        lblKilobytes.setText("Kilobytes: " + df.format(kilobytes));
        lblBytes.setText("Bytes: " + df.format(bytes));
    }
}
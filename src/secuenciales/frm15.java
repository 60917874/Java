package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.text.DecimalFormat;

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtJuan, txtRosa, txtDaniel, txtPJuan, txtPRosa, txtPDaniel, txtTotal;
    JLabel lblJuan, lblRosa, lblDaniellblTotal, lblPJuan, lblPRosa, lblPDaniel, lblTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm15 frame = new frm15();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblJuan = new JLabel("Aporte de Juan (USD):");
        lblJuan.setBounds(50, 20, 150, 30);
        getContentPane().add(lblJuan);

        JLabel lblRosa = new JLabel("Aporte de Rosa (USD):");
        lblRosa.setBounds(50, 60, 150, 30);
        getContentPane().add(lblRosa);

        JLabel lblDaniel = new JLabel("Aporte de Daniel (S/.):");
        lblDaniel.setBounds(50, 90, 150, 30);
        getContentPane().add(lblDaniel);

        JLabel lblPJuan = new JLabel("Porcentaje de Juan:");
        lblPJuan.setBounds(50, 120, 200, 30);
        getContentPane().add(lblPJuan);

        JLabel lblPRosa = new JLabel("Porcentaje de Rosa:");
        lblPRosa.setBounds(50, 150, 200, 30);
        getContentPane().add(lblPRosa);

        JLabel lblPDaniel = new JLabel("Porcentaje de Daniel:");
        lblPDaniel.setBounds(50, 180, 200, 30);
        getContentPane().add(lblPDaniel);

        JLabel lblTotal = new JLabel("Capital total en USD:");
        lblTotal.setBounds(50, 210, 200, 30);
        getContentPane().add(lblTotal);

        txtJuan = new JTextField();
        txtJuan.setBounds(220, 30, 60, 30);
        txtJuan.setHorizontalAlignment(SwingConstants.RIGHT);
        txtJuan.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtJuan);

        txtRosa = new JTextField();
        txtRosa.setBounds(220, 60, 60, 30);
        txtRosa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRosa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRosa);

        txtDaniel = new JTextField();
        txtDaniel.setBounds(220, 90, 60, 30);
        txtDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDaniel.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDaniel);

        txtPJuan = new JTextField();
        txtPJuan.setBounds(220, 120, 60, 30);
        txtPJuan.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPJuan.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPJuan);

        txtPRosa = new JTextField();
        txtPRosa.setBounds(220, 150, 60, 30);
        txtPRosa.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPRosa.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPRosa);

        txtPDaniel = new JTextField();
        txtPDaniel.setBounds(220, 180, 60, 30);
        txtPDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPDaniel.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPDaniel);

        txtTotal = new JTextField();
        txtTotal.setBounds(220, 210, 60, 30);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 260, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double aporteJuan = Double.parseDouble(txtJuan.getText());
        double aporteRosa = Double.parseDouble(txtRosa.getText());
        double aporteDaniel = Double.parseDouble(txtDaniel.getText()) / 3.00;

        double capitalTotal = aporteJuan + aporteRosa + aporteDaniel;

        double PJuan = (aporteJuan / capitalTotal) * 100;
        double PRosa = (aporteRosa / capitalTotal) * 100;
        double PDaniel = (aporteDaniel / capitalTotal) * 100;

        DecimalFormat df = new DecimalFormat("#.##");

        lblTotal.setText("Capital total: " + df.format(capitalTotal));
        lblPJuan.setText("Porcentaje Juan: " + df.format(PJuan) + "%");
        lblPRosa.setText("Porcentaje Rosa: " + df.format(PRosa) + "%");
        lblPDaniel.setText("Porcentaje Daniel: " + df.format(PDaniel) + "%");
    }
}
package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDonacion, txtCentroS, txtComedor, txtInversion;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm18 frame = new frm18();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm18() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDonacion = new JLabel("Donación:");
        lblDonacion.setBounds(30, 30, 150, 30);
        getContentPane().add(lblDonacion);

        txtDonacion = new JTextField();
        txtDonacion.setBounds(180, 30, 100, 30);
        txtDonacion.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDonacion);

        JLabel lblCentroS = new JLabel("Centro de Salud:");
        lblCentroS.setBounds(30, 80, 150, 30);
        getContentPane().add(lblCentroS);

        txtCentroS = new JTextField();
        txtCentroS.setBounds(180, 80, 100, 30);
        txtCentroS.setEditable(false);
        txtCentroS.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCentroS);

        JLabel lblComedor = new JLabel("Comedor:");
        lblComedor.setBounds(30, 130, 150, 30);
        getContentPane().add(lblComedor);

        txtComedor = new JTextField();
        txtComedor.setBounds(180, 130, 100, 30);
        txtComedor.setEditable(false);
        txtComedor.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtComedor);

        JLabel lblInversion = new JLabel("Inversión:");
        lblInversion.setBounds(30, 180, 150, 30);
        getContentPane().add(lblInversion);

        txtInversion = new JTextField();
        txtInversion.setBounds(180, 180, 100, 30);
        txtInversion.setEditable(false);
        txtInversion.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtInversion);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 230, 250, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double donacion = Double.parseDouble(txtDonacion.getText());
        double centroS;
        double comedor;
        double inversion;

        if (donacion >= 10000) {
            centroS = donacion * 0.30;
            comedor = donacion * 0.50;
            inversion = donacion - centroS - comedor;
        } else {
            centroS = donacion * 0.25;
            comedor = donacion * 0.60;
            inversion = donacion - centroS - comedor;
        }

        txtCentroS.setText(String.format("$ %.2f", centroS));
        txtComedor.setText(String.format("$ %.2f", comedor));
        txtInversion.setText(String.format("$ %.2f", inversion));
    }
}
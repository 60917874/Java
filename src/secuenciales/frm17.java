package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDonacion;
    JLabel lblCentroSalud, lblComedorInfantil, lblEscuelaInfantil, lblAsiloAncianos;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm17 frame = new frm17();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm17() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDonacion = new JLabel("Monto de la donación: ");
        lblDonacion.setBounds(50, 50, 150, 30);
        getContentPane().add(lblDonacion);

        lblCentroSalud = new JLabel("Centro de salud: ");
        lblCentroSalud.setBounds(50, 120, 200, 30);
        getContentPane().add(lblCentroSalud);

        lblComedorInfantil = new JLabel("Comedor infantil: ");
        lblComedorInfantil.setBounds(50, 150, 200, 30);
        getContentPane().add(lblComedorInfantil);

        lblEscuelaInfantil = new JLabel("Escuela infantil: ");
        lblEscuelaInfantil.setBounds(50, 180, 200, 30);
        getContentPane().add(lblEscuelaInfantil);

        lblAsiloAncianos = new JLabel("Asilo de ancianos: ");
        lblAsiloAncianos.setBounds(50, 210, 200, 30);
        getContentPane().add(lblAsiloAncianos);

        txtDonacion = new JTextField();
        txtDonacion.setBounds(220, 50, 100, 30);
        txtDonacion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDonacion.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDonacion);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 90, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int donacion = Integer.parseInt(txtDonacion.getText());

        int montoSalud = donacion * 25 / 100;
        int montoComedor = donacion * 35 / 100;
        int montoEscuela = donacion * 25 / 100;
        int montoAsilo = donacion - (montoSalud + montoComedor + montoEscuela);

        lblCentroSalud.setText("Centro de salud: " + montoSalud);
        lblComedorInfantil.setText("Comedor infantil: " + montoComedor);
        lblEscuelaInfantil.setText("Escuela infantil: " + montoEscuela);
        lblAsiloAncianos.setText("Asilo de ancianos: " + montoAsilo);
    }
}
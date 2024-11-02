package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtRadio, txtAltura, txtArea, txtVolumen;
    JLabel lblArea, lblVolumen;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm06 frame = new frm06();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm06() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblRadio = new JLabel("Radio (r):");
        lblRadio.setBounds(50, 20, 80, 25);
        getContentPane().add(lblRadio);

        JLabel lblAltura = new JLabel("Altura (h):");
        lblAltura.setBounds(50, 60, 80, 25);
        getContentPane().add(lblAltura);

        JLabel lblArea = new JLabel("Área: ");
        lblArea.setBounds(50, 100, 80, 25);
        getContentPane().add(lblArea);

        JLabel lblVolumen = new JLabel("Volumen: ");
        lblVolumen.setBounds(50, 130, 80, 25);
        getContentPane().add(lblVolumen);

        txtRadio = new JTextField();
        txtRadio.setBounds(130, 20, 100, 25);
        txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRadio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRadio);

        txtAltura = new JTextField();
        txtAltura.setBounds(130, 60, 100, 25);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        txtArea = new JTextField();
        txtArea.setBounds(130, 100, 100, 25);
        txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
        txtArea.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtArea);

        txtVolumen = new JTextField();
        txtVolumen.setBounds(130, 130, 100, 25);
        txtVolumen.setHorizontalAlignment(SwingConstants.RIGHT);
        txtVolumen.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtVolumen);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 180, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double r = Double.parseDouble(txtRadio.getText());
        double h = Double.parseDouble(txtAltura.getText());
        double area = 2 * Math.PI * r * (r + h);
        double volumen = Math.PI * r * r * h;

        DecimalFormat df = new DecimalFormat("###.##");
        lblArea.setText("Área: " + df.format(area));
        lblVolumen.setText("Volumen: " + df.format(volumen));
    }
}
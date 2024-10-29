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
    JTextField txtRadio, txtAltura;
    JLabel lblArea, lblVolumen;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm06 frame = new frm06();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm06() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblRadio = new JLabel("Radio (r):");
        lblRadio.setBounds(50, 30, 80, 30);
        getContentPane().add(lblRadio);

        txtRadio = new JTextField();
        txtRadio.setBounds(130, 30, 100, 30);
        txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRadio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRadio);

        JLabel lblAltura = new JLabel("Altura (h):");
        lblAltura.setBounds(50, 70, 80, 30);
        getContentPane().add(lblAltura);

        txtAltura = new JTextField();
        txtAltura.setBounds(130, 70, 100, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 110, 120, 30);
        getContentPane().add(btnCalcular);

        lblArea = new JLabel("Área: ");
        lblArea.setBounds(50, 150, 200, 30);
        getContentPane().add(lblArea);

        lblVolumen = new JLabel("Volumen: ");
        lblVolumen.setBounds(50, 180, 200, 30);
        getContentPane().add(lblVolumen);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double r = Double.parseDouble(txtRadio.getText());
        double h = Double.parseDouble(txtAltura.getText());
        double area = 2 * Math.PI * r * (r + h); // Área = 2πr(r+h)
        double volumen = Math.PI * r * r * h; // Volumen = πr²h

        DecimalFormat df = new DecimalFormat("###.##");
        lblArea.setText("Área: " + df.format(area));
        lblVolumen.setText("Volumen: " + df.format(volumen));
    }
}
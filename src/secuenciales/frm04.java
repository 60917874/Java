package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPies, txtPulgadas, txtMetros;
    JLabel lblMetros;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm04 frame = new frm04();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPies = new JLabel("Pies: ");
        lblPies.setBounds(30, 30, 80, 30);
        getContentPane().add(lblPies);

        JLabel lblPulgadas = new JLabel("Pulgadas: ");
        lblPulgadas.setBounds(30, 70, 80, 30);
        getContentPane().add(lblPulgadas);

        JLabel lblMetros = new JLabel("Metros: ");
        lblMetros.setBounds(30, 120, 80, 30);
        getContentPane().add(lblMetros);

        txtPies = new JTextField();
        txtPies.setBounds(130, 30, 100, 30);
        txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPies.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPies);

        txtPulgadas = new JTextField();
        txtPulgadas.setBounds(130, 70, 100, 30);
        txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPulgadas.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPulgadas);

        txtMetros = new JTextField();
        txtMetros.setBounds(130, 120, 100, 30);
        txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMetros.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMetros);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 170, 100, 30);
        btnCalcular.setMnemonic('C');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> calcular());
    }

    protected void calcular() {
        int pies = Integer.parseInt(txtPies.getText());
        int pulgadas = Integer.parseInt(txtPulgadas.getText());

        double totalMetros = (pies * 0.3048) + (pulgadas * 0.0254);

        DecimalFormat df = new DecimalFormat("###,###.##");
        lblMetros.setText("Metros: " + df.format(totalMetros));
    }
}
package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtRadio, txtAltura, txtAreaBase, txtAreaLateral, txtAreaTotal;
    JLabel lblAreaBase, lblAreaLateral, lblAreaTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm08 frame = new frm08();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblRadio = new JLabel("Radio:");
        lblRadio.setBounds(50, 20, 80, 30);
        getContentPane().add(lblRadio);

        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(50, 60, 80, 30);
        getContentPane().add(lblAltura);

        JLabel lblAreaBase = new JLabel("Área Base:");
        lblAreaBase.setBounds(50, 100, 80, 30);
        getContentPane().add(lblAreaBase);

        JLabel lblAreaLateral = new JLabel("Área Lateral:");
        lblAreaLateral.setBounds(50, 140, 80, 30);
        getContentPane().add(lblAreaLateral);

        JLabel lblAreaTotal = new JLabel("Área Total:");
        lblAreaTotal.setBounds(50, 180, 80, 30);
        getContentPane().add(lblAreaTotal);

        txtRadio = new JTextField();
        txtRadio.setBounds(130, 20, 60, 30);
        txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRadio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtRadio);

        txtAltura = new JTextField();
        txtAltura.setBounds(130, 60, 60, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        txtAreaBase = new JTextField();
        txtAreaBase.setBounds(130, 100, 60, 30);
        txtAreaBase.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAreaBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAreaBase);

        txtAreaLateral = new JTextField();
        txtAreaLateral.setBounds(130, 140, 60, 30);
        txtAreaLateral.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAreaLateral.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAreaLateral);

        txtAreaTotal = new JTextField();
        txtAreaTotal.setBounds(130, 180, 60, 30);
        txtAreaTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAreaTotal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAreaTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double radio = Double.parseDouble(txtRadio.getText());
        double altura = Double.parseDouble(txtAltura.getText());

        double areaBase = Math.PI * Math.pow(radio, 2);
        double areaLateral = 2 * Math.PI * radio * altura;
        double areaTotal = 2 * areaBase + areaLateral;

        DecimalFormat df = new DecimalFormat("###.##");
        lblAreaBase.setText("Área Base: " + df.format(areaBase));
        lblAreaLateral.setText("Área Lateral: " + df.format(areaLateral));
        lblAreaTotal.setText("Área Total: " + df.format(areaTotal));
    }
}
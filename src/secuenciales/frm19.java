package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtVendido, txtComision, txtSBruto, txtDescuento, txtSNeto;
    JLabel lblVendido, lblComision, lblSBruto, lblDescuento, lblSNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm19 frame = new frm19();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm19() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblVendido = new JLabel("Monto Vendido:");
        lblVendido.setBounds(50, 20, 100, 30);
        getContentPane().add(lblVendido);

        JLabel lblComision = new JLabel("Comisión:");
        lblComision.setBounds(50, 60, 200, 30);
        getContentPane().add(lblComision);

        JLabel lblSBruto = new JLabel("Sueldo Bruto:");
        lblSBruto.setBounds(50, 100, 200, 30);
        getContentPane().add(lblSBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 140, 200, 30);
        getContentPane().add(lblDescuento);

        JLabel lblSNeto = new JLabel("Sueldo Neto:");
        lblSNeto.setBounds(50, 180, 200, 30);
        getContentPane().add(lblSNeto);

        txtVendido = new JTextField();
        txtVendido.setBounds(160, 20, 60, 30);
        txtVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtVendido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtVendido);

        txtComision = new JTextField();
        txtComision.setBounds(160, 60, 60, 30);
        txtComision.setHorizontalAlignment(SwingConstants.RIGHT);
        txtComision.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtComision);

        txtSBruto = new JTextField();
        txtSBruto.setBounds(160, 100, 60, 30);
        txtSBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(160, 140, 60, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtSNeto = new JTextField();
        txtSNeto.setBounds(160, 180, 60, 30);
        txtSNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSNeto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSNeto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(140, 220, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int sueldobasico = 500;
        int vendido = Integer.parseInt(txtVendido.getText());

        int comision = (int) (vendido * 0.09);

        int sueldobruto = sueldobasico + comision;

        int descuento = (int) (sueldobruto * 0.11);

        int sueldoneto = sueldobruto - descuento;

        lblComision.setText("Comisión: " + comision);
        lblSBruto.setText("Sueldo Bruto: " + sueldobruto);
        lblDescuento.setText("Descuento: " + descuento);
        lblSNeto.setText("Sueldo Neto: " + sueldoneto);
    }
}
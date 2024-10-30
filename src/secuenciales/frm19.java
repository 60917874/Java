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
    JTextField txtVendido;
    JLabel lblComision, lblSBruto, lblDescuento, lblSNeto;

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

        JLabel lblMontoVendido = new JLabel("Monto Vendido:");
        lblMontoVendido.setBounds(50, 50, 100, 30);
        getContentPane().add(lblMontoVendido);

        lblComision = new JLabel("Comisión:");
        lblComision.setBounds(50, 90, 200, 30);
        getContentPane().add(lblComision);

        lblSBruto = new JLabel("Sueldo Bruto:");
        lblSBruto.setBounds(50, 130, 200, 30);
        getContentPane().add(lblSBruto);

        lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 170, 200, 30);
        getContentPane().add(lblDescuento);

        lblSNeto = new JLabel("Sueldo Neto:");
        lblSNeto.setBounds(50, 210, 200, 30);
        getContentPane().add(lblSNeto);

        txtVendido = new JTextField();
        txtVendido.setBounds(160, 50, 60, 30);
        txtVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtVendido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtVendido);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(230, 90, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int sueldobasico = 500;
        int vendido = Integer.parseInt(txtVendido.getText());

        int comision = (int)(vendido * 0.09);

        int sueldobruto = sueldobasico + comision;

        int descuento = (int)(sueldobruto * 0.11);

        int sueldoneto = sueldobruto - descuento;

        lblComision.setText("Comisión: " + comision);
        lblSBruto.setText("Sueldo Bruto: " + sueldobruto);
        lblDescuento.setText("Descuento: " + descuento);
        lblSNeto.setText("Sueldo Neto: " + sueldoneto);
    }
}
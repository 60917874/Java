package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtPrecioUnitario, txtImporte, txtDescuento, txtPagar;
    JLabel lblCantidad, lblPrecioUnitario, lblImporte, lblDescuento, lblPagar;

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

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(50, 20, 100, 30);
        getContentPane().add(lblCantidad);

        JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
        lblPrecioUnitario.setBounds(50, 60, 100, 30);
        getContentPane().add(lblPrecioUnitario);

        JLabel lblImporte = new JLabel("Importe de compra:");
        lblImporte.setBounds(50, 100, 200, 30);
        getContentPane().add(lblImporte);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 140, 200, 30);
        getContentPane().add(lblDescuento);

        JLabel lblPagar = new JLabel("Importe a Pagar:");
        lblPagar.setBounds(50, 180, 200, 30);
        getContentPane().add(lblPagar);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(160, 20, 60, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        txtPrecioUnitario = new JTextField();
        txtPrecioUnitario.setBounds(160, 60, 60, 30);
        txtPrecioUnitario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrecioUnitario.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrecioUnitario);

        txtImporte = new JTextField();
        txtImporte.setBounds(160, 100, 60, 30);
        txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImporte.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImporte);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(160, 140, 60, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtPagar = new JTextField();
        txtPagar.setBounds(160, 180, 60, 30);
        txtPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPagar.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(160, 220, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());
        int precioUnitario = Integer.parseInt(txtPrecioUnitario.getText());

        double importe = cantidad * precioUnitario;

        double primerdescuento = importe * 0.15;
        double importeConDescuento1 = importe - primerdescuento;
        double segundodescuento = importeConDescuento1 * 0.15;
        double pagar = importeConDescuento1 - segundodescuento;

        lblImporte.setText("Importe de compra: " + importe);
        lblDescuento.setText("Descuento: " + (primerdescuento + segundodescuento));
        lblPagar.setText("Pagar: " + pagar);
    }
}
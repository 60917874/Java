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
    JTextField txtCantidad, txtPrecioUnitario;
    JLabel lblImporte, lblDescuento, lblPagar;

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
        lblCantidad.setBounds(50, 50, 100, 30);
        getContentPane().add(lblCantidad);

        JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
        lblPrecioUnitario.setBounds(50, 90, 100, 30);
        getContentPane().add(lblPrecioUnitario);

        lblImporte = new JLabel("Importe de la compra:");
        lblImporte.setBounds(50, 130, 200, 30);
        getContentPane().add(lblImporte);

        lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 160, 200, 30);
        getContentPane().add(lblDescuento);

        lblPagar = new JLabel("Importe a Pagar:");
        lblPagar.setBounds(50, 190, 200, 30);
        getContentPane().add(lblPagar);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(160, 50, 60, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        txtPrecioUnitario = new JTextField();
        txtPrecioUnitario.setBounds(160, 90, 60, 30);
        txtPrecioUnitario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrecioUnitario.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrecioUnitario);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(230, 130, 100, 30);
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
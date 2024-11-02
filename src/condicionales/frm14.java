package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtTarjeta, txtMonto, txtDescuento, txtTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm14 frame = new frm14();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblTarjeta = new JLabel("Número de Tarjeta:");
        lblTarjeta.setBounds(30, 30, 150, 30);
        getContentPane().add(lblTarjeta);

        txtTarjeta = new JTextField();
        txtTarjeta.setBounds(180, 30, 100, 30);
        txtTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTarjeta);

        JLabel lblMonto = new JLabel("Monto de Compra:");
        lblMonto.setBounds(30, 80, 150, 30);
        getContentPane().add(lblMonto);

        txtMonto = new JTextField();
        txtMonto.setBounds(180, 80, 100, 30);
        txtMonto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMonto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(30, 130, 150, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 130, 100, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDescuento);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(30, 180, 150, 30);
        getContentPane().add(lblTotal);

        txtTotal = new JTextField();
        txtTotal.setBounds(180, 180, 100, 30);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(180, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int tarjeta = Integer.parseInt(txtTarjeta.getText());
        double monto = Double.parseDouble(txtMonto.getText());
        double descuento;

        if (tarjeta >= 100 && tarjeta % 2 == 0) {
            descuento = 0.15 * monto;
        } else {
            descuento = 0.05 * monto;
        }

        double paga = monto - descuento;

        txtDescuento.setText(String.format("S/ %.2f", descuento));
        txtTotal.setText(String.format("S/ %.2f", paga));
    }
}
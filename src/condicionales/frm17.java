package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDocenas, txtCompra, txtDescuento, txtTotal, txtLapiceros;
    JLabel lblDocenas, lblCompra, lblDescuento, lblTotal;

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
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDocenas = new JLabel("Docenas:");
        lblDocenas.setBounds(30, 30, 150, 30);
        getContentPane().add(lblDocenas);

        txtDocenas = new JTextField();
        txtDocenas.setBounds(180, 30, 80, 30);
        txtDocenas.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDocenas);

        JLabel lblCompra = new JLabel("Compra:");
        lblCompra.setBounds(30, 80, 150, 30);
        getContentPane().add(lblCompra);

        txtCompra = new JTextField();
        txtCompra.setBounds(180, 80, 80, 30);
        txtCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(30, 130, 150, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 130, 80, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDescuento);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(30, 180, 150, 30);
        getContentPane().add(lblTotal);

        txtTotal = new JTextField();
        txtTotal.setBounds(180, 180, 80, 30);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTotal);

        JLabel lblLapiceros = new JLabel("Obsequio:");
        lblLapiceros.setBounds(30, 230, 150, 30);
        getContentPane().add(lblLapiceros);

        txtLapiceros = new JTextField();
        txtLapiceros.setBounds(180, 230, 80, 30);
        txtLapiceros.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtLapiceros);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(180, 280, 90, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double precio = 20;
        int cantidad = Integer.parseInt(txtDocenas.getText());
        double compra = cantidad * precio;
        double descuento;
        double total;
        int lapiceros;

        if (cantidad >= 6) {
            descuento = compra * 0.15;
        } else {
            descuento = compra * 0.10;
        }

        total = compra - descuento;

        if (cantidad >= 30) {
            lapiceros = (cantidad / 3) * 2;
        } else {
            lapiceros = 0;
        }

        txtCompra.setText(String.format("S/ %.2f", compra));
        txtDescuento.setText(String.format("S/ %.2f", descuento));
        txtTotal.setText(String.format("S/ %.2f", total));
        txtLapiceros.setText(String.valueOf(lapiceros));
    }
}
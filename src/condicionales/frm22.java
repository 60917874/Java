package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm22 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtUnidadesA, txtUnidadesB, txtCompraA, txtCompraB, txtDescuento, txtTotal;
    JLabel lblUnidadesA, lblUnidadesB, lblCompraA, lblCompraB, lblDescuento, lblTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm22 frame = new frm22();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm22() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblUnidadesA = new JLabel("Unidades A:");
        lblUnidadesA.setBounds(50, 30, 100, 30);
        getContentPane().add(lblUnidadesA);

        JLabel lblUnidadesB = new JLabel("Unidades B:");
        lblUnidadesB.setBounds(50, 70, 100, 30);
        getContentPane().add(lblUnidadesB);

        JLabel lblCompraA = new JLabel("Compra A:");
        lblCompraA.setBounds(50, 110, 100, 30);
        getContentPane().add(lblCompraA);

        JLabel lblCompraB = new JLabel("Compra B:");
        lblCompraB.setBounds(50, 150, 100, 30);
        getContentPane().add(lblCompraB);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 190, 100, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(50, 230, 100, 30);
        getContentPane().add(lblTotal);

        txtUnidadesA = new JTextField();
        txtUnidadesA.setBounds(150, 30, 80, 30);
        txtUnidadesA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUnidadesA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtUnidadesA);

        txtUnidadesB = new JTextField();
        txtUnidadesB.setBounds(150, 70, 80, 30);
        txtUnidadesB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtUnidadesB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtUnidadesB);

        txtCompraA = new JTextField();
        txtCompraA.setBounds(150, 110, 80, 30);
        txtCompraA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCompraA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCompraA);

        txtCompraB = new JTextField();
        txtCompraB.setBounds(150, 150, 80, 30);
        txtCompraB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCompraB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCompraB);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(150, 190, 80, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtTotal = new JTextField();
        txtTotal.setBounds(150, 230, 80, 30);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 270, 90, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int unidadesA = Integer.parseInt(txtUnidadesA.getText());
        int unidadesB = Integer.parseInt(txtUnidadesB.getText());

        double precioA = 25.0;
        double precioB = 30.0;
        double compraA = unidadesA * precioA;
        double compraB = unidadesB * precioB;

        double descuentoA = 0.0;
        double descuentoB = 0.0;

        if (unidadesA > 50) {
            descuentoA = compraA * 0.15;
        }

        if (unidadesB > 60) {
            descuentoB = compraB * 0.10;
        }

        double paga = (compraA - descuentoA) + (compraB - descuentoB);

        txtCompraA.setText(String.format("S/ %.2f", compraA));
        txtCompraB.setText(String.format("S/ %.2f", compraB));
        txtDescuento.setText(String.format("S/ %.2f", (descuentoA + descuentoB)));
        txtTotal.setText(String.format("S/ %.2f", paga));
    }
}
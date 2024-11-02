package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm02 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtUnidades, txtImporte, txtDescuento, txtTotal, txtCaramelos;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm02 frame = new frm02();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm02() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblUnidades = new JLabel("Unidades:");
        lblUnidades.setBounds(50, 50, 100, 30);
        getContentPane().add(lblUnidades);

        txtUnidades = new JTextField();
        txtUnidades.setBounds(150, 50, 100, 30);
        txtUnidades.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtUnidades);

        JLabel lblImporte = new JLabel("Importe:");
        lblImporte.setBounds(50, 100, 100, 30);
        getContentPane().add(lblImporte);

        txtImporte = new JTextField();
        txtImporte.setFocusable(false);
        txtImporte.setBounds(150, 100, 100, 30);
        getContentPane().add(txtImporte);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 100, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setFocusable(false);
        txtDescuento.setBounds(150, 150, 100, 30);
        getContentPane().add(txtDescuento);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(50, 200, 100, 30);
        getContentPane().add(lblTotal);

        txtTotal = new JTextField();
        txtTotal.setFocusable(false);
        txtTotal.setBounds(150, 200, 100, 30);
        getContentPane().add(txtTotal);

        JLabel lblCaramelos = new JLabel("Caramelos:");
        lblCaramelos.setBounds(50, 250, 100, 30);
        getContentPane().add(lblCaramelos);

        txtCaramelos = new JTextField();
        txtCaramelos.setFocusable(false);
        txtCaramelos.setBounds(150, 250, 100, 30);
        getContentPane().add(txtCaramelos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 300, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int unidades = Integer.parseInt(txtUnidades.getText());
        double precioUnitario = 20.0;
        double importe = unidades * precioUnitario;
        double descuento;
        int caramelos;

        if (importe > 700) {
            descuento = importe * 0.16;
            caramelos = 5;
        } else if (importe > 500) {
            descuento = importe * 0.14;
            caramelos = 10;
        } else {
            descuento = importe * 0.12;
            caramelos = 15;
        }

        double total = importe - descuento;

        txtImporte.setText(String.valueOf(importe));
        txtDescuento.setText(String.valueOf(descuento));
        txtTotal.setText(String.valueOf(total));
        txtCaramelos.setText(String.valueOf(caramelos));
    }
}
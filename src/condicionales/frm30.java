package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm30 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCuota, txtPago, txtTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm30 frame = new frm30();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm30() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCuota = new JLabel("Cuota mensual:");
        lblCuota.setBounds(30, 30, 120, 30);
        getContentPane().add(lblCuota);

        JLabel lblPago = new JLabel("Día de pago:");
        lblPago.setBounds(30, 80, 120, 30);
        getContentPane().add(lblPago);

        JLabel lblTotal = new JLabel("Total a pagar:");
        lblTotal.setBounds(30, 130, 120, 30);
        getContentPane().add(lblTotal);

        txtCuota = new JTextField();
        txtCuota.setBounds(160, 30, 100, 30);
        txtCuota.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCuota);

        txtPago = new JTextField();
        txtPago.setBounds(160, 80, 100, 30);
        txtPago.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPago);

        txtTotal = new JTextField();
        txtTotal.setBounds(160, 130, 100, 30);
        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 180, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double mensual = Double.parseDouble(txtCuota.getText());
        int pago = Integer.parseInt(txtPago.getText());
        double total;

        if (pago <= 10) {
            double descuento = (0.02 * mensual > 5) ? 0.02 * mensual : 5;
            total = mensual - descuento;
        } else if (pago <= 20) {
            total = mensual;
        } else {
            double recargo = (0.03 * mensual > 10) ? 0.03 * mensual : 10;
            total = mensual + recargo;
        }

        txtTotal.setText(String.format("%.2f", total));
    }
}
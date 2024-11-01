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

public class frm29 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHoras, txtPagoHora, txtSBruto, txtDescuento, txtTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm29 frame = new frm29();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm29() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHoras = new JLabel("Horas trabajadas:");
        lblHoras.setBounds(30, 30, 120, 30);
        getContentPane().add(lblHoras);

        JLabel lblPagoHora = new JLabel("Pago por hora:");
        lblPagoHora.setBounds(30, 80, 120, 30);
        getContentPane().add(lblPagoHora);

        JLabel lblSBruto = new JLabel("Sueldo bruto:");
        lblSBruto.setBounds(30, 130, 120, 30);
        getContentPane().add(lblSBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(30, 180, 120, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotal = new JLabel("Total");
        lblTotal.setBounds(30, 230, 120, 30);
        getContentPane().add(lblTotal);

        txtHoras = new JTextField();
        txtHoras.setBounds(160, 30, 100, 30);
        txtHoras.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtHoras);

        txtPagoHora = new JTextField();
        txtPagoHora.setBounds(160, 80, 100, 30);
        txtPagoHora.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPagoHora);

        txtSBruto = new JTextField();
        txtSBruto.setBounds(160, 130, 100, 30);
        txtSBruto.setEditable(false);
        txtSBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(160, 180, 100, 30);
        txtDescuento.setEditable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDescuento);

        txtTotal = new JTextField();
        txtTotal.setBounds(160, 230, 100, 30);
        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 280, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int horasTrabajadas = Integer.parseInt(txtHoras.getText());
        double hora = Double.parseDouble(txtPagoHora.getText());

        double bruto;
        if (horasTrabajadas <= 48) {
            bruto = horasTrabajadas * hora;
        } else {
            int extras = horasTrabajadas - 48;
            bruto = (48 * hora) + (extras * hora * 1.2);
        }

        double descuento = (bruto > 1500) ? bruto * 0.11 : 0;
        double total = bruto - descuento;

        txtSBruto.setText(String.format("%.2f", bruto));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtTotal.setText(String.format("%.2f", total));
    }
}
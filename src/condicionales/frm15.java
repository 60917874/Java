package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtVendido, txtComision, txtSBruto, txtDescuento, txtSNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm15 frame = new frm15();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblVendido = new JLabel("Monto Vendido:");
        lblVendido.setBounds(30, 30, 150, 30);
        getContentPane().add(lblVendido);

        txtVendido = new JTextField();
        txtVendido.setBounds(180, 30, 100, 30);
        txtVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtVendido);

        JLabel lblComision = new JLabel("Comisión:");
        lblComision.setBounds(30, 80, 150, 30);
        getContentPane().add(lblComision);

        txtComision = new JTextField();
        txtComision.setBounds(180, 80, 100, 30);
        txtComision.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtComision);

        JLabel lblSBruto = new JLabel("Sueldo Bruto:");
        lblSBruto.setBounds(30, 130, 150, 30);
        getContentPane().add(lblSBruto);

        txtSBruto = new JTextField();
        txtSBruto.setBounds(180, 130, 100, 30);
        txtSBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(30, 180, 150, 30);
        getContentPane().add(lblDescuento);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 180, 100, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDescuento);

        JLabel lblSNeto = new JLabel("Sueldo Neto:");
        lblSNeto.setBounds(30, 230, 150, 30);
        getContentPane().add(lblSNeto);

        txtSNeto = new JTextField();
        txtSNeto.setBounds(180, 230, 100, 30);
        txtSNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSNeto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(180, 270, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double sueldo = 250;
        double monto;

        try {
            monto = Double.parseDouble(txtVendido.getText());
            double comision;
            double sueldoBruto;
            double descuento;
            double sueldoNeto;

            if (monto <= 5000) {
                comision = 0.05 * monto;
            } else if (monto <= 10000) {
                comision = 0.08 * monto;
            } else if (monto <= 20000) {
                comision = 0.10 * monto;
            } else {
                comision = 0.15 * monto;
            }

            sueldoBruto = sueldo + comision;

            if (sueldoBruto > 3500) {
                descuento = 0.15 * sueldoBruto;
            } else {
                descuento = 0.08 * sueldoBruto;
            }

            sueldoNeto = sueldoBruto - descuento;

            txtComision.setText(String.format("S/ %.2f", comision));
            txtSBruto.setText(String.format("S/ %.2f", sueldoBruto));
            txtDescuento.setText(String.format("S/ %.2f", descuento));
            txtSNeto.setText(String.format("S/ %.2f", sueldoNeto));

        } catch (NumberFormatException e) {
            txtComision.setText("Error");
            txtSBruto.setText("Error");
            txtDescuento.setText("Error");
            txtSNeto.setText("Error");
        }
    }
}
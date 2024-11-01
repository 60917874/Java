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

public class frm27 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtVendido, txtSBruto, txtDescuento, txtSNeto, txtPolos;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm27 frame = new frm27();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm27() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblVendido = new JLabel("Vendido:");
        lblVendido.setBounds(50, 30, 120, 30);
        getContentPane().add(lblVendido);

        JLabel lblSBruto = new JLabel("Sueldo Bruto:");
        lblSBruto.setBounds(50, 80, 120, 30);
        getContentPane().add(lblSBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 130, 120, 30);
        getContentPane().add(lblDescuento);

        JLabel lblSNeto = new JLabel("Sueldo Neto:");
        lblSNeto.setBounds(50, 180, 120, 30);
        getContentPane().add(lblSNeto);

        JLabel lblPolos = new JLabel("Número de Polos:");
        lblPolos.setBounds(50, 230, 120, 30);
        getContentPane().add(lblPolos);

        txtVendido = new JTextField();
        txtVendido.setBounds(150, 30, 100, 30);
        txtVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtVendido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtVendido);

        txtSBruto = new JTextField();
        txtSBruto.setBounds(150, 80, 100, 30);
        txtSBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSBruto.setMargin(new Insets(5, 5, 5, 5));
        txtSBruto.setEditable(false);
        getContentPane().add(txtSBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(150, 130, 100, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        txtDescuento.setEditable(false);
        getContentPane().add(txtDescuento);

        txtSNeto = new JTextField();
        txtSNeto.setBounds(150, 180, 100, 30);
        txtSNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSNeto.setMargin(new Insets(5, 5, 5, 5));
        txtSNeto.setEditable(false);
        getContentPane().add(txtSNeto);

        txtPolos = new JTextField();
        txtPolos.setBounds(150, 230, 100, 30);
        txtPolos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPolos.setMargin(new Insets(5, 5, 5, 5));
        txtPolos.setEditable(false);
        getContentPane().add(txtPolos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 260, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double vendido = Double.parseDouble(txtMontoVendido.getText());
        double basico = 600;
        double comision = vendido * 0.15;
        double bruto = basico + comision;
        double porcentaje;
        
        if (bruto > 1800) {
            porcentaje = 0.10;
        } else {
            porcentaje = 0.05;
        }

        double descuento = bruto * porcentaje;
        double neto = bruto - descuento;
        int polos = (vendido > 1000) ? 3 : 1;

        txtSBruto.setText(String.format("S/ %.2f", bruto));
        txtDescuento.setText(String.format("S/ %.2f", descuento));
        txtSNeto.setText(String.format("S/ %.2f", neto));
        txtPolos.setText(String.valueOf(polos));
    }
}
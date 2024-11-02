package condicionales;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtIngreso, txtCosto, txtInicial, txtMensual;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm16 frame = new frm16();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm16() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblIngreso = new JLabel("Ingreso Mensual:");
        lblIngreso.setBounds(30, 30, 150, 30);
        getContentPane().add(lblIngreso);

        txtIngreso = new JTextField();
        txtIngreso.setBounds(180, 30, 80, 30);
        txtIngreso.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtIngreso);

        JLabel lblCosto = new JLabel("Costo de la Casa:");
        lblCosto.setBounds(30, 80, 150, 30);
        getContentPane().add(lblCosto);

        txtCosto = new JTextField();
        txtCosto.setBounds(180, 80, 80, 30);
        txtCosto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCosto);

        JLabel lblInicial = new JLabel("Cuota Inicial:");
        lblInicial.setBounds(30, 130, 150, 30);
        getContentPane().add(lblInicial);

        txtInicial = new JTextField();
        txtInicial.setBounds(180, 130, 80, 30);
        txtInicial.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtInicial);

        JLabel lblMensual = new JLabel("Cuota Mensual:");
        lblMensual.setBounds(30, 180, 150, 30);
        getContentPane().add(lblMensual);

        txtMensual = new JTextField();
        txtMensual.setBounds(180, 180, 80, 30);
        txtMensual.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMensual);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(180, 230, 90, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double Ingreso = Double.parseDouble(txtIngreso.getText());
        double costo = Double.parseDouble(txtCosto.getText());
        double inicial;
        double mensual;

        if (Ingreso < 1250) {
            inicial = costo * 0.15;
            mensual = (costo - inicial) / 120;
        } else {
            inicial = costo * 0.30;
            mensual = (costo - inicial) / 75;
        }

        txtInicial.setText(String.format("S/ %.2f", inicial));
        txtMensual.setText(String.format("S/ %.2f", mensual));
    }
}
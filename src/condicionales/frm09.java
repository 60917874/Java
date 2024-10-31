package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCodigo, txtUnidades, txtTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm09 frame = new frm09();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm09() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(50, 50, 100, 30);
        getContentPane().add(lblCodigo);

        JLabel lblUnidades = new JLabel("Unidades:");
        lblUnidades.setBounds(50, 90, 100, 30);
        getContentPane().add(lblUnidades);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(50, 130, 100, 30);
        getContentPane().add(lblTotal);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(150, 50, 80, 30);
        txtCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCodigo);

        txtUnidades = new JTextField();
        txtUnidades.setBounds(150, 90, 80, 30);
        txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtUnidades);

        txtTotal = new JTextField();
        txtTotal.setBounds(150, 130, 80, 30);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotal.setEditable(false);
        getContentPane().add(txtTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 180, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int codigo = Integer.parseInt(txtCodigo.getText());
        int unidades = Integer.parseInt(txtUnidades.getText());
        double precio = 0;
        double descuento = 0;

        if (codigo == 101) {
            precio = 17;
            if (unidades >= 1 && unidades <= 10) {
                descuento = 0.05;
            }
        } else if (codigo == 102) {
            precio = 25;
            if (unidades >= 11 && unidades <= 20) {
                descuento = 0.08;
            }
        } else if (codigo == 103) {
            precio = 16;
            if (unidades >= 21 && unidades <= 30) {
                descuento = 0.10;
            }
        } else if (codigo == 104) {
            precio = 27;
            if (unidades >= 31) {
                descuento = 0.13;
            }
        }

        double compra = precio * unidades;
        double totalDescuento = compra * descuento;
        double totalCompra = compra - totalDescuento;

        txtTotal.setText("S/ " + totalCompra);
    }
}
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

public class frm24 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtVendido, txtSueldo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm24 frame = new frm24();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm24() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblVendido = new JLabel("Monto Vendido:");
        lblVendido.setBounds(50, 30, 120, 30);
        getContentPane().add(lblVendido);

        JLabel lblSueldo = new JLabel("Sueldo:");
        lblSueldo.setBounds(50, 80, 120, 30);
        getContentPane().add(lblSueldo);

        txtVendido = new JTextField();
        txtVendido.setBounds(150, 30, 100, 30);
        txtVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        txtVendido.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtVendido);

        txtSueldo = new JTextField();
        txtSueldo.setBounds(150, 80, 100, 30);
        txtSueldo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldo.setMargin(new Insets(5, 5, 5, 5));
        txtSueldo.setEditable(false);
        getContentPane().add(txtSueldo);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 130, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double vendido = Double.parseDouble(txtvendido.getText());
        
        double sueldoInicial = vendido * 0.10;
        double sueldoAdicional = 0;

        if (vendido > 5000) {
            double exceso = vendido - 5000;
            sueldoAdicional = (exceso / 500) * 25;
        }

        double sueldoTotal = sueldoInicial + sueldoAdicional;
        
        txtSueldo.setText(String.format("S/ %.2f", sueldoTotal));
    }
}
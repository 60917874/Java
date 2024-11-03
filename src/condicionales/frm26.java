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

public class frm26 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtTotal, txtPrestamo, txtInteres, txtDinero;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm26 frame = new frm26();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm26() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(50, 30, 120, 30);
        getContentPane().add(lblTotal);

        JLabel lblPrestamo = new JLabel("Préstamo:");
        lblPrestamo.setBounds(50, 80, 120, 30);
        getContentPane().add(lblPrestamo);

        JLabel lblInteres = new JLabel("Interés:");
        lblInteres.setBounds(50, 130, 120, 30);
        getContentPane().add(lblInteres);

        JLabel lblDinero = new JLabel("Dinero:");
        lblDinero.setBounds(50, 180, 120, 30);
        getContentPane().add(lblDinero);

        txtTotal = new JTextField();
        txtTotal.setBounds(150, 30, 80, 30);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTotal);

        txtPrestamo = new JTextField();
        txtPrestamo.setBounds(150, 80, 80, 30);
        txtPrestamo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrestamo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrestamo);

        txtInteres = new JTextField();
        txtInteres.setBounds(150, 130, 80, 30);
        txtInteres.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInteres.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInteres);

        txtDinero = new JTextField();
        txtDinero.setBounds(150, 180, 80, 30);
        txtDinero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDinero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDinero);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double total = Double.parseDouble(txtTotal.getText());
        double porcentaje;

        if (total > 5000) {
            porcentaje = 0.30;
        } else {
            porcentaje = 0.20;
        }

        double prestamo = total * porcentaje;
        double interes = prestamo * 0.10;
        double paga = prestamo + interes;
        double dinero = total - prestamo;

        txtPrestamo.setText(String.format("S/ %.2f", paga));
        txtInteres.setText(String.format("S/ %.2f", interes));
        txtDinero.setText(String.format("S/ %.2f", dinero));
    }
}
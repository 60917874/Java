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

public class frm33 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtTardanza, txtObservaciones, txtPuntualidad, txtRendimiento, txtTotal, txtBonificacion;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm33 frame = new frm33();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm33() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblTardanza = new JLabel("Tardanza:");
        lblTardanza.setBounds(50, 50, 120, 30);
        getContentPane().add(lblTardanza);

        JLabel lblObservaciones = new JLabel("Observaciones:");
        lblObservaciones.setBounds(50, 90, 120, 30);
        getContentPane().add(lblObservaciones);

        JLabel lblPuntualidad = new JLabel("Puntualidad:");
        lblPuntualidad.setBounds(50, 170, 150, 30);
        getContentPane().add(lblPuntualidad);

        JLabel lblRendimiento = new JLabel("Rendimiento:");
        lblRendimiento.setBounds(50, 210, 150, 30);
        getContentPane().add(lblRendimiento);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(50, 250, 150, 30);
        getContentPane().add(lblTotal);

        JLabel lblBonificacion = new JLabel("Bonificación:");
        lblBonificacion.setBounds(50, 290, 150, 30);
        getContentPane().add(lblBonificacion);

        txtTardanza = new JTextField();
        txtTardanza.setBounds(180, 50, 60, 30);
        txtTardanza.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTardanza.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTardanza);

        txtObservaciones = new JTextField();
        txtObservaciones.setBounds(180, 90, 60, 30);
        txtObservaciones.setHorizontalAlignment(SwingConstants.RIGHT);
        txtObservaciones.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtObservaciones);

        txtPuntualidad = new JTextField();
        txtPuntualidad.setBounds(180, 170, 60, 30);
        txtPuntualidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPuntualidad.setMargin(new Insets(5, 5, 5, 5));
        txtPuntualidad.setEditable(false);
        getContentPane().add(txtPuntualidad);

        txtRendimiento = new JTextField();
        txtRendimiento.setBounds(180, 210, 60, 30);
        txtRendimiento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRendimiento.setMargin(new Insets(5, 5, 5, 5));
        txtRendimiento.setEditable(false);
        getContentPane().add(txtRendimiento);

        txtTotal = new JTextField();
        txtTotal.setBounds(180, 250, 60, 30);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotal.setMargin(new Insets(5, 5, 5, 5));
        txtTotal.setEditable(false);
        getContentPane().add(txtTotal);

        txtBonificacion = new JTextField();
        txtBonificacion.setBounds(180, 290, 60, 30);
        txtBonificacion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBonificacion.setMargin(new Insets(5, 5, 5, 5));
        txtBonificacion.setEditable(false);
        getContentPane().add(txtBonificacion);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 130, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int tardanza = Integer.parseInt(txtTardanza.getText());
        int observaciones = Integer.parseInt(txtObservaciones.getText());
        int puntualidadPuntualidad = 0;
        int puntualidadRendimiento = 0;
        double bonificacion = 0;

        if (tardanza == 0) {
            puntualidad = 10;
        } else if (tardanza >= 1 && tardanza <= 2) {
            puntualidad = 8;
        } else if (tardanza >= 3 && tardanza <= 5) {
            puntualidad = 6;
        } else if (tardanza >= 6 && tardanza <= 9) {
            puntualidad = 4;
        } else {
            puntualidad = 0;
        }

        if (observaciones == 0) {
            rendimiento = 10;
        } else if (observaciones == 1) {
            rendimiento = 8;
        } else if (observaciones == 2) {
            rendimiento = 5;
        } else if (observaciones == 3) {
            rendimiento = 1;
        } else {
            rendimiento = 0;
        }

        int total = puntualidad+ rendimiento;

        if (total < 11) {
            bonificacion = 2.5 * total;
        } else if (total >= 11 && total <= 13) {
            bonificacion = 5.0 * total;
        } else if (total >= 14 && total <= 16) {
            bonificacion = 7.5 * total;
        } else if (total >= 17 && total <= 19) {
            bonificacion = 10.0 * total;
        } else {
            bonificacion = 12.5 * total;
        }

        txtPuntualidad.setText(String.valueOf(puntualidad));
        txtRendimiento.setText(String.valueOf(rendimiento));
        txtTotal.setText(String.valueOf(total));
        txtBonificacion.setText(String.format("S/ %.2f", bonificacion));
    }
}
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

public class frm25 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtSBruto, txtNumeroH, txtBonificacion, txtSNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm25 frame = new frm25();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm25() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSBruto = new JLabel("Sueldo Bruto:");
        lblSBruto.setBounds(50, 30, 120, 30);
        getContentPane().add(lblSBruto);

        JLabel lblNumeroH = new JLabel("Numero de Hijos:");
        lblNumeroH.setBounds(50, 80, 120, 30);
        getContentPane().add(lblNumeroH);

        JLabel lblBonificacion = new JLabel("Bonificación:");
        lblBonificacion.setBounds(50, 130, 120, 30);
        getContentPane().add(lblBonificacion);

        JLabel lblSNeto = new JLabel("Sueldo Neto:");
        lblSNeto.setBounds(50, 180, 120, 30);
        getContentPane().add(lblSNeto);

        txtSBruto = new JTextField();
        txtSBruto.setBounds(150, 30, 100, 30);
        txtSBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSBruto);

        txtNumeroH = new JTextField();
        txtNumeroH.setBounds(150, 80, 100, 30);
        txtNumeroH.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeroH.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumeroH);

        txtBonificacion = new JTextField();
        txtBonificacion.setBounds(150, 130, 100, 30);
        txtBonificacion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBonificacion.setMargin(new Insets(5, 5, 5, 5));
        txtBonificacion.setEditable(false);
        getContentPane().add(txtBonificacion);

        txtSNeto = new JTextField();
        txtSNeto.setBounds(150, 180, 100, 30);
        txtSNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSNeto.setMargin(new Insets(5, 5, 5, 5));
        txtSNeto.setEditable(false);
        getContentPane().add(txtSNeto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 220, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double bruto = Double.parseDouble(txtSBruto.getText());
        int hijos = Integer.parseInt(txtNumeroH.getText());

        double bonificacion;
        if (hijos > 1) {
            bonificacion = (bruto * 0.125) + (hijos * 40);
        } else {
            bonificacion = bruto * 0.10;
        }

        double neto = bruto + bonificacion;

        txtBonificacion.setText(String.format("S/ %.2f", bonificacion));
        txtSNeto.setText(String.format("S/ %.2f", neto));
    }
}
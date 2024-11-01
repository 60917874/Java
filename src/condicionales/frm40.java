package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm40 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPrimeraPC, txtSegundaPC, txtTerceraPC, txtEP, txtEF, txtPromedio, txtCondicion;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm40 frame = new frm40();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm40() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPrimeraPC = new JLabel("Primera Práctica:");
        lblPrimeraPC.setBounds(30, 30, 120, 30);
        getContentPane().add(lblPrimeraPC);

        JLabel lblSegundaPC = new JLabel("Segunda Práctica:");
        lblSegundaPC.setBounds(30, 70, 120, 30);
        getContentPane().add(lblSegundaPC);

        JLabel lblTerceraPC = new JLabel("Tercera Práctica:");
        lblTerceraPC.setBounds(30, 110, 120, 30);
        getContentPane().add(lblTerceraPC);

        JLabel lblEP = new JLabel("Examen Parcial:");
        lblEP.setBounds(30, 150, 120, 30);
        getContentPane().add(lblEP);

        JLabel lblEF = new JLabel("Examen Final:");
        lblEF.setBounds(30, 190, 120, 30);
        getContentPane().add(lblEF);

        JLabel lblPromedio = new JLabel("Promedio Final:");
        lblPromedio.setBounds(30, 230, 120, 30);
        getContentPane().add(lblPromedio);

        JLabel lblCondicion = new JLabel("Condición:");
        lblCondicion.setBounds(30, 270, 120, 30);
        getContentPane().add(lblCondicion);

        txtPrimeraPC = new JTextField();
        txtPrimeraPC.setBounds(150, 30, 60, 30);
        txtPrimeraPC.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPrimeraPC);

        txtSegundaPC = new JTextField();
        txtSegundaPC.setBounds(150, 70, 60, 30);
        txtSegundaPC.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSegundaPC);

        txtTerceraPC = new JTextField();
        txtTerceraPC.setBounds(150, 110, 60, 30);
        txtTerceraPC.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTerceraPC);

        txtEP = new JTextField();
        txtEP.setBounds(150, 150, 60, 30);
        txtEP.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtEP);

        txtEF = new JTextField();
        txtEF.setBounds(150, 190, 60, 30);
        txtEF.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtEF);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(150, 230, 60, 30);
        txtPromedio.setEditable(false);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPromedio);

        txtCondicion = new JTextField();
        txtCondicion.setBounds(150, 270, 100, 30);
        txtCondicion.setEditable(false);
        getContentPane().add(txtCondicion);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(230, 200, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPromedio();
            }
        });
    }

    protected void calcularPromedio() {
        double primeraPC = Double.parseDouble(txtPrimeraPC.getText());
        double segundaPC = Double.parseDouble(txtSegundaPC.getText());
        double terceraPC = Double.parseDouble(txtTerceraPC.getText());
        double ep = Double.parseDouble(txtEP.getText());
        double ef = Double.parseDouble(txtEF.getText());

        double promedio = (primeraPC * 0.1) + (segundaPC * 0.2) + (terceraPC * 0.1) + (ep * 0.3) + (ef * 0.3);

        String condicion = (promedio >= 13) ? "Aprobado" : "Desaprobado";

        txtPromedio.setText(String.format("%.2f", promedio));
        txtCondicion.setText(condicion);
    }
}
package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPrimeraNota, txtSegundaNota, txtTerceraNota, txtPromedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm04 frame = new frm04();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPrimeraNota = new JLabel("Primera nota:");
        lblPrimeraNota.setBounds(50, 50, 80, 30);
        getContentPane().add(lblPrimeraNota);

        JLabel lblSegundaNota = new JLabel("Segunda nota:");
        lblSegundaNota.setBounds(50, 90, 80, 30);
        getContentPane().add(lblSegundaNota);

        JLabel lblTerceraNota = new JLabel("Tercera nota:");
        lblTerceraNota.setBounds(50, 130, 80, 30);
        getContentPane().add(lblTerceraNota);

        JLabel lblPromedio = new JLabel("Promedio:");
        lblPromedio.setBounds(50, 170, 100, 30);
        getContentPane().add(lblPromedio);

        txtPrimeraNota = new JTextField();
        txtPrimeraNota.setBounds(150, 50, 60, 30);
        txtPrimeraNota.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPrimeraNota);

        txtSegundaNota = new JTextField();
        txtSegundaNota.setBounds(150, 90, 60, 30);
        txtSegundaNota.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSegundaNota);

        txtTerceraNota = new JTextField();
        txtTerceraNota.setBounds(150, 130, 60, 30);
        txtTerceraNota.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTerceraNota);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(150, 170, 60, 30);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPromedio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 210, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int primeranota = Integer.parseInt(txtPrimeraNota.getText());
        int segundanota = Integer.parseInt(txtSegundaNota.getText());
        int terceranota = Integer.parseInt(txtTerceraNota.getText());

        if (terceranota >= 10) {
            terceranota += 2;
        }

        int promedio = (primeranota + segundanota + terceranota) / 3;

        txtPromedio.setText(String.valueOf(promedio));
    }
}
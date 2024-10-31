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

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPrimeraNota, txtSegundaNota, txtTerceraNota, txtCuartaNota, txtQuintaNota;
    JTextField txtNotaMayor, txtNotaMenor, txtPromedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm10 frame = new frm10();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPrimeraNota = new JLabel("Primera Nota:");
        lblPrimeraNota.setBounds(30, 30, 120, 30);
        getContentPane().add(lblPrimeraNota);

        JLabel lblSegundaNota = new JLabel("Segunda Nota:");
        lblSegundaNota.setBounds(30, 70, 120, 30);
        getContentPane().add(lblSegundaNota);

        JLabel lblTerceraNota = new JLabel("Tercera Nota:");
        lblTerceraNota.setBounds(30, 110, 120, 30);
        getContentPane().add(lblTerceraNota);

        JLabel lblCuartaNota = new JLabel("Cuarta Nota:");
        lblCuartaNota.setBounds(30, 150, 120, 30);
        getContentPane().add(lblCuartaNota);

        JLabel lblQuintaNota = new JLabel("Quinta Nota:");
        lblQuintaNota.setBounds(30, 190, 120, 30);
        getContentPane().add(lblQuintaNota);

        JLabel lblNotaMayor = new JLabel("Nota Mayor:");
        lblNotaMayor.setBounds(30, 230, 120, 30);
        getContentPane().add(lblNotaMayor);

        JLabel lblNotaMenor = new JLabel("Nota Menor:");
        lblNotaMenor.setBounds(200, 230, 120, 30);
        getContentPane().add(lblNotaMenor);

        JLabel lblPromedio = new JLabel("Promedio Aprobatorio:");
        lblPromedio.setBounds(30, 270, 150, 30);
        getContentPane().add(lblPromedio);

        txtPrimeraNota = new JTextField();
        txtPrimeraNota.setBounds(150, 30, 60, 30);
        txtPrimeraNota.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPrimeraNota);

        txtSegundaNota = new JTextField();
        txtSegundaNota.setBounds(150, 70, 60, 30);
        txtSegundaNota.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSegundaNota);

        txtTerceraNota = new JTextField();
        txtTerceraNota.setBounds(150, 110, 60, 30);
        txtTerceraNota.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTerceraNota);

        txtCuartaNota = new JTextField();
        txtCuartaNota.setBounds(150, 150, 60, 30);
        txtCuartaNota.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCuartaNota);

        txtQuintaNota = new JTextField();
        txtQuintaNota.setBounds(150, 190, 60, 30);
        txtQuintaNota.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtQuintaNota);

        txtNotaMayor = new JTextField();
        txtNotaMayor.setBounds(120, 230, 60, 30);
        txtNotaMayor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNotaMayor.setEditable(false);
        getContentPane().add(txtNotaMayor);

        txtNotaMenor = new JTextField();
        txtNotaMenor.setBounds(290, 230, 60, 30);
        txtNotaMenor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNotaMenor.setEditable(false);
        getContentPane().add(txtNotaMenor);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(190, 270, 60, 30);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPromedio.setEditable(false);
        getContentPane().add(txtPromedio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 310, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double primeraNota = Double.parseDouble(txtPrimeraNota.getText());
        double segundaNota = Double.parseDouble(txtSegundaNota.getText());
        double terceraNota = Double.parseDouble(txtTerceraNota.getText());
        double cuartaNota = Double.parseDouble(txtCuartaNota.getText());
        double quintaNota = Double.parseDouble(txtQuintaNota.getText());

        double mayor = primeraNota;
        double menor = primeraNota;

        if (segundaNota > mayor) {
            mayor = segundaNota;
        } else if (terceraNota > mayor) {
            mayor = terceraNota;
        } else if (cuartaNota > mayor) {
            mayor = cuartaNota;
        } else if (quintaNota > mayor) {
            mayor = quintaNota;
        }

        if (segundaNota < menor) {
            menor = segundaNota;
        } else if (terceraNota < menor) {
            menor = terceraNota;
        } else if (cuartaNota < menor) {
            menor = cuartaNota;
        } else if (quintaNota < menor) {
            menor = quintaNota;
        }

        txtNotaMayor.setText(String.format("%.2f", mayor));
        txtNotaMenor.setText(String.format("%.2f", menor));

        double promedio = (primeraNota + segundaNota + terceraNota + cuartaNota + quintaNota - mayor - menor) / 3;
        txtPromedio.setText(String.format("%.2f", promedio));
    }
}
package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPrimeraEdad, txtSegundaEdad, txtTerceraEdad, txtMayor, txtMenor;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm06 frame = new frm06();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm06() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPrimeraEdad = new JLabel("Primera edad:");
        lblPrimeraEdad.setBounds(50, 50, 120, 30);
        getContentPane().add(lblPrimeraEdad);

        JLabel lblSegundaEdad = new JLabel("Segunda edad:");
        lblSegundaEdad.setBounds(50, 90, 120, 30);
        getContentPane().add(lblSegundaEdad);

        JLabel lblTerceraEdad = new JLabel("Tercera edad:");
        lblTerceraEdad.setBounds(50, 130, 120, 30);
        getContentPane().add(lblTerceraEdad);

        JLabel lblMayor = new JLabel("Mayor:");
        lblMayor.setBounds(50, 170, 80, 30);
        getContentPane().add(lblMayor);

        JLabel lblMenor = new JLabel("Menor:");
        lblMenor.setBounds(50, 210, 80, 30);
        getContentPane().add(lblMenor);

        txtPrimeraEdad = new JTextField();
        txtPrimeraEdad.setBounds(180, 50, 80, 30);
        txtPrimeraEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPrimeraEdad);

        txtSegundaEdad = new JTextField();
        txtSegundaEdad.setBounds(180, 90, 80, 30);
        txtSegundaEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSegundaEdad);

        txtTerceraEdad = new JTextField();
        txtTerceraEdad.setBounds(180, 130, 80, 30);
        txtTerceraEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTerceraEdad);

        txtMayor = new JTextField();
        txtMayor.setBounds(180, 170, 80, 30);
        txtMayor.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMayor);

        txtMenor = new JTextField();
        txtMenor.setBounds(180, 210, 80, 30);
        txtMenor.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMenor);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(170, 250, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int primeraEdad = Integer.parseInt(txtPrimeraEdad.getText());
        int segundaEdad = Integer.parseInt(txtSegundaEdad.getText());
        int terceraEdad = Integer.parseInt(txtTerceraEdad.getText());

        int mayor = primeraEdad;
        int menor = primeraEdad;

        if (segundaEdad > mayor) {
            mayor = segundaEdad;
        }
        if (terceraEdad > mayor) {
            mayor = terceraEdad;
        }

        if (segundaEdad < menor) {
            menor = segundaEdad;
        }
        if (terceraEdad < menor) {
            menor = terceraEdad;
        }

        txtMayor.setText(String.valueOf(mayor));
        txtMenor.setText(String.valueOf(menor));
    }
}
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

public class frm34 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPeso, txtEstatura, txtIMC, txtGrado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm34 frame = new frm34();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm34() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPeso = new JLabel("Peso (Kg):");
        lblPeso.setBounds(50, 50, 120, 30);
        getContentPane().add(lblPeso);

        JLabel lblEstatura = new JLabel("Estatura (m):");
        lblEstatura.setBounds(50, 90, 120, 30);
        getContentPane().add(lblEstatura);

        JLabel lblIMC = new JLabel("IMC:");
        lblIMC.setBounds(50, 130, 120, 30);
        getContentPane().add(lblIMC);

        JLabel lblGrado = new JLabel("Grado de Obesidad:");
        lblGrado.setBounds(50, 170, 120, 30);
        getContentPane().add(lblGrado);

        txtPeso = new JTextField();
        txtPeso.setBounds(180, 50, 60, 30);
        txtPeso.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPeso.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPeso);

        txtEstatura = new JTextField();
        txtEstatura.setBounds(180, 90, 60, 30);
        txtEstatura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEstatura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtEstatura);

        txtIMC = new JTextField();
        txtIMC.setBounds(180, 130, 60, 30);
        txtIMC.setHorizontalAlignment(SwingConstants.RIGHT);
        txtIMC.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtIMC);

        txtGrado = new JTextField();
        txtGrado.setBounds(180, 170, 120, 30);
        getContentPane().add(txtGrado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 210, 100, 30);
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
        double peso = Double.parseDouble(txtPeso.getText());
        double estatura = Double.parseDouble(txtEstatura.getText());
        double imc = peso / (estatura * estatura);
        String grado;

        if (imc < 20) {
            grado = "Delgado";
        } else if (imc >= 20 && imc < 25) {
            grado = "Normal";
        } else if (imc >= 25 && imc < 27) {
            grado = "Sobrepeso";
        } else {
            grado = "Obesidad";
        }

        txtIMC.setText(String.format("%.2f", imc));
        txtGrado.setText(grado);
    }
}
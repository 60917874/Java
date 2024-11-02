package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumeroA, txtNumeroB, txtNumeroC, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm20 frame = new frm20();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm20() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumeroA = new JLabel("Número A:");
        lblNumeroA.setBounds(30, 30, 150, 30);
        getContentPane().add(lblNumeroA);

        txtNumeroA = new JTextField();
        txtNumeroA.setBounds(130, 30, 80, 30);
        txtNumeroA.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumeroA);

        JLabel lblNumeroB = new JLabel("Número B:");
        lblNumeroB.setBounds(30, 80, 150, 30);
        getContentPane().add(lblNumeroB);

        txtNumeroB = new JTextField();
        txtNumeroB.setBounds(130, 80, 80, 30);
        txtNumeroB.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumeroB);

        JLabel lblNumeroC = new JLabel("Número C:");
        lblNumeroC.setBounds(30, 130, 150, 30);
        getContentPane().add(lblNumeroC);

        txtNumeroC = new JTextField();
        txtNumeroC.setBounds(130, 130, 80, 30);
        txtNumeroC.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumeroC);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(30, 180, 150, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(130, 180, 80, 30);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 230, 110, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();

            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int numeroA = Integer.parseInt(txtNumeroA.getText());
        int numeroB = Integer.parseInt(txtNumeroB.getText());
        int numeroC = Integer.parseInt(txtNumeroC.getText());
        String resultado;

        if (numeroA < numeroB && numeroB < numeroC) {
            resultado = "Ascendente";
        } else if (numeroA > numeroB && numeroB > numeroC) {
            resultado = "Descendente";
        } else {
            resultado = "Desordenado";
        }

        txtResultado.setText(resultado);
    }
}
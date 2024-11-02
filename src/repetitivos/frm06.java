package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtInferior, txtSuperior, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm06 frame = new frm06();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm06() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 30, 100, 30);
        getContentPane().add(lblNumero);

        JLabel lblInferior = new JLabel("Desde:");
        lblInferior.setBounds(50, 70, 100, 30);
        getContentPane().add(lblInferior);

        JLabel lblSuperior = new JLabel("Hasta:");
        lblSuperior.setBounds(50, 110, 100, 30);
        getContentPane().add(lblSuperior);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtInferior = new JTextField();
        txtInferior.setBounds(150, 70, 60, 30);
        txtInferior.setHorizontalAlignment(SwingConstants.RIGHT);
        txtInferior.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtInferior);

        txtSuperior = new JTextField();
        txtSuperior.setBounds(150, 110, 60, 30);
        txtSuperior.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSuperior.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSuperior);

        txtResultado = new JTextField();
        txtResultado.setBounds(50, 150, 200, 60);
        txtResultado.setFocusable(false);
        txtResultado.setHorizontalAlignment(SwingConstants.LEFT);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 220, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int numeroBase = Integer.parseInt(txtNumero.getText());
        int inferior = Integer.parseInt(txtInferior.getText());
        int superior = Integer.parseInt(txtSuperior.getText());
        String resultado = "";

        for (int i = inferior; i <= superior; i++) {
            resultado += numeroBase + " x " + i + " = " + (numeroBase * i) + "\n";
        }

        txtResultado.setText(resultado.toUpperCase());
    }
}
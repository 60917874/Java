package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtAltura, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm09 frame = new frm09();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm09() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblAltura = new JLabel("Altura (n >= 4):");
        lblAltura.setBounds(50, 50, 100, 30);
        getContentPane().add(lblAltura);

        txtAltura = new JTextField();
        txtAltura.setBounds(150, 50, 60, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        txtResultado = new JTextField();
        txtResultado.setBounds(50, 100, 200, 150);
        txtResultado.setFocusable(false);
        txtResultado.setHorizontalAlignment(SwingConstants.LEFT);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

        JButton btnGenerar = new JButton("Generar");
        btnGenerar.setBounds(100, 260, 100, 30);
        getContentPane().add(btnGenerar);

        btnGenerar.addActionListener(e -> btnGenerar_actionPerformed());
    }

    protected void btnGenerar_actionPerformed() {
        int altura = Integer.parseInt(txtAltura.getText());
        String resultado = rectangulo(altura);
        txtResultado.setText(resultado);
    }

    private String rectangulo(int altura) {
        String resultado = "";
        int ancho = 2 * altura;

        for (int i = 0; i < altura; i++) {
            for (int n = 0; n < ancho; n++) {
                resultado += "*";
            }
            resultado += "\n";
        }
        return resultado;
    }
}
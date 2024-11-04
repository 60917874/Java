package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm05 extends JFrame {
    static final long serialVersionUID = 1L;
    JTextField txtCadena, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm05 frame = new frm05();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm05() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCadena = new JLabel("Cadena:");
        lblCadena.setBounds(50, 50, 100, 30);
        getContentPane().add(lblCadena);

        txtCadena = new JTextField();
        txtCadena.setBounds(150, 50, 100, 30);
        txtCadena.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCadena);

        JLabel lblResultado = new JLabel("Alternado:");
        lblResultado.setBounds(50, 100, 100, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(150, 100, 100, 30);
        getContentPane().add(txtResultado);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(100, 150, 100, 30);
        getContentPane().add(btnVerificar);

        btnVerificar.addActionListener(e -> btnCalcular_actionPerformed());
    }

    void btnCalcular_actionPerformed() {
        String cadena = txtCadena.getText();
        boolean alternado = calcular(cadena, 0);
        txtResultado.setText(alternado ? "Sí" : "No");
    }

    boolean calcular(String cadena, int index) {
        if (index >= cadena.length() - 1) {
            return true;
        }
        if (cadena.charAt(index) == cadena.charAt(index + 1)) {
            return false;
        }
        return calcular(cadena, index + 1);
    }
}
package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm09 extends JFrame {
    static final long serialVersionUID = 1L;
    JTextField txtNumero, txtLimite, txtResultado;

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
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 50, 100, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(120, 50, 90, 30);
        getContentPane().add(txtNumero);

        JLabel lblLimite = new JLabel("Límite:");
        lblLimite.setBounds(50, 100, 100, 30);
        getContentPane().add(lblLimite);

        txtLimite = new JTextField();
        txtLimite.setBounds(120, 100, 90, 30);
        getContentPane().add(txtLimite);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 150, 100, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(120, 150, 150, 30);
        getContentPane().add(txtResultado);

        JButton btnGenerar = new JButton("Calcular");
        btnGenerar.setBounds(100, 200, 100, 30);
        getContentPane().add(btnGenerar);

        btnGenerar.addActionListener(e -> btnCalcular_actionPerformed());
    }

    void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        int limite = Integer.parseInt(txtLimite.getText());
        String resultado = calcularSecuencia(numero, limite);
        txtResultado.setText(resultado);
    }

    String calcularSecuencia(int numero, int limite) {
        if (numero > limite) {
            return "";
        }
        String resultado = numero + ", " + calcularSecuencia(numero + 3, limite);
        return resultado;
    }
}

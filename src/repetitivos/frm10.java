package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextArea txtResultado;
    JTextField txtCantidad;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm10 frame = new frm10();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblResultado = new JLabel("Números:");
        lblResultado.setBounds(50, 50, 150, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextArea();
        txtResultado.setBounds(50, 90, 200, 200);
        txtResultado.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtResultado);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(50, 310, 150, 30);
        getContentPane().add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(200, 310, 50, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCantidad);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 350, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        String resultado = numeros();
        txtResultado.setText(resultado);
        txtCantidad.setText(String.valueOf(numeros(resultado)));
    }

    String numeros() {
        String resultado = "";

        for (int i = 1000; i < 10000; i++) {
            int primerDigito = (i / 1000) % 10;
            int segundoDigito = (i / 100) % 10;
            int tercerDigito = (i / 10) % 10;
            int cuartoDigito = i % 10;

            int pares = segundoDigito + cuartoDigito;
            int impares = primerDigito + tercerDigito;

            if (pares == impares) {
                resultado += i + "\n";
            }
        }

        return resultado;
    }

    int numeros(String resultado) {
        int total = 0;

        for (char c : resultado.toCharArray()) {
            if (c == '\n') {
                total++;
            }
        }

        return total;
    }
}
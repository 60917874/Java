package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class frm12 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextArea txtNumeros;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm12 frame = new frm12();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm12() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumeros = new JLabel("Número:");
        lblNumeros.setBounds(50, 20, 200, 30);
        getContentPane().add(lblNumeros);

        txtNumeros = new JTextArea();
        txtNumeros.setBounds(50, 60, 200, 150);
        txtNumeros.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumeros);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 220, 140, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        mostrarNumeros();
    }

    void mostrarNumeros() {
        String resultado = "";

        for (int i = 1; i <= 100; i++) {
            resultado += i + " ";
            if (i % 10 == 0) {
                resultado += "\n";
            }
        }

        txtNumeros.setText(resultado);
    }
}
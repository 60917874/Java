package recursividad;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm04 extends JFrame {
    static final long serialVersionUID = 1L;
    JTextField txtBase, txtExponente, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm04 frame = new frm04();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(50, 50, 100, 30);
        getContentPane().add(lblBase);

        txtBase = new JTextField();
        txtBase.setBounds(150, 50, 100, 30);
        txtBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBase);

        JLabel lblExponente = new JLabel("Exponente:");
        lblExponente.setBounds(50, 100, 100, 30);
        getContentPane().add(lblExponente);

        txtExponente = new JTextField();
        txtExponente.setBounds(150, 100, 100, 30);
        txtExponente.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtExponente);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 150, 100, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(150, 150, 100, 30);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 200, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    void btnCalcular_actionPerformed() {
        int base = Integer.parseInt(txtBase.getText());
        int exponente = Integer.parseInt(txtExponente.getText());
        int resultado = potencia(base, exponente);
        txtResultado.setText(String.valueOf(resultado));
    }

    int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }
}
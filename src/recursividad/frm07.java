package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm07 extends JFrame {
    static final long serialVersionUID = 1L;
    JTextField txtPrimerNumero, txtSegundoNumero, txtMCD;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm07 frame = new frm07();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm07() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPrimerNumero = new JLabel("Primer Número:");
        lblPrimerNumero.setBounds(50, 50, 100, 30);
        getContentPane().add(lblPrimerNumero);

        txtPrimerNumero = new JTextField();
        txtPrimerNumero.setBounds(150, 50, 100, 30);
        getContentPane().add(txtPrimerNumero);

        JLabel lblSegundoNumero = new JLabel("Segundo Número:");
        lblSegundoNumero.setBounds(50, 100, 100, 30);
        getContentPane().add(lblSegundoNumero);

        txtSegundoNumero = new JTextField();
        txtSegundoNumero.setBounds(150, 100, 100, 30);
        getContentPane().add(txtSegundoNumero);

        JLabel lblMCD = new JLabel("MCD:");
        lblMCD.setBounds(50, 150, 100, 30);
        getContentPane().add(lblMCD);

        txtMCD = new JTextField();
        txtMCD.setBounds(150, 150, 100, 30);
        getContentPane().add(txtMCD);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 200, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    void btnCalcular_actionPerformed() {
        int primerNumero = Integer.parseInt(txtPrimerNumero.getText());
        int segundoNumero = Integer.parseInt(txtSegundoNumero.getText());
        int mcd = calcularMCD(primerNumero, segundoNumero);
        txtMCD.setText(String.valueOf(mcd));
    }

    int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMCD(b, a % b);
    }
}
package secuenciales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Insets;

public class frm12 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtA, txtB, txtC;
    JLabel lblPrimeraRaiz, lblSegundaRaiz;

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

        JLabel lblA = new JLabel("a:");
        lblA.setBounds(50, 50, 80, 30);
        getContentPane().add(lblA);

        JLabel lblB = new JLabel("b:");
        lblB.setBounds(50, 90, 80, 30);
        getContentPane().add(lblB);

        JLabel lblC = new JLabel("c:");
        lblC.setBounds(50, 130, 80, 30);
        getContentPane().add(lblC);

        lblPrimeraRaiz = new JLabel("Primera raíz:");
        lblPrimeraRaiz.setBounds(50, 170, 200, 30);
        getContentPane().add(lblPrimeraRaiz);

        lblSegundaRaiz = new JLabel("Segunda raíz:");
        lblSegundaRaiz.setBounds(50, 210, 200, 30);
        getContentPane().add(lblSegundaRaiz);

        txtA = new JTextField();
        txtA.setBounds(130, 50, 60, 30);
        txtA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtA);

        txtB = new JTextField();
        txtB.setBounds(130, 90, 60, 30);
        txtB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtB);

        txtC = new JTextField();
        txtC.setBounds(130, 130, 60, 30);
        txtC.setHorizontalAlignment(SwingConstants.RIGHT);
        txtC.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtC);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 250, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double c = Double.parseDouble(txtC.getText());

        double discriminante = b * b - 4 * a * c;
        double primeraRaiz = (-b + Math.sqrt(discriminante)) / (2 * a);
        double segundaRaiz = (-b - Math.sqrt(discriminante)) / (2 * a);

        lblPrimeraRaiz.setText("Primera raíz: " + primeraRaiz);
        lblSegundaRaiz.setText("Segunda raíz: " + segundaRaiz);
    }
}
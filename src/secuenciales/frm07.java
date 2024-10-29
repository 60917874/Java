package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtBase, txtAltura;
    JLabel lblArea, lblPerimetro;

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
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblBase = new JLabel("Base:");
        lblBase.setBounds(50, 50, 80, 30);
        getContentPane().add(lblBase);

        JLabel lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(50, 90, 80, 30);
        getContentPane().add(lblAltura);

        lblArea = new JLabel("Área:");
        lblArea.setBounds(50, 130, 200, 30);
        getContentPane().add(lblArea);

        lblPerimetro = new JLabel("Perímetro:");
        lblPerimetro.setBounds(50, 170, 200, 30);
        getContentPane().add(lblPerimetro);

        txtBase = new JTextField();
        txtBase.setBounds(130, 50, 60, 30);
        txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBase.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBase);

        txtAltura = new JTextField();
        txtAltura.setBounds(130, 90, 60, 30);
        txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAltura.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAltura);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 210, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int base = Integer.parseInt(txtBase.getText());
        int altura = Integer.parseInt(txtAltura.getText());

        int area = base * altura;
        int perimetro = 2 * (base + altura);

        lblArea.setText("Área: " + area);
        lblPerimetro.setText("Perímetro: " + perimetro);
    }
}
package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCatetoA, txtCatetoB;
    JLabel lblHipotenusa;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm13 frame = new frm13();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm13() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCatetoA = new JLabel("Cateto A:");
        lblCatetoA.setBounds(50, 50, 80, 30);
        getContentPane().add(lblCatetoA);

        JLabel lblCatetoB = new JLabel("Cateto B:");
        lblCatetoB.setBounds(50, 90, 80, 30);
        getContentPane().add(lblCatetoB);

        lblHipotenusa = new JLabel("Hipotenusa:");
        lblHipotenusa.setBounds(50, 150, 200, 30);
        getContentPane().add(lblHipotenusa);

        txtCatetoA = new JTextField();
        txtCatetoA.setBounds(130, 50, 60, 30);
        txtCatetoA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCatetoA.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCatetoA);

        txtCatetoB = new JTextField();
        txtCatetoB.setBounds(130, 90, 60, 30);
        txtCatetoB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCatetoB.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCatetoB);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 200, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int catetoA = Integer.parseInt(txtCatetoA.getText());
        int catetoB = Integer.parseInt(txtCatetoB.getText());

        int hipotenusa = (int) Math.sqrt(catetoA * catetoA + catetoB * catetoB);

        lblHipotenusa.setText("Hipotenusa: " + hipotenusa);
    }
}
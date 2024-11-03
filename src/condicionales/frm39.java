package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm39 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHora, txtTDefectuoso, txtTNoDefectuoso, txtGrado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm39 frame = new frm39();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm39() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHora = new JLabel("Horas de ausencia:");
        lblHora.setBounds(30, 30, 130, 30);
        getContentPane().add(lblHora);

        JLabel lblTDefectuoso = new JLabel("Tornillos defectuoso:");
        lblTDefectuoso.setBounds(30, 70, 130, 30);
        getContentPane().add(lblTDefectuoso);

        JLabel lblTNoDefectuoso = new JLabel("Tornillos no defectuoso:");
        lblTNoDefectuoso.setBounds(30, 110, 150, 30);
        getContentPane().add(lblTNoDefectuoso);

        JLabel lblGrado = new JLabel("Grado:");
        lblGrado.setBounds(30, 150, 130, 30);
        getContentPane().add(lblGrado);

        txtHora = new JTextField();
        txtHora.setBounds(180, 30, 60, 30);
        txtHora.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHora.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHora);

        txtTDefectuoso = new JTextField();
        txtTDefectuoso.setBounds(180, 70, 60, 30);
        txtTDefectuoso.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTDefectuoso.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTDefectuoso);

        txtTNoDefectuoso = new JTextField();
        txtTNoDefectuoso.setBounds(180, 110, 60, 30);
        txtTNoDefectuoso.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTNoDefectuoso.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTNoDefectuoso);

        txtGrado = new JTextField();
        txtGrado.setBounds(180, 150, 60, 30);
        txtGrado.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtGrado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 200, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularGradoEficiencia();
            }
        });
    }

    protected void calcularGradoEficiencia() {
        double hora = Double.parseDouble(txtHora.getText());
        int tornilloDefectuoso = Integer.parseInt(txtTDefectuoso.getText());
        int tornilloNoDefectuoso = Integer.parseInt(txtTNoDefectuoso.getText());
        int grado = 5;

        if (hora <= 1.5 && tornilloDefectuoso < 300 && tornilloNoDefectuoso > 10000) {
            grado = 20;
        } else if (hora <= 1.5 && tornilloDefectuoso < 300) {
            grado = 12;
        } else if (hora <= 1.5 && tornilloNoDefectuoso > 10000) {
            grado = 13;
        } else if (tornilloDefectuoso < 300 && tornilloNoDefectuoso > 10000) {
            grado = 15;
        } else if (hora <= 1.5) {
            grado = 7;
        } else if (tornilloDefectuoso < 300) {
            grado = 8;
        } else if (tornilloNoDefectuoso > 10000) {
            grado = 9;
        }

        txtGrado.setText(String.valueOf(grado));
    }
}
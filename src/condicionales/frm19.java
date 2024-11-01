package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtEdad, txtCategoria, txtSexo;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm19 frame = new frm19();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm19() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(30, 30, 150, 30);
        getContentPane().add(lblSexo);

        txtSexo = new JTextField();
        txtSexo.setBounds(180, 30, 100, 30);
        txtSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSexo);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(30, 80, 150, 30);
        getContentPane().add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(180, 80, 100, 30);
        txtEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtEdad);

        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setBounds(30, 130, 150, 30);
        getContentPane().add(lblCategoria);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(180, 130, 100, 30);
        txtCategoria.setEditable(false);
        txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCategoria);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 180, 250, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int edad = Integer.parseInt(txtEdad.getText());
        String sexo = txtSexo.getText().toUpperCase();
        String categoria = "";

        if (sexo.equals("F")) {
            if (edad < 23) {
                categoria = "FA";
            } else {
                categoria = "FB";
            }
        } else if (sexo.equals("M")) {
            if (edad < 25) {
                categoria = "MA";
            } else {
                categoria = "MB";
            }
        }

        txtCategoria.setText(categoria);
    }
}
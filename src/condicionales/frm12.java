package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm12 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtDia;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm12 frame = new frm12();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm12() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número (1-7):");
        lblNumero.setBounds(30, 30, 120, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        JLabel lblDia = new JLabel("Día:");
        lblDia.setBounds(30, 80, 120, 30);
        getContentPane().add(lblDia);

        txtDia = new JTextField();
        txtDia.setBounds(150, 80, 100, 30);
        txtDia.setEditable(false);
        getContentPane().add(txtDia);

        JButton btnCalcular = new JButton("Determinar Día");
        btnCalcular.setBounds(30, 130, 200, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        String dia = "";

        if (numero == 1) {
            dia = "Lunes";
        } else if (numero == 2) {
            dia = "Martes";
        } else if (numero == 3) {
            dia = "Miércoles";
        } else if (numero == 4) {
            dia = "Jueves";
        } else if (numero == 5) {
            dia = "Viernes";
        } else if (numero == 6) {
            dia = "Sábado";
        } else if (numero == 7) {
            dia = "Domingo";
        } else {
            dia = "Error";
        }

        txtDia.setText(dia);
    }
}
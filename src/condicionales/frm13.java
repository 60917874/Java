package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm13 frame = new frm13();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm13() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(30, 30, 120, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 80, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(30, 80, 120, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(150, 80, 100, 30);
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Verificar");
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
        String resultado;

        int primerDigito = numero / 100;
        int segundoDigito = (numero / 10) % 10;
        int tercerDigito = numero % 10;

        if ((segundoDigito == primerDigito + 1 && tercerDigito == segundoDigito + 1) ||
            (segundoDigito == primerDigito - 1 && tercerDigito == segundoDigito - 1)) {
            resultado = "Cifra consecutiva";
        } else {
            resultado = "Cifra no consecutiva";
        }

        txtResultado.setText(resultado);
    }
}
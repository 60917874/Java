package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtMayor, txtMenor, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm05 frame = new frm05();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm05() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 50, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblMayor = new JLabel("Mayor:");
        lblMayor.setBounds(50, 90, 80, 30);
        getContentPane().add(lblMayor);

        JLabel lblMenor = new JLabel("Menor:");
        lblMenor.setBounds(50, 130, 80, 30);
        getContentPane().add(lblMenor);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 170, 80, 30);
        getContentPane().add(lblResultado);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 50, 80, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        txtMayor = new JTextField();
        txtMayor.setBounds(180, 90, 80, 30);
        txtMayor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMayor.setEditable(false);
        getContentPane().add(txtMayor);

        txtMenor = new JTextField();
        txtMenor.setBounds(180, 130, 80, 30);
        txtMenor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMenor.setEditable(false);
        getContentPane().add(txtMenor);

        txtResultado = new JTextField();
        txtResultado.setBounds(180, 170, 80, 30);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 220, 100, 30);
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

        int primerDigito = numero / 1000;
        int segundoDigito = (numero / 100) % 10;
        int tercerDigito = (numero / 10) % 10;
        int cuartoDigito = numero % 10;

        int mayor = primerDigito;
        int menor = primerDigito;

        if (segundoDigito > mayor) {
            mayor = segundoDigito;
        }
        if (tercerDigito > mayor) {
            mayor = tercerDigito;
        }
        if (cuartoDigito > mayor) {
            mayor = cuartoDigito;
        }

        if (segundoDigito < menor) {
            menor = segundoDigito;
        }
        if (tercerDigito < menor) {
            menor = tercerDigito;
        }
        if (cuartoDigito < menor) {
            menor = cuartoDigito;
        }

        txtMayor.setText(String.valueOf(mayor));
        txtMenor.setText(String.valueOf(menor));

        String resultadoMayorMenor = "" + mayor + menor;
        txtResultado.setText(resultadoMayorMenor);

    }

}
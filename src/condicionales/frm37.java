package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm37 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtPamela, txtCarol, txtFanny, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm37 frame = new frm37();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm37() {
        setTitle("Elección Club Femenino");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPamela = new JLabel("Pamela:");
        lblPamela.setBounds(50, 30, 100, 30);
        getContentPane().add(lblPamela);

        txtPamela = new JTextField();
        txtPamela.setBounds(150, 30, 60, 30);
        getContentPane().add(txtPamela);

        JLabel lblCarol = new JLabel("Carol:");
        lblCarol.setBounds(50, 70, 100, 30);
        getContentPane().add(lblCarol);

        txtCarol = new JTextField();
        txtCarol.setBounds(150, 70, 60, 30);
        getContentPane().add(txtCarol);

        JLabel lblFanny = new JLabel("Fanny:");
        lblFanny.setBounds(50, 110, 100, 30);
        getContentPane().add(lblFanny);

        txtFanny = new JTextField();
        txtFanny.setBounds(150, 110, 60, 30);
        getContentPane().add(txtFanny);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 150, 100, 30);
        getContentPane().add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(150, 150, 150, 30);
        txtResultado.setEditable(false);
        getContentPane().add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 190, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularResultado();
            }
        });
    }

    private void calcularResultado() {
        int pamela = Integer.parseInt(txtPamela.getText());
        int carol = Integer.parseInt(txtCarol.getText());
        int fanny = Integer.parseInt(txtFanny.getText());

        int total = pamela + carol + fanny;
        int medio = total / 2 + 1;

        String resultado;

        if (pamela == carol && carol == fanny) {
            resultado = "Elección anulada por empate.";
        } else if ((pamela == carol && pamela > fanny) || 
                   (pamela == fanny && pamela > carol) || 
                   (carol == fanny && carol > pamela)) {
            resultado = "Anulada";
        } else if (pamela >= medio) {
            resultado = "Pamela gana.";
        } else if (carol >= medio) {
            resultado = "Carol gana.";
        } else if (fanny >= medio) {
            resultado = "Fanny gana";
        } else {
            if (pamela > carol && pamela > fanny) {
                resultado = "1. Pamela\n2. " + (carol > fanny ? "Carol" : "Fanny");
            } else if (carol > pamela && carol > fanny) {
                resultado = "1. Carol\n2. " + (pamela > fanny ? "Pamela" : "Fanny");
            } else {
                resultado = "1. Fanny\n2. " + (pamela > carol ? "Pamela" : "Carol");
            }
        }

        txtResultado.setText(resultado);
    }
}
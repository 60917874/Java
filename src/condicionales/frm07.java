package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPrimernumero, txtSegundonumero, txtTercernumero, txtIntermedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm07 frame = new frm07();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm07() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPrimernumero = new JLabel("Primer número:");
        lblPrimernumero.setBounds(50, 50, 120, 30);
        getContentPane().add(lblPrimernumero);

        JLabel lblSegundonumero = new JLabel("Segundo número:");
        lblSegundonumero.setBounds(50, 90, 120, 30);
        getContentPane().add(lblSegundonumero);

        JLabel lblTercernumero = new JLabel("Tercer número:");
        lblTercernumero.setBounds(50, 130, 120, 30);
        getContentPane().add(lblTercernumero);

        JLabel lblIntermedio = new JLabel("Número intermedio:");
        lblIntermedio.setBounds(50, 170, 150, 30);
        getContentPane().add(lblIntermedio);

        txtPrimernumero = new JTextField();
        txtPrimernumero.setBounds(180, 50, 80, 30);
        txtPrimernumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPrimernumero);

        txtSegundonumero = new JTextField();
        txtSegundonumero.setBounds(180, 90, 80, 30);
        txtSegundonumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSegundonumero);

        txtTercernumero = new JTextField();
        txtTercernumero.setBounds(180, 130, 80, 30);
        txtTercernumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTercernumero);

        txtIntermedio = new JTextField();
        txtIntermedio.setBounds(180, 170, 80, 30);
        txtIntermedio.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtIntermedio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 210, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int primernumero = Integer.parseInt(txtPrimernumero.getText());
        int segundonumero = Integer.parseInt(txtSegundonumero.getText());
        int tercernumero = Integer.parseInt(txtTercernumero.getText());

        int intermedio;

        intermedio = (primernumero > segundonumero
                ? (primernumero < tercernumero ? primernumero
                        : (segundonumero > tercernumero ? segundonumero : tercernumero))
                : (primernumero > tercernumero ? primernumero
                        : (segundonumero < tercernumero ? segundonumero : tercernumero)));

        txtIntermedio.setText(String.valueOf(intermedio));
    }
}
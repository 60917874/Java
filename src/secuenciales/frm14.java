package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPrimerNumero, txtSegundoNumero, txtTercerNumero, txtCuartoNumero, txtQuintoNumero;
    JLabel lblPromedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm14 frame = new frm14();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblPrimerNumero = new JLabel("Primer Número:");
        lblPrimerNumero.setBounds(50, 50, 100, 30);
        getContentPane().add(lblPrimerNumero);

        JLabel lblSegundoNumero = new JLabel("Segundo Número:");
        lblSegundoNumero.setBounds(50, 90, 100, 30);
        getContentPane().add(lblSegundoNumero);

        JLabel lblTercerNumero = new JLabel("Tercer Número:");
        lblTercerNumero.setBounds(50, 130, 100, 30);
        getContentPane().add(lblTercerNumero);

        JLabel lblCuartoNumero = new JLabel("Cuarto Número:");
        lblCuartoNumero.setBounds(50, 170, 100, 30);
        getContentPane().add(lblCuartoNumero);

        JLabel lblQuintoNumero = new JLabel("Quinto Número:");
        lblQuintoNumero.setBounds(50, 210, 100, 30);
        getContentPane().add(lblQuintoNumero);

        lblPromedio = new JLabel("Promedio de los mayores:");
        lblPromedio.setBounds(50, 270, 300, 30);
        getContentPane().add(lblPromedio);

        txtPrimerNumero = new JTextField();
        txtPrimerNumero.setBounds(160, 50, 60, 30);
        txtPrimerNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPrimerNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPrimerNumero);

        txtSegundoNumero = new JTextField();
        txtSegundoNumero.setBounds(160, 90, 60, 30);
        txtSegundoNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSegundoNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtSegundoNumero);

        txtTercerNumero = new JTextField();
        txtTercerNumero.setBounds(160, 130, 60, 30);
        txtTercerNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTercerNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTercerNumero);

        txtCuartoNumero = new JTextField();
        txtCuartoNumero.setBounds(160, 170, 60, 30);
        txtCuartoNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCuartoNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCuartoNumero);

        txtQuintoNumero = new JTextField();
        txtQuintoNumero.setBounds(160, 210, 60, 30);
        txtQuintoNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtQuintoNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtQuintoNumero);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(230, 270, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double primerNumero = Double.parseDouble(txtPrimerNumero.getText());
        double segundoNumero = Double.parseDouble(txtSegundoNumero.getText());
        double tercerNumero = Double.parseDouble(txtTercerNumero.getText());
        double cuartoNumero = Double.parseDouble(txtCuartoNumero.getText());
        double quintoNumero = Double.parseDouble(txtQuintoNumero.getText());

        double mayor = Math.max(primerNumero, Math.max(segundoNumero, Math.max(tercerNumero, Math.max(cuartoNumero, quintoNumero))));
        double menor = Math.min(primerNumero, Math.min(segundoNumero, Math.min(tercerNumero, Math.min(cuartoNumero, quintoNumero))));
        double medio = primerNumero + segundoNumero + tercerNumero + cuartoNumero + quintoNumero - mayor - menor;

        double promedio = (mayor + medio + menor) / 3;

        lblPromedio.setText("Promedio de los mayores: " + promedio);
    }
}
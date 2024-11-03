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

public class frm23 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNotaM, txtNotaF, txtMatematica, txtFisica, txtPromedio, txtObsequio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm23 frame = new frm23();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm23() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNotaM = new JLabel("Nota Matematca:");
        lblNotaM.setBounds(50, 30, 130, 30);
        getContentPane().add(lblNotaM);

        JLabel lblNotaF = new JLabel("Nota Fisica:");
        lblNotaF.setBounds(50, 70, 130, 30);
        getContentPane().add(lblNotaF);

        JLabel lblMatematica = new JLabel("Matematica:");
        lblMatematica.setBounds(50, 110, 130, 30);
        getContentPane().add(lblMatematica);

        JLabel lblFisica = new JLabel("Fisica:");
        lblFisica.setBounds(50, 150, 130, 30);
        getContentPane().add(lblFisica);

        JLabel lblPromedio = new JLabel("Promedio:");
        lblPromedio.setBounds(50, 190, 130, 30);
        getContentPane().add(lblPromedio);

        JLabel lblObsequio = new JLabel("Obsequio:");
        lblObsequio.setBounds(50, 230, 130, 30);
        getContentPane().add(lblObsequio);

        txtNotaM = new JTextField();
        txtNotaM.setBounds(180, 30, 60, 30);
        txtNotaM.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNotaM.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNotaM);

        txtNotaF = new JTextField();
        txtNotaF.setBounds(180, 70, 60, 30);
        txtNotaF.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNotaF.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNotaF);

        txtMatematica = new JTextField();
        txtMatematica.setBounds(180, 110, 60, 30);
        txtMatematica.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMatematica.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMatematica);

        txtFisica = new JTextField();
        txtFisica.setBounds(180, 150, 60, 30);
        txtFisica.setHorizontalAlignment(SwingConstants.RIGHT);
        txtFisica.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtFisica);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(180, 190, 60, 30);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPromedio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPromedio);

        txtObsequio = new JTextField();
        txtObsequio.setBounds(180, 230, 60, 30);
        txtObsequio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtObsequio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtObsequio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 270, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double notaMatematica = Double.parseDouble(txtNotaM.getText());
        double notaFisica = Double.parseDouble(txtNotaF.getText());

        double matematica = (notaMatematica > 17) ? 3 : notaMatematica;
        double fisica = (notaFisica > 15) ? 2 : 0.5;

        double total = matematica + fisica;
        double promedio = (notaMatematica + notaFisica) / 2;

        txtMatematica.setText(String.format("S/ %.2f", total));
        txtFisica.setText(String.format("S/ %.2f", promedio));

        String obsequio = (promedio > 16) ? "Reloj" : "Nada";
        txtObsequio.setText(obsequio);
    }
}
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

public class frm32 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCategoria, txtPromedio, txtPActual, txtDescuento, txtPNueva;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm32 frame = new frm32();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm32() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setBounds(50, 50, 120, 30);
        getContentPane().add(lblCategoria);

        JLabel lblPromedio = new JLabel("Promedio:");
        lblPromedio.setBounds(50, 90, 120, 30);
        getContentPane().add(lblPromedio);

        JLabel lblPActual = new JLabel("Pensión Actual:");
        lblPActual.setBounds(50, 130, 120, 30);
        getContentPane().add(lblPActual);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 170, 120, 30);
        getContentPane().add(lblDescuento);

        JLabel lblPNueva = new JLabel("Pension Nueva:");
        lblPNueva.setBounds(50, 210, 120, 30);
        getContentPane().add(lblPNueva);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(180, 50, 60, 30);
        txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCategoria.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCategoria);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(180, 90, 60, 30);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPromedio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPromedio);

        txtPActual = new JTextField();
        txtPActual.setBounds(180, 130, 60, 30);
        txtPActual.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPActual.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPActual);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 170, 60, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtPNueva = new JTextField();
        txtPNueva.setBounds(180, 210, 60, 30);
        txtPNueva.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPNueva.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtPNueva);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 260, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        char categoria = txtCategoria.getText().charAt(0);
        double promedio = Double.parseDouble(txtPromedio.getText());
        double pActual = 0;
        double descuento = 0;

        if (categoria == 'A') {
            pActual = 550;
            if (promedio >= 0 && promedio <= 13.99)
                descuento = 0;
        } else if (categoria == 'B') {
            pActual = 500;
            if (promedio >= 14 && promedio <= 15.99)
                descuento = 0.10 * pActual;
        } else if (categoria == 'C') {
            pActual = 450;
            if (promedio >= 16 && promedio <= 17.99)
                descuento = 0.12 * pActual;
        } else if (categoria == 'D') {
            pActual = 400;
            if (promedio >= 18 && promedio <= 20)
                descuento = 0.15 * pActual;
        }

        double pNueva = pActual - descuento;

        txtPActual.setText(String.format("S/ %.2f", pActual));
        txtDescuento.setText(String.format("S/ %.2f", descuento));
        txtPNueva.setText(String.format("S/ %.2f", pNueva));
    }
}
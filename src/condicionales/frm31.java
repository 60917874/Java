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

public class frm31 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHoras, txtCategoria, txtBruto, txtDescuento, txtNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm31 frame = new frm31();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm31() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHoras = new JLabel("Horas trabajadas:");
        lblHoras.setBounds(50, 50, 120, 30);
        getContentPane().add(lblHoras);

        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setBounds(50, 90, 120, 30);
        getContentPane().add(lblCategoria);

        JLabel lblBruto = new JLabel("Sueldo Bruto:");
        lblBruto.setBounds(50, 130, 120, 30);
        getContentPane().add(lblBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 170, 120, 30);
        getContentPane().add(lblDescuento);

        JLabel lblNeto = new JLabel("Sueldo Neto:");
        lblNeto.setBounds(50, 210, 120, 30);
        getContentPane().add(lblNeto);

        txtHoras = new JTextField();
        txtHoras.setBounds(180, 50, 60, 30);
        txtHoras.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHoras.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHoras);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(180, 90, 60, 30);
        txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCategoria.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCategoria);

        txtBruto = new JTextField();
        txtBruto.setBounds(180, 130, 60, 30);
        txtBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBruto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 170, 60, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        txtNeto = new JTextField();
        txtNeto.setBounds(180, 210, 60, 30);
        txtNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNeto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNeto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 250, 100, 30);
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
        int horasTrabajadas = Integer.parseInt(txtHoras.getText());
        char categoria = txtCategoria.getText().charAt(0);
        double horas = 0;

        if (categoria == 'A') {
            horas = 21.00;
        } else if (categoria == 'B') {
            horas = 19.50;
        } else if (categoria == 'C') {
            horas = 17.00;
        } else if (categoria == 'D') {
            horas = 15.50;
        }

        double bruto = horasTrabajadas * horas;
        double descuento;

        if (bruto > 2500) {
            descuento = bruto * 0.20;
        } else {
            descuento = bruto * 0.15;
        }

        double neto = bruto - descuento;

        txtBruto.setText(String.format("S/ %.2f", bruto));
        txtDescuento.setText(String.format("S/ %.2f", descuento));
        txtNeto.setText(String.format("S/ %.2f", neto));
    }
}
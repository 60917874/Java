package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtBilletes;
    JLabel lblCantidad, lblBilletes;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm20 frame = new frm20();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm20() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad en soles:");
        lblCantidad.setBounds(50, 50, 120, 30);
        getContentPane().add(lblCantidad);

        JLabel lblBilletes = new JLabel("Desglose:");
        lblBilletes.setBounds(50, 90, 120, 30);
        getContentPane().add(lblBilletes);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(170, 50, 100, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        txtBilletes = new JTextField();
        txtBilletes.setBounds(170, 90, 100, 30);
        txtBilletes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBilletes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtBilletes);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(170, 130, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());

        int billetes200 = cantidad / 200;
        cantidad %= 200;

        int billetes100 = cantidad / 100;
        cantidad %= 100;

        int billetes50 = cantidad / 50;
        cantidad %= 50;

        int billetes20 = cantidad / 20;
        cantidad %= 20;

        int billetes10 = cantidad / 10;
        cantidad %= 10;

        int monedas5 = cantidad / 5;
        cantidad %= 5;

        int monedas2 = cantidad / 2;
        cantidad %= 2;

        int monedas1 = cantidad;

        lblBilletes.setText("Billetes de 200: " + billetes200 + "<br>" +
                "Billetes de 100: " + billetes100 + "<br>" +
                "Billetes de 50: " + billetes50 + "<br>" +
                "Billetes de 20: " + billetes20 + "<br>" +
                "Billetes de 10: " + billetes10 + "<br>" +
                "Monedas de 5: " + monedas5 + "<br>" +
                "Monedas de 2: " + monedas2 + "<br>" +
                "Monedas de 1: " + monedas1);
    }
}
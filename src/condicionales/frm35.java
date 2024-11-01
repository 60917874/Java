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

public class frm35 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCodigo, txtTipo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm35 frame = new frm35();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm35() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(50, 50, 120, 30);
        getContentPane().add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(180, 50, 60, 30);
        txtCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCodigo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCodigo);

        JLabel lblTipo = new JLabel("Tipo de Empleado:");
        lblTipo.setBounds(50, 90, 120, 30);
        getContentPane().add(lblTipo);

        txtTipo = new JTextField();
        txtTipo.setBounds(180, 90, 120, 30);
        txtTipo.setEditable(false);
        getContentPane().add(txtTipo);

        JButton btnCalcular = new JButton("Determinar");
        btnCalcular.setBounds(90, 130, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int codigo = Integer.parseInt(txtCodigo.getText());
        String tipo;

        if (codigo % 2 == 0 && codigo % 3 == 0 && codigo % 5 == 0) {
            tipo = "Administrativo";
        } else if (codigo % 3 == 0 && codigo % 5 == 0) {
            tipo = "Directivo";
        } else if (codigo % 2 == 0) {
            tipo = "Vendedor";
        } else {
            tipo = "Seguridad";
        }

        txtTipo.setText(tipo);
    }
}
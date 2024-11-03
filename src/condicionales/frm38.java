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

public class frm38 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMes, txtAño, txtDias, txtNombre;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm38 frame = new frm38();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm38() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMes = new JLabel("Mes:");
        lblMes.setBounds(50, 30, 80, 30);
        getContentPane().add(lblMes);

        JLabel lblAño = new JLabel("Año:");
        lblAño.setBounds(50, 70, 80, 30);
        getContentPane().add(lblAño);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 110, 80, 30);
        getContentPane().add(lblNombre);

        JLabel lblDias = new JLabel("Días:");
        lblDias.setBounds(50, 150, 80, 30);
        getContentPane().add(lblDias);

        txtMes = new JTextField();
        txtMes.setBounds(150, 30, 60, 30);
        txtMes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMes.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMes);

        txtAño = new JTextField();
        txtAño.setBounds(150, 70, 60, 30);
        txtAño.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAño.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtAño);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 110, 60, 30);
        txtNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNombre);

        txtDias = new JTextField();
        txtDias.setBounds(150, 150, 60, 30);
        txtDias.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDias);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 210, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
    }

    protected void calcular() {
        int mes = Integer.parseInt(txtMes.getText());
        int año = Integer.parseInt(txtAño.getText());
        int dias = 0;
        String Mes = "";

        if (mes == 1) {
            Mes = "Enero";
            dias = 31;
        } else if (mes == 2) {
            dias = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0) ? 29 : 28;
            Mes = "Febrero";
        } else if (mes == 3) {
            Mes = "Marzo";
            dias = 31;
        } else if (mes == 4) {
            Mes = "Abril";
            dias = 30;
        } else if (mes == 5) {
            Mes = "Mayo";
            dias = 31;
        } else if (mes == 6) {
            Mes = "Junio";
            dias = 30;
        } else if (mes == 7) {
            Mes = "Julio";
            dias = 31;
        } else if (mes == 8) {
            Mes = "Agosto";
            dias = 31;
        } else if (mes == 9) {
            Mes = "Septiembre";
            dias = 30;
        } else if (mes == 10) {
            Mes = "Octubre";
            dias = 31;
        } else if (mes == 11) {
            Mes = "Noviembre";
            dias = 30;
        } else if (mes == 12) {
            Mes = "Diciembre";
            dias = 31;
        }

        txtNombre.setText(Mes);
        txtDias.setText(String.valueOf(dias));
    }
}
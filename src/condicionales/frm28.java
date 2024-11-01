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

public class frm28 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHoraEntrada, txtHoraSalida, txtMensaje;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm28 frame = new frm28();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm28() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHoraEntrada = new JLabel("12 Horas:");
        lblHoraEntrada.setBounds(50, 30, 120, 30);
        getContentPane().add(lblHoraEntrada);

        JLabel lblHoraSalida = new JLabel("24 Horas:");
        lblHoraSalida.setBounds(50, 80, 120, 30);
        getContentPane().add(lblHoraSalida);

        txtHoraEntrada = new JTextField();
        txtHoraEntrada.setBounds(150, 30, 100, 30);
        txtHoraEntrada.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHoraEntrada.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtHoraEntrada);

        txtHoraSalida = new JTextField();
        txtHoraSalida.setBounds(150, 80, 100, 30);
        txtHoraSalida.setHorizontalAlignment(SwingConstants.RIGHT);
        txtHoraSalida.setMargin(new Insets(5, 5, 5, 5));
        txtHoraSalida.setEditable(false);
        getContentPane().add(txtHoraSalida);

        txtMensaje = new JTextField();
        txtMensaje.setBounds(50, 130, 200, 30);
        txtMensaje.setEditable(false);
        getContentPane().add(txtMensaje);

        JButton btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(90, 180, 100, 30);
        getContentPane().add(btnConvertir);

        btnConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnConvertir_actionPerformed();
            }
        });
    }

    protected void btnConvertir_actionPerformed() {
        String horaEntradaStr = txtHoraEntrada.getText();
        String[] partes = horaEntradaStr.split(":");
        
        if (partes.length != 2) {
            txtMensaje.setText("Formato inválido");
            txtHoraSalida.setText("");
            return;
        }

        int hora = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
            txtMensaje.setText("Hora inválida");
            txtHoraSalida.setText("");
        } else {
            String ampm = (hora < 12) ? "AM" : "PM";
            if (hora == 0) {
                hora = 12;
            } else if (hora > 12) {
                hora -= 12;
            }
            txtHoraSalida.setText(String.format("%d:%02d %s", hora, minutos, ampm));
            txtMensaje.setText("");
        }
    }
}
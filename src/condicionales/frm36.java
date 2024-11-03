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

public class frm36 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCuadernos, txtLapiceros;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm36 frame = new frm36();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm36() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCuadernos = new JLabel("Cuadernos adquiridos:");
        lblCuadernos.setBounds(50, 50, 150, 30);
        getContentPane().add(lblCuadernos);

        txtCuadernos = new JTextField();
        txtCuadernos.setBounds(200, 50, 60, 30);
        txtCuadernos.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCuadernos.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCuadernos);

        JLabel lblLapiceros = new JLabel("Lapiceros obsequiados:");
        lblLapiceros.setBounds(50, 90, 150, 30);
        getContentPane().add(lblLapiceros);

        txtLapiceros = new JTextField();
        txtLapiceros.setBounds(200, 90, 60, 30);
        getContentPane().add(txtLapiceros);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 140, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int cuadernos = Integer.parseInt(txtCuadernos.getText());
        int Lucas = 0;
        int Faber = 0;
        int Pilot = 0;

        if (cuadernos < 12) {
            Lucas = 0;
            Faber = 0;
            Pilot = 0;
        } else if (cuadernos < 24) {
            Lucas = cuadernos / 4;
        } else if (cuadernos < 36) {
            Faber = (cuadernos / 4) * 2;
        } else {
            Pilot = (cuadernos / 4) * 2;
            Faber = (cuadernos / 6);
            Lucas = (cuadernos / 12);
        }

        int total = Lucas + Faber + Pilot;

        txtLapiceros.setText(String.valueOf(total));
    }
}
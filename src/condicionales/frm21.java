package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm21 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtEstado, txtEdad, txtSexo;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm21 frame = new frm21();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm21() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(30, 30, 150, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        JLabel lblEstado = new JLabel("Estado Civil:");
        lblEstado.setBounds(30, 80, 150, 30);
        getContentPane().add(lblEstado);

        txtEstado = new JTextField();
        txtEstado.setBounds(180, 80, 100, 30);
        txtEstado.setEditable(false);
        txtEstado.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtEstado);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(30, 130, 150, 30);
        getContentPane().add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(180, 130, 100, 30);
        txtEdad.setEditable(false);
        txtEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtEdad);

        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(30, 180, 150, 30);
        getContentPane().add(lblSexo);

        txtSexo = new JTextField();
        txtSexo.setBounds(180, 180, 100, 30);
        txtSexo.setEditable(false);
        txtSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSexo);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 220, 250, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());

        int estado = numero / 1000;
        int edad = (numero / 10) % 100;
        int sexo = numero % 10; 

        String estadoStr;
        if (estado == 1) {
            estadoStr = "Soltero";
        } else if (estado == 2) {
            estadoStr = "Casado";
        } else if (estado == 3) {
            estadoStr = "Divorciado";
        } else if (estado == 4) {
            estadoStr = "Viudo";
        } else {
            estadoStr = "Error";
        }

        String sexoStr;
        if (sexo == 1) {
            sexoStr = "Masculino";
        } else if (sexo == 2) {
            sexoStr = "Femenino";
        } else {
            sexoStr = "Error";
        }

        txtEstado.setText(estadoStr);
        txtEdad.setText(String.valueOf(edad));
        txtSexo.setText(sexoStr);
    }
}
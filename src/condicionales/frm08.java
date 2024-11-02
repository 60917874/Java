package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtExamenes, txtTotal;
    JLabel lblExamenes, lblTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm08 frame = new frm08();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblExamenes = new JLabel("Exámenes aprobados:");
        lblExamenes.setBounds(50, 50, 150, 30);
        getContentPane().add(lblExamenes);

        JLabel lblTotal = new JLabel("Total:");
        lblTotal.setBounds(50, 90, 100, 30);
        getContentPane().add(lblTotal);

        txtExamenes = new JTextField();
        txtExamenes.setBounds(180, 50, 60, 30);
        txtExamenes.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtExamenes);

        txtTotal = new JTextField();
        txtTotal.setBounds(180, 90, 80, 30);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 149, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int examenesAprobados = Integer.parseInt(txtExamenes.getText());

        int propinaInicial = 20;
        int propinaAdicional = 0;

        if (examenesAprobados == 0) {
            propinaAdicional = 0;
        } else if (examenesAprobados == 1) {
            propinaAdicional = 5;
        } else if (examenesAprobados == 2) {
            propinaAdicional = 10;
        } else if (examenesAprobados >= 3) {
            propinaAdicional = 15;
        }

        int total = propinaInicial + propinaAdicional;

        txtTotal.setText("S/ " + total);
    }
}
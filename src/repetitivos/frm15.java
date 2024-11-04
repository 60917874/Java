package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtTexto, txtMayusculas, txtMinusculas;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm15 frame = new frm15();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblTexto = new JLabel("Texto:");
        lblTexto.setBounds(50, 50, 150, 30);
        getContentPane().add(lblTexto);

        txtTexto = new JTextField();
        txtTexto.setBounds(200, 50, 150, 30);
        txtTexto.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtTexto);

        JLabel lblMayusculas = new JLabel("Mayúsculas:");
        lblMayusculas.setBounds(50, 100, 150, 30);
        getContentPane().add(lblMayusculas);

        txtMayusculas = new JTextField();
        txtMayusculas.setBounds(200, 100, 150, 30);
        getContentPane().add(txtMayusculas);

        JLabel lblMinusculas = new JLabel("Minúsculas:");
        lblMinusculas.setBounds(50, 150, 150, 30);
        getContentPane().add(lblMinusculas);

        txtMinusculas = new JTextField();
        txtMinusculas.setBounds(200, 150, 150, 30);
        getContentPane().add(txtMinusculas);

        JButton btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(150, 200, 100, 30);
        getContentPane().add(btnConvertir);

        btnConvertir.addActionListener(e -> btnConvertir_actionPerformed());
    }

    protected void btnConvertir_actionPerformed() {
        String texto = txtTexto.getText();
        String mayusculas = convertirAMayusculas(texto);
        String minusculas = convertirAMinusculas(texto);

        txtMayusculas.setText(mayusculas);
        txtMinusculas.setText(minusculas);
    }

    private String convertirAMayusculas(String texto) {
        return texto.toUpperCase();
    }

    private String convertirAMinusculas(String texto) {
        return texto.toLowerCase();
    }
}
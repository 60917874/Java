package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Empleado;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Planillas extends JFrame implements Runnable {
    private static final long serialVersionUID = -7462964579966043427L;
    JLabel lblEmpleado, lblPC, lblIP, lblFecha, lblHora, lblMensaje;

    Empleado empleado = new Empleado();
    Thread thHora;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Planillas frame = new Planillas();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Planillas() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1024, 768);
        setLayout(null);
        setLocationRelativeTo(null);
        setUndecorated(true);

        JPanel pnlPlanillas = new JPanel();
        pnlPlanillas.setBounds(0, 0, 1024, 60);
        pnlPlanillas.setBackground(new Color(94, 17, 90));
        pnlPlanillas.setLayout(null);
        getContentPane().add(pnlPlanillas);

        JLabel imgLogo = new JLabel();
        imgLogo.setIcon(new ImageIcon(Login.class.getResource("/ui/img/logo.png")));
        imgLogo.setBounds(10, 7, 208, 43);
        pnlPlanillas.add(imgLogo);

        JLabel imgSalir = new JLabel();
        imgSalir.setIcon(new ImageIcon(Login.class.getResource("/ui/img/salir.png")));
        imgSalir.setBounds(980, 18, 24, 34);
        pnlPlanillas.add(imgSalir);

        JLabel lblMensaje = new JLabel();
        lblMensaje.setBounds(20, 51, 1024, 39);
        getContentPane().add(lblMensaje);

        JLabel lblEmpleado = new JLabel();
        lblEmpleado.setBounds(20, 51, 1024, 39);
        getContentPane().add(lblEmpleado);

        JLabel imgFondo = new JLabel();
        imgFondo.setIcon(new ImageIcon(Login.class.getResource("/ui/img/fondoApp.png")));
        imgFondo.setBounds(0, 100, 1024, 628);
        getContentPane().add(imgFondo);

        lblMensaje = new JLabel();
        lblMensaje.setBounds(20, 65, 1024, 30);
        lblMensaje.setVerticalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblMensaje);

        lblEmpleado = new JLabel();
        lblEmpleado.setBounds(20, 728, 150, 40);
        getContentPane().add(lblEmpleado);

        lblPC = new JLabel();
        lblPC.setBounds(300, 728, 150, 40);
        getContentPane().add(lblPC);

        lblIP = new JLabel();
        lblIP.setBounds(500, 728, 150, 40);
        getContentPane().add(lblIP);

        lblFecha = new JLabel();
        lblFecha.setBounds(700, 728, 150, 40);
        getContentPane().add(lblFecha);

        lblHora = new JLabel();
        lblHora.setBounds(900, 728, 120, 40);
        getContentPane().add(lblHora);

        JButton btnTrabajadores = new JButton("Trabajadores");
        btnTrabajadores.setBounds(250, 0, 150, 60);
        btnTrabajadores.setBackground(new Color(94, 17, 90));
        btnTrabajadores.setBorderPainted(false);
        btnTrabajadores.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnTrabajadores.setFocusPainted(false);
        btnTrabajadores.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnTrabajadores.setForeground(Color.WHITE);
        pnlPlanillas.add(btnTrabajadores);

        JButton btnPLanillas = new JButton("Planillas");
        btnPLanillas.setBounds(400, 0, 150, 60);
        btnPLanillas.setBackground(new Color(94, 17, 90));
        btnPLanillas.setBorderPainted(false);
        btnPLanillas.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPLanillas.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnPLanillas.setFocusPainted(false);
        btnPLanillas.setForeground(Color.WHITE);
        pnlPlanillas.add(btnPLanillas);

        JButton btnInformes = new JButton("Informes");
        btnInformes.setBounds(550, 0, 150, 60);
        btnInformes.setBackground(new Color(94, 17, 90));
        btnInformes.setBorderPainted(false);
        btnInformes.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnInformes.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnInformes.setFocusPainted(false);
        btnInformes.setForeground(Color.WHITE);
        pnlPlanillas.add(btnInformes);

        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                form_windowOpened();
            }
        });

        imgSalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                imgSalir_mouseClicked();
            }
        });

        btnTrabajadores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn_mouseEntered(btnTrabajadores);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btn_mouseExited(btnTrabajadores);
            }
        });

        btnPLanillas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn_mouseEntered(btnPLanillas);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btn_mouseExited(btnPLanillas);
            }
        });

        btnInformes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn_mouseEntered(btnInformes);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btn_mouseExited(btnInformes);
            }
        });

        btnTrabajadores.addActionListener(e -> btn_actionPerformed(btnTrabajadores));
        btnPLanillas.addActionListener(e -> btn_actionPerformed(btnPLanillas));
        btnInformes.addActionListener(e -> btn_actionPerformed(btnInformes));

    }

    protected void form_windowOpened() {
        lblMensaje.setText("Hola" + empleado.getApellidoPaterno() + ", Bienvenido al sistema de planillas");
        lblEmpleado
                .setText(String.format("Empleado :  %S %S %S", empleado.getNombres(), empleado.getApellidoPaterno()));
        lblPC.setText("PC : ");
        lblIP.setText("IP : ");
        lblFecha.setText(new SimpleDateFormat(" 'Fecha : ' dd/MM/yyyy").format(new Date()));

    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;

    }

    protected void imgSalir_mouseClicked() {
        if (JOptionPane.showConfirmDialog(this, "¿Deseas Salir", "Salir",
                JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION)
            ;
        thHora.interrupt();
        System.exit(0);

    }

    protected void btn_mouseEntered(JButton btn) {
        btn.setBackground(new Color(104, 27, 100));
    }

    protected void btn_mouseExited(JButton btn) {
        btn.setBackground(new Color(94, 17, 90));
    }

    protected void btn_actionPerformed(JButton btn) {
        btn.setBackground(new Color(250, 250, 250));
        btn.setForeground(Color.BLACK);
    }

    @Override
    public void run() {
        SimpleDateFormat df = new SimpleDateFormat("Hora: 'hh:mm:ss");
        while (true) {
            lblHora.setText(df.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
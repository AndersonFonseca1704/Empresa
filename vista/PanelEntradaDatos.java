package vista;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelEntradaDatos extends JPanel {
    private JLabel lbTitulo;
    private JLabel lbNombreEmpleado;
    private JLabel lbNumeroHoras;
    private JLabel lbValoracionHora;
    private JLabel lbFechaNacimiento;
    private JLabel lbFechaIngreso;
    
   
    private static JTextField tfNombreEmpleado;
    private static JTextField tfNumeroHoras;
    private static JTextField tfValoracionHora;
    private static JTextField tfFechaNacimiento;
    private static JTextField tfFechaIngreso;

    public PanelEntradaDatos() {
        lbTitulo = new JLabel("EMPRESA", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Algerian", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(0, 0, 572, 30);
        this.add(lbTitulo);

        lbNombreEmpleado = new JLabel("Nombre:");
        lbNombreEmpleado.setFont(new Font("Algerian", Font.PLAIN, 18));
        lbNombreEmpleado.setForeground(Color.BLACK);
        lbNombreEmpleado.setBounds(10, 60, 480, 30);
        this.add(lbNombreEmpleado);

        tfNombreEmpleado = new JTextField();
        tfNombreEmpleado.setFont(new Font("Algerian", Font.PLAIN, 18));
        tfNombreEmpleado.setForeground(Color.BLACK);
        tfNombreEmpleado.setBounds(105, 60, 190, 30);
        this.add(tfNombreEmpleado);

        lbNumeroHoras = new JLabel("Horas:");
        lbNumeroHoras.setFont(new Font("Algerian", Font.PLAIN, 18));
        lbNumeroHoras.setForeground(Color.BLACK);
        lbNumeroHoras.setBounds(300, 60, 480, 30);
        this.add(lbNumeroHoras);

        tfNumeroHoras = new JTextField();
        tfNumeroHoras.setFont(new Font("Algerian", Font.PLAIN, 18));
        tfNumeroHoras.setForeground(Color.BLACK);
        tfNumeroHoras.setBounds(375, 60, 190, 30);
        this.add(tfNumeroHoras);

        lbValoracionHora = new JLabel("Salario:");
        lbValoracionHora.setFont(new Font("Algerian", Font.PLAIN, 18));
        lbValoracionHora.setForeground(Color.BLACK);
        lbValoracionHora.setBounds(10, 140, 480, 30);
        this.add(lbValoracionHora);

        tfValoracionHora = new JTextField();
        tfValoracionHora.setFont(new Font("Algerian", Font.PLAIN, 18));
        tfValoracionHora.setForeground(Color.BLACK);
        tfValoracionHora.setBounds(105, 140, 190, 30);
        this.add(tfValoracionHora);

        lbFechaNacimiento = new JLabel("Nacimiento:");
        lbFechaNacimiento.setFont(new Font("Algerian", Font.PLAIN, 18));
        lbFechaNacimiento.setForeground(Color.BLACK);
        lbFechaNacimiento.setBounds(10, 210, 480, 30);
        this.add(lbFechaNacimiento);

        tfFechaNacimiento = new JTextField();
        tfFechaNacimiento.setFont(new Font("Algerian", Font.PLAIN, 18));
        tfFechaNacimiento.setForeground(Color.BLACK);
        tfFechaNacimiento.setBounds(130, 210, 190, 30);
        this.add(tfFechaNacimiento);

        lbFechaIngreso = new JLabel("Ingreso:");
        lbFechaIngreso.setFont(new Font("Algerian", Font.PLAIN, 18));
        lbFechaIngreso.setForeground(Color.BLACK);
        lbFechaIngreso.setBounds(300, 140, 480, 30);
        this.add(lbFechaIngreso);

        tfFechaIngreso = new JTextField();
        tfFechaIngreso.setFont(new Font("Algerian", Font.PLAIN, 18));
        tfFechaIngreso.setForeground(Color.BLACK);
        tfFechaIngreso.setBounds(375, 140, 190, 30);
        this.add(tfFechaIngreso);

      

        this.setLayout(null);
        this.setBackground(Color.decode("#CD5C5C"));
        this.setVisible(true);
    }

    public static String getTfNombre() {
        return tfNombreEmpleado.getText();
    }

    public static String getTfHoras() {
        return tfNumeroHoras.getText();
    }

    public static String getTfValoracion() {
        return tfValoracionHora.getText();
    }

    public static String getTfFechaNacimiento() {
        return tfFechaNacimiento.getText();
    }

    public static String getTfFechaIngreso() {
        return tfFechaIngreso.getText();
    }

    public static void borrarTf() {
        JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Caso Empresa", JOptionPane.WARNING_MESSAGE);
        tfNombreEmpleado.setText("");
        tfNumeroHoras.setText("");
        tfValoracionHora.setText("");
        PanelResultados.taResultados.setText("");
    }
}

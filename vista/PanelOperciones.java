package vista;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class PanelOperciones extends JPanel {
    public static JButton btnCalcular;
    public static JButton btnCrear;
    public JButton btnBorrar;
    public JButton btnSalir;

    public PanelOperciones() {
        btnCalcular = new JButton("Calcular");
        btnCalcular.setFont(new Font("Arial", Font.PLAIN, 10));
        btnCalcular.setForeground(Color.BLUE);
        btnCalcular.setBackground(Color.RED);
        btnCalcular.setBorder(BorderFactory.createRaisedBevelBorder());
        btnCalcular.setBounds(10, 22, 95, 40);
        btnCalcular.setActionCommand("calcularGasto");

        btnCrear = new JButton("Crear");
        btnCrear.setFont(new Font("Arial", Font.PLAIN, 10));
        btnCrear.setForeground(Color.BLUE);
        btnCrear.setBackground(Color.RED);
        btnCrear.setBorder(BorderFactory.createRaisedBevelBorder());
        btnCrear.setBounds(115, 22, 95, 40);
        btnCrear.setActionCommand("crearEmpleado");

        btnBorrar = new JButton("Borrar");
        btnBorrar.setFont(new Font("Arial", Font.PLAIN, 10));
        btnBorrar.setForeground(Color.BLUE);
        btnBorrar.setBackground(Color.RED);
        btnBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
        btnBorrar.setBounds(220, 22, 95, 40);
        btnBorrar.setActionCommand("borrartex");

        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 10));
        btnSalir.setForeground(Color.BLUE);
        btnSalir.setBackground(Color.RED);
        btnSalir.setBorder(BorderFactory.createRaisedBevelBorder());
        btnSalir.setBounds(325, 22, 95, 40);
        btnSalir.setActionCommand("cerrarVentana");

        this.setLayout(null);
        this.setBackground(Color.decode("#CD5C5C"));
        this.setVisible(true);
        this.add(btnCalcular);
        this.add(btnCrear);
        this.add(btnBorrar);
        this.add(btnSalir);
    }

    public static void desactivarBotonCalcular() {
        btnCalcular.setEnabled(false);
        btnCrear.setEnabled(true);
    }

    public static void activarBotonCalcular() {
        btnCalcular.setEnabled(true);
        btnCrear.setEnabled(false);
    }
}

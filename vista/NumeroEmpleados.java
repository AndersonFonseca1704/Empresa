package vista;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.SwingConstants;

public class NumeroEmpleados extends JDialog {
        private JLabel lbTitulo;
        private JLabel lbEmpleados;
        private static JTextField tfEmpleados;
        public JButton btnAceptar;

        public NumeroEmpleados() {
                lbTitulo = new JLabel("Número de empleados", SwingConstants.CENTER);
                lbTitulo.setFont(new Font("Algerian", Font.BOLD, 25));
                lbTitulo.setBounds(10, 10, 280, 20);

                lbEmpleados = new JLabel("Empleados = ", SwingConstants.RIGHT);
                lbEmpleados.setFont(new Font("Algerian", Font.BOLD, 25));
                lbEmpleados.setBounds(10, 50, 140, 20);

                tfEmpleados = new JTextField();
                tfEmpleados.setFont(new Font("Algerian", Font.BOLD, 25));
                tfEmpleados.setBounds(150, 50, 100, 25);

                btnAceptar = new JButton("Aceptar");
                btnAceptar.setFont(new Font("Algerian", Font.BOLD, 25));
                btnAceptar.setBounds(20, 140, 260, 25);
                btnAceptar.setActionCommand("aceptarVentana");

                this.setLayout(null);
                this.add(lbTitulo);
                this.add(lbEmpleados);
                this.add(tfEmpleados);
                this.add(btnAceptar);
                this.setTitle("Empresa");
                this.setSize(300, 300);
                this.setLocationRelativeTo(null);
                this.setResizable(false);
                this.setVisible(true);

                
        }

        public static String getEmpleados() {
                return tfEmpleados.getText();
        }

        public void cerrarDialogo() {
                this.dispose();
        }
}

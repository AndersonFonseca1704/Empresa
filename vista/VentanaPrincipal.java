package vista;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class VentanaPrincipal extends JFrame {
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperciones miPanelOperciones;
    public PanelResultados miPanelResultados;
    public NumeroEmpleados miNumeroEmpleados;

    public VentanaPrincipal() {
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10, 10, 572, 260);

        miPanelOperciones = new PanelOperciones();
        miPanelOperciones.setBounds(10, 280, 572, 80);

        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10, 370, 572, 288);

        this.setTitle(" Empresa");
        this.setSize(600, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.add(miPanelEntradaDatos);
        this.add(miPanelOperciones);
        this.add(miPanelResultados);

        miNumeroEmpleados = new NumeroEmpleados();
        miNumeroEmpleados.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }
}

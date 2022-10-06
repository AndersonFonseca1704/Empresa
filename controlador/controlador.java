package controlador;

import modelo.Empleado;
import vista.VentanaPrincipal;
import vista.NumeroEmpleados;
import vista.PanelEntradaDatos;
import vista.PanelOperciones;
import vista.PanelResultados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controlador implements ActionListener {
        private VentanaPrincipal miVentanaPrincipal;
        private Empleado[] miListaEmpleados;
        private int numeroEmpleados;
        private int indice;
        private int gastoTotal;

        public controlador(VentanaPrincipal miVentanaPrincipal, Empleado modelo) {
                this.miVentanaPrincipal = miVentanaPrincipal;
                this.miVentanaPrincipal.miNumeroEmpleados.btnAceptar.addActionListener(this);
                PanelOperciones.btnCalcular.addActionListener(this);
                PanelOperciones.btnCrear.addActionListener(this);
                this.miVentanaPrincipal.miPanelOperciones.btnBorrar.addActionListener(this);
                this.miVentanaPrincipal.miPanelOperciones.btnSalir.addActionListener(this);
        }

        public void actionPerformed(ActionEvent ae) {
                String comando = ae.getActionCommand();

                if (comando.equals("aceptarVentana")) {
                        indice = 0;
                        numeroEmpleados = Integer
                                        .parseInt(NumeroEmpleados.getEmpleados());
                        PanelResultados.mostrarResultados("La empresa posee " + numeroEmpleados + " empleados en total!\n");
                        miListaEmpleados = Empleado.crearListaEmpleados(numeroEmpleados);
                        miVentanaPrincipal.miNumeroEmpleados.cerrarDialogo();
                        PanelOperciones.desactivarBotonCalcular();
                } else if (comando.equals("calcularGasto")) {
                        gastoTotal = 0;
                        for (int i = 0; i < numeroEmpleados; i++) {
                                gastoTotal += miListaEmpleados[i].calcularSalarioEmpleado(
                                                miListaEmpleados[i].getNumeroHorasMensuales(),
                                                miListaEmpleados[i].getValoracionHora());
                        }
                        PanelResultados.mostrarResultados("El gasto total es de " + gastoTotal);

                } else if (comando.equals("crearEmpleado")) {
                        if (indice <= numeroEmpleados - 1) {
                                String nombreEmpleado = PanelEntradaDatos.getTfNombre();
                                int numeroHoras = Integer.parseInt(PanelEntradaDatos.getTfHoras());
                                int valoracionHora = Integer.parseInt(PanelEntradaDatos.getTfValoracion());
                                int fechaNacimiento = Integer.parseInt(PanelEntradaDatos.getTfFechaNacimiento());
                                int fechaIngreso = Integer.parseInt(PanelEntradaDatos.getTfFechaIngreso());
                                Empleado miEmpleado = new Empleado(nombreEmpleado, numeroHoras, valoracionHora,
                                                fechaNacimiento, fechaIngreso);
                                miListaEmpleados[indice] = miEmpleado;
                                PanelResultados.mostrarResultados(
                                                "El empleado " + nombreEmpleado + " con "
                                                                + Empleado.calcularEdadEmpleado(fechaNacimiento)
                                                                + " años de edad y con "
                                                                + Empleado.calcularAntiguedadEmpleado(fechaIngreso)
                                                                + " años de antiguedad en la empresa!\n");
                                indice++;
                        } else {
                                JOptionPane.showMessageDialog(null, "No hay empleado disponibles");
                                PanelOperciones.activarBotonCalcular();
                        }

                } else if (comando.equals("borrarTexto")) {
                        vista.PanelEntradaDatos.borrarTf();
                } else if (comando.equals("cerrarVentana")) {
                        JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Caso Empresa",
                                        JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                }
        }
}
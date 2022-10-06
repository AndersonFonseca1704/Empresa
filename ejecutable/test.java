package ejecutable;

import modelo.Empleado;
import controlador.controlador;
import vista.VentanaPrincipal;

public class test {
        public static void main(String[] args) {
                Empleado miEmpleado = new Empleado();
                VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
                new controlador(miVentanaPrincipal, miEmpleado);
        }
}

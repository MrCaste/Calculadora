import Controlador.ControladorCalculadora;
import Modelo.modeloCalculadora;
import Vista.VistaCalculadora;

public class App {
    public static void main(String[] args) throws Exception {
        VistaCalculadora vista = new VistaCalculadora();
        modeloCalculadora modelo = new modeloCalculadora();
        @SuppressWarnings("unused")
        ControladorCalculadora calculadora = new ControladorCalculadora(modelo,vista);
    }
}

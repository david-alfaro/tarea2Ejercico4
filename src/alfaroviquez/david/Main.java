package alfaroviquez.david;

import alfaroviquez.david.controlador.Controlador;

/**
 * Clase principal
 * Se ejecuta el controlador para correr el programa
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 24/10/2020
 */
public class Main {

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.ejecutarPrograma();
    }
}

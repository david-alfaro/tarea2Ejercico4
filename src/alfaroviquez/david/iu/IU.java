package alfaroviquez.david.iu;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Clase IU (Interfaz de Usuario)
 * En esta classe se crean todos los metodos para poder imprimir mensajes para el usuario en consola,
 * y para capturar las entradas del usuario
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 24/10/2020
 */
public class IU {
    PrintStream output = new PrintStream(System.out);
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo para mostrar el menu en pantalla
     */
    public void mostrarMenu(){
        output.println("***********Veterinaria Moka**************");
        output.println("1. Registrar dueño de mascota");
        output.println("2. Registrar mascota");
        output.println("3. Crear cita");
        output.println("4. Crear reservación");
        output.println("5. Registrar empleado");
        output.println("6. Listar dueños");
        output.println("7. Listar mascotas");
        output.println("8. Listar citas");
        output.println("9. Listar reservaciones");
        output.println("10. Listar empleados");
        output.println("11. Salir");
    }

    /**
     * Funcion para leer una linea de texto del usuario
     * @return retorna una linea de texto
     */
    public String leerTexto(){
        return input.next();
    }

    /**
     * Funcion para lerr un numero entero indicado por el usuario
     * @return retorna un numero entero
     */
    public int leerNumero(){
        return input.nextInt();
    }

    /**
     * Metodo para imprimir mensajes en consola
     * @param msg mensaje a imprimir
     */
    public void imprimirMensaje(String msg){
        output.println(msg);
    }
}

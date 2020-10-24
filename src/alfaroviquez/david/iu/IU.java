package alfaroviquez.david.iu;

import java.io.PrintStream;
import java.util.Scanner;

public class IU {
    PrintStream output = new PrintStream(System.out);
    Scanner input = new Scanner(System.in).useDelimiter("\n");

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
    public String leerTexto(){
        return input.next();
    }
    public int leerNumero(){
        return input.nextInt();
    }
    public void imprimirMensaje(String msg){
        output.println(msg);
    }
}

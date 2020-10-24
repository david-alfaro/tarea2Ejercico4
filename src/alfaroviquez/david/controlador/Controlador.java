package alfaroviquez.david.controlador;

import alfaroviquez.david.bl.entidades.DuennoMascota;
import alfaroviquez.david.bl.entidades.Mascota;
import alfaroviquez.david.bl.logica.Gestor;
import alfaroviquez.david.iu.IU;

public class Controlador {
    Gestor gestor = new Gestor();
    IU iu = new IU();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            iu.mostrarMenu();
            opcion = iu.leerNumero();
            procesarOpcion(opcion);
        } while (opcion != 11);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarDuenno();
                break;
            case 2:
                registrarMascota();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                listarDuennosMascota();
                break;
            case 7:
                listarMascotas();
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            default:
                iu.imprimirMensaje("Escoja una opcion valida");
        }
    }

    private void registrarDuenno() {
        iu.imprimirMensaje("***Registrar Dueño de Mascota***");
        iu.imprimirMensaje("Nombre: ");
        String nombre = iu.leerTexto();
        iu.imprimirMensaje("Primer apellido: ");
        String apellido1 = iu.leerTexto();
        iu.imprimirMensaje("Segundo apellido: ");
        String apellido2 = iu.leerTexto();
        iu.imprimirMensaje("Cedula: ");
        String cedula = iu.leerTexto();
        iu.imprimirMensaje("Telefono: ");
        String telefono = iu.leerTexto();
        iu.imprimirMensaje("Direccion: ");
        String direccion = iu.leerTexto();
        gestor.registrarDuennoMascosta(nombre, apellido1, apellido2, cedula, telefono, direccion);
        iu.imprimirMensaje("Cliente registrado exitosamente! ");

    }

    private void listarDuennosMascota() {
        for (DuennoMascota duenno : gestor.listarDuennos()
        ) {
            iu.imprimirMensaje(duenno.toString());
        }
    }

    public void registrarMascota() {
        iu.imprimirMensaje("***Registrar Mascota***");
        iu.imprimirMensaje("Nombre: ");
        String nombre = iu.leerTexto();
        iu.imprimirMensaje("Identificacion del dueño: ");
        String cedula = iu.leerTexto();
        DuennoMascota duenno = gestor.buscarDuenno(cedula);
        iu.imprimirMensaje("Foto: ");
        String foto = iu.leerTexto();
        iu.imprimirMensaje("Observaciones: ");
        String observaciones = iu.leerTexto();
        iu.imprimirMensaje("Ranking de la mascota: ");
        int ranking = iu.leerNumero();
        gestor.crearMascota(nombre, duenno, foto, observaciones, ranking);
        iu.imprimirMensaje("Mascota registrada exitosamente! ");
    }

    public void listarMascotas() {
        for (Mascota mascota : gestor.listarMascotas()
        ) {
            iu.imprimirMensaje(mascota.toString());
        }
    }
}

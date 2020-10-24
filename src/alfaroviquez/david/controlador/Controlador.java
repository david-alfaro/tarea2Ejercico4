package alfaroviquez.david.controlador;

import alfaroviquez.david.bl.entidades.*;
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
                registrarCita();
                break;
            case 4:
                registrarReservacion();
                break;
            case 5:
                registrarEmpleado();
                break;
            case 6:
                listarDuennosMascota();
                break;
            case 7:
                listarMascotas();
                break;
            case 8:
                listarCitas();
                break;
            case 9:
                listarReservaciones();
                break;
            case 10:
                listarEmpleados();
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

    public void registrarCita() {
        iu.imprimirMensaje("***Registrar Cita***");
        iu.imprimirMensaje("Nombre de mascota: ");
        String nombre = iu.leerTexto();
        iu.imprimirMensaje("Fecha de la cita (dd/MM/yyyy): ");
        String fechaCita = iu.leerTexto();
        iu.imprimirMensaje("Hora de la cita (00:00:00): ");
        String horaCita = iu.leerTexto();
        iu.imprimirMensaje("Observaciones: ");
        String observaciones = iu.leerTexto();
        gestor.crearCita(nombre, fechaCita, horaCita, observaciones);
        iu.imprimirMensaje("Se ha creado una cita de forma exitosa!");
    }

    public void listarCitas() {
        for (Cita cita : gestor.listarCitas()
        ) {
            iu.imprimirMensaje(cita.toString());
        }
    }

    public void registrarReservacion() {
        iu.imprimirMensaje("***Registrar reservacion de hotel para mascota***");
        iu.imprimirMensaje("Ingrese el nombre de la mascota: ");
        String nombre = iu.leerTexto();
        iu.imprimirMensaje("Fecha de entrada (dd/MM/yyyy): ");
        String fechaEntrada = iu.leerTexto();
        iu.imprimirMensaje("Fecha de salida (dd/MM/yyyy): ");
        String fechaSalida = iu.leerTexto();
        gestor.crearReservacion(nombre, fechaEntrada, fechaSalida);
        iu.imprimirMensaje("Reservacion creada!");
    }

    public void listarReservaciones() {
        for (Reservacion reservacion : gestor.listarReservaciones()
        ) {
            iu.imprimirMensaje(reservacion.toString());
        }
    }

    public void registrarEmpleado() {
        iu.imprimirMensaje("***Registrar empleado de Veterinaria MOKA***");
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
        iu.imprimirMensaje("Estado: (Activo/Inactivo)");
        String estado = iu.leerTexto();
        iu.imprimirMensaje("Rol (Doctor(a)/Secretaria(o): ");
        String rol = iu.leerTexto();
        gestor.crearUsuario(nombre, apellido1, apellido2, cedula, telefono, direccion, estado, rol);
        iu.imprimirMensaje("Empleado registrado");
    }

    public void listarEmpleados() {
        for (Usuario empleado : gestor.listarUsuarios()
        ) {
            iu.imprimirMensaje(empleado.toString());
        }
    }
}

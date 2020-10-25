package alfaroviquez.david.bl.logica;

import alfaroviquez.david.bl.entidades.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Clase Gestor
 * En esta clase se recibe la informacion que viene del controlador para poder instanciar los diferentes objetos
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 24/10/2020
 */
public class Gestor {

    ArrayList<DuennoMascota> duennoMascotas;
    ArrayList<Mascota> mascotas;
    ArrayList<Cita> citas;
    ArrayList<Reservacion> reservaciones;
    ArrayList<Usuario> usuarios;

    public Gestor() {
        this.duennoMascotas = new ArrayList<>();
        this.mascotas = new ArrayList<>();
        this.citas = new ArrayList<>();
        this.reservaciones = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    /**
     * Metodo para crear Duenos de mascotas
     *
     * @param nombre del duenno, String
     * @param apellido1 del duenno, String
     * @param apellido2 del duenno, String
     * @param cedula del duenno, String
     * @param telefono del duenno, String
     * @param direccion del duenno, String
     */

    public void registrarDuennoMascosta(String nombre, String apellido1, String apellido2, String cedula, String telefono, String direccion) {
        DuennoMascota duenno = new DuennoMascota(nombre,apellido1,apellido2,cedula,telefono,direccion);
        if(duennoMascotas.contains(duenno.getCedula())){
            System.out.println("El cliente ya esta registrado");
        }else {
            duennoMascotas.add(duenno);
        }


    }

    /**
     * Funcion para listar Duenos de mascotas
     * @return los elementos que hay en el arraylist
     */
    public ArrayList<DuennoMascota> listarDuennos(){
        return this.duennoMascotas;
    }

    /**
     * Metodo para crear instancias de la clase mascota
     *
     * @param nombre de la mascota, String
     * @param duenno de la mascota, String
     * @param foto de la mascota, String
     * @param observaciones de la mascota, String
     * @param ranking de la mascota, String
     */
    public void crearMascota(String nombre,DuennoMascota duenno, String foto,String observaciones,int ranking){
        Mascota mascota = new Mascota(nombre,duenno,foto,observaciones,ranking);
        mascotas.add(mascota);

    }

    /**
     * Funcion para listar mascotas
     * @return retorna los elementos que hay en el arraylist
     */
    public ArrayList<Mascota> listarMascotas(){
        return this.mascotas;
    }

    /**
     * Funcion para encontrar duennos de mascota
     * La busqueda se basa en la cedula de la persona
     *
     * @param cedula de la persona, es el parametro de busqueda
     * @return retorna instancias de la clase dueno que estan en el arraylist
     */
    public DuennoMascota buscarDuenno(String cedula){
        for(int i=0;i<duennoMascotas.size();i++){
            DuennoMascota duennoActual = duennoMascotas.get(i);
            if(duennoActual.getCedula().equalsIgnoreCase(cedula)){
                return duennoActual;
            }
        }

        return null;
    }

    /**
     * Metodo para crear citas para mascotas
     *
     * @param nombreMascota String
     * @param fecha String
     * @param hora String
     * @param observaciones String
     */

    public void crearCita(String nombreMascota,String fecha,String hora,String observaciones){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaCita = LocalDate.parse(fecha,formatter);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaCita = LocalTime.parse(hora,dtf);
        Cita nuevaCita = new Cita(nombreMascota,fechaCita,horaCita,observaciones);
        citas.add(nuevaCita);
    }

    /**
     * Funcion para listar citas creadas
     * @return citas guardadas en el arraylist
     */
    public ArrayList<Cita> listarCitas(){
        return this.citas;
    }

    /**
     * Metodo para crear reservaciones para el hotel
     *
     * @param nombreMascota String
     * @param fechaEntrada fecha de entrada al hotel
     * @param fechaSalida fecha de salida del hotel
     */
    public void crearReservacion(String nombreMascota,String fechaEntrada,String fechaSalida){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechInicio = LocalDate.parse(fechaEntrada,formatter);
        LocalDate fechFin = LocalDate.parse(fechaSalida,formatter);
        Reservacion nuevaReservacion = new Reservacion(nombreMascota,fechInicio,fechFin);
        reservaciones.add(nuevaReservacion);
    }

    /**
     * Funcion para listar las reservaciones creadas
     * @return las reservaciones creadas
     */
    public ArrayList<Reservacion> listarReservaciones(){
        return this.reservaciones;
    }

    /**
     * Metodo para crear usuarios que son empleados de la veterinaria
     * Los usuarios pueden ser doctores o secretarias, pueden esar activos o inactivos en el sistema
     *
     * @param nombre del usuario
     * @param apellido1 del usuario
     * @param apellido2 del usuario
     * @param cedula del usuario
     * @param telefono del usuario
     * @param direccion del usuario
     * @param estado puede ser activo o inactivo
     * @param rol puede ser secretario o doctor
     */
    public void crearUsuario(String nombre,String apellido1,String apellido2,String cedula,String telefono,String direccion,String estado,String rol){
        Usuario nuevoUsuario = new Usuario(nombre,apellido1,apellido2,cedula,telefono,direccion,estado,rol);
        usuarios.add(nuevoUsuario);
    }

    /**
     * Funcion para listar usuarios
     * @return retorna los usuarios guardados en el arraylist
     */
    public ArrayList<Usuario> listarUsuarios(){
        return this.usuarios;
    }
}

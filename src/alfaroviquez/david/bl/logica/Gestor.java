package alfaroviquez.david.bl.logica;

import alfaroviquez.david.bl.entidades.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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

    public void registrarDuennoMascosta(String nombre, String apellido1, String apellido2, String cedula, String telefono, String direccion) {
        DuennoMascota duenno = new DuennoMascota(nombre,apellido1,apellido2,cedula,telefono,direccion);
        if(duennoMascotas.contains(duenno.getCedula())){
            System.out.println("El cliente ya esta registrado");
        }else {
            duennoMascotas.add(duenno);
        }


    }
    public ArrayList<DuennoMascota> listarDuennos(){
        return this.duennoMascotas;
    }
    public void crearMascota(String nombre,DuennoMascota duenno, String foto,String observaciones,int ranking){
        Mascota mascota = new Mascota(nombre,duenno,foto,observaciones,ranking);
        mascotas.add(mascota);

    }
    public ArrayList<Mascota> listarMascotas(){
        return this.mascotas;
    }
    public DuennoMascota buscarDuenno(String cedula){
        for(int i=0;i<duennoMascotas.size();i++){
            DuennoMascota duennoActual = duennoMascotas.get(i);
            if(duennoActual.getCedula().equalsIgnoreCase(cedula)){
                return duennoActual;
            }
        }

        return null;
    }

    public void crearCita(String nombreMascota,String fecha,String hora,String observaciones){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaCita = LocalDate.parse(fecha,formatter);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaCita = LocalTime.parse(hora,dtf);
        Cita nuevaCita = new Cita(nombreMascota,fechaCita,horaCita,observaciones);
        citas.add(nuevaCita);
    }
    public ArrayList<Cita> listarCitas(){
        return this.citas;
    }

    public void crearReservacion(String nombreMascota,String fechaEntrada,String fechaSalida){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechInicio = LocalDate.parse(fechaEntrada,formatter);
        LocalDate fechFin = LocalDate.parse(fechaSalida,formatter);
        Reservacion nuevaReservacion = new Reservacion(nombreMascota,fechInicio,fechFin);
        reservaciones.add(nuevaReservacion);
    }
    public ArrayList<Reservacion> listarReservaciones(){
        return this.reservaciones;
    }
    public void crearUsuario(String nombre,String apellido1,String apellido2,String cedula,String telefono,String direccion,String estado,String rol){
        Usuario nuevoUsuario = new Usuario(nombre,apellido1,apellido2,cedula,telefono,direccion,estado,rol);
        usuarios.add(nuevoUsuario);
    }

    public ArrayList<Usuario> listarUsuarios(){
        return this.usuarios;
    }
}

package alfaroviquez.david.bl.entidades;

import java.time.LocalDate;

/**
 * Clase Reservacion
 * Con esta clase se instancia la clase reservacion para crear nuevas reservaciones de mascota
 * Para crear un nuevo objeto de esta clase es necesario el nombre de la mascota, la fecha de entrada, y la fecha de salida
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 24/10/2020
 */
public class Reservacion {
    private String nombreMascota;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Reservacion() {
    }

    public Reservacion(String nombreMascota, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.nombreMascota = nombreMascota;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        String msg;
        msg = "==============================="+"\n";
        msg = msg+"Reservacion de hotel"+"\n";
        msg = msg+"Nombre: "+nombreMascota+"\n";
        msg = msg+"Fecha de entrada: "+fechaEntrada+"\t\t\t"+"Fecha de salida: "+fechaSalida+"\n";
        msg = msg+"=======================================";
        return msg;
    }
}

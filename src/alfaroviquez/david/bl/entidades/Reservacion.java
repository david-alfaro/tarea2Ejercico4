package alfaroviquez.david.bl.entidades;

import java.time.LocalDate;

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
        return "Reservacion{" +
                "nombreMascota='" + nombreMascota + '\'' +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                '}';
    }
}

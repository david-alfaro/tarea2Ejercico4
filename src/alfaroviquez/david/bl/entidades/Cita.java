package alfaroviquez.david.bl.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private String nombreMascota;
    private LocalDate fecha;
    private LocalTime hora;
    private String observaciones;

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Cita() {
    }

    public Cita(String nombreMascota, LocalDate fecha, LocalTime hora, String observaciones) {
        this.nombreMascota = nombreMascota;
        this.fecha = fecha;
        this.hora = hora;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        String msg;
        msg = "======================================="+"\n";
        msg = msg+"Cita para: "+nombreMascota+"\t\t"+"Fecha de cita: "+fecha+"\t\t"+"Hora: "+hora+"\n";
        msg = msg+"Observaciones: "+observaciones+"\n";
        msg=msg+"========================================";
        return msg;
    }
}

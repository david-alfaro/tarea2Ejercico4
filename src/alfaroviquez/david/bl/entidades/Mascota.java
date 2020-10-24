package alfaroviquez.david.bl.entidades;

public class Mascota {
    private String nombre;
    private DuennoMascota duenno;
    private String foto;
    private String observaciones;
    private int ranking;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DuennoMascota getDuenno() {
        return duenno;
    }

    public void setDuenno(DuennoMascota duenno) {
        this.duenno = duenno;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Mascota() {
    }

    public Mascota(String nombre, DuennoMascota duenno, String foto, String observaciones, int ranking) {
        this.nombre = nombre;
        this.duenno = duenno;
        this.foto = foto;
        this.observaciones = observaciones;
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        String msg;
        msg = "======================================================="+"\n";
        msg = msg + "Nombre: "+nombre+"\n";
        msg = msg + "Dueño: "+duenno+"\n";
        msg = msg+"Observaciones: "+observaciones+"\n";
        msg = msg +"Ranking: "+ranking+"\n";
        msg = msg+"=======================================================";
        return msg;
    }
}

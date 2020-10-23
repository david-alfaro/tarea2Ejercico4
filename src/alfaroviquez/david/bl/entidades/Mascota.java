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
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", duenno=" + duenno +
                ", foto='" + foto + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", ranking=" + ranking +
                '}';
    }
}

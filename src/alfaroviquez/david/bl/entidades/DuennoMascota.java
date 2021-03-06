package alfaroviquez.david.bl.entidades;

/**
 * Clase Dueño de Mascota
 * Esta clase se usa para crear objetos de tipo Dueño
 * Se usa para crear un dueño de una mascota
 *
 * @author David Alfaro Viquez
 * @version 1.0
 * @since 24/10/2020
 */
public class DuennoMascota {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String cedula;
    private String telefono;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public DuennoMascota() {
    }

    /**
     * Constructor de la clase
     *
     * @param nombre del dueño
     * @param apellido1 del dueño
     * @param apellido2 del dueño
     * @param cedula del dueño
     * @param telefono del dueño
     * @param direccion del dueño
     */
    public DuennoMascota(String nombre, String apellido1, String apellido2, String cedula, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        String msg;
        msg = "========================================================================" + "\n";
        msg = msg + "Nombre: " + nombre + "\t\t" + "Apellidos: " + apellido1 + "\t" + apellido2 + "\n";
        msg = msg + "Cedula: " + cedula + "\t\t" + "Telefono: " + telefono + "\n";
        msg = msg + "Direccion: " + direccion + "\n";
        msg = msg + "==========================================================================";
        return msg;
    }
}

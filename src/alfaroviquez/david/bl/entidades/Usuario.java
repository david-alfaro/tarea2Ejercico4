package alfaroviquez.david.bl.entidades;

public class Usuario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String cedula;
    private String telefono;
    private String direccion;
    private String estado;
    private String rol;

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, String cedula, String telefono, String direccion, String estado, String rol) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
        this.rol = rol;
    }

    @Override
    public String toString() {
        String msg;
        msg = "========================================================================" + "\n";
        msg = msg + "Nombre: " + nombre + "\t\t" + "Apellidos: " + apellido1 + "\t" + apellido2 + "\n";
        msg = msg + "Cedula: " + cedula + "\t\t" + "Telefono: " + telefono + "\n";
        msg = msg + "Direccion: " + direccion + "\n";
        msg = msg + "Estado: "+estado+"\t\t\t"+ "Rol: "+rol+"\n";
        msg = msg + "==========================================================================";
        return msg;
    }
}

package ejemplos.contructores;

public class Direccion extends Personas{
    public String domicilio;

    public Direccion(int documento, String nombre, String apellido, String edad, String domicilio) {
        super(documento, nombre, apellido, edad);
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}

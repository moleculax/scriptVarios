package paqueteA;

public  abstract class Persona {

    private String nombre;

    public abstract void saluda();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

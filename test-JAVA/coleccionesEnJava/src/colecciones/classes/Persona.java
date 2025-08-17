package colecciones.classes;

public class Persona {
   private  String  nombre;
   private int documento;

    public Persona(int documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
}

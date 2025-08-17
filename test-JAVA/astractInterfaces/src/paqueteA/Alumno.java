package paqueteA;

public class Alumno  extends Persona implements Facturable{
    private  int numeroAlumno;

    public int getNumeroAlumno() {
        return numeroAlumno;
    }

    public void setNumeroAlumno(int numeroAlumno) {
        this.numeroAlumno = numeroAlumno;
    }

    @Override
    public void saluda() {

    }

    @Override
    public String holaMundo() {
        return "";
    }

    @Override
    public int factura() {
        return 0;
    }
}

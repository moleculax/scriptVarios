package ejemplos.program;

import ejemplos.contructores.Direccion;

import java.util.List;

public class Objetos {
    public  void execObj(){

      Direccion direccion = new Direccion(101010
                          , "Pepe", "Lepon"
                          , "35", "La calle 01");
      String domicilio = direccion.getDomicilio();
      String apellido = direccion.getApellido();
      int documento =  direccion.getDocumento();
      String nombre =  direccion.getNombre();
      String edad = direccion.getEdad();

        System.out.println("#################################");
        System.out.println("Documento: "+ documento);
        System.out.println("Nombre : "+ nombre + " "+ apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: "+ domicilio);
        System.out.println("#################################");
        // Aqui uso funcion Lambda para el objeto
        List<Direccion> datPersonales = List.of(direccion);
        datPersonales.forEach( p -> System.out.println(p.getDocumento()+ " "+p.getNombre()+" "+p.getApellido()+ " "+ p.getDomicilio()));


    }
}

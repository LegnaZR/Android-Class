package mx.fca.listas;

public class Contacto {

long id;
    String nombre;
    String telefono;
    String etiqueta;
    int fotografia;
    String correo;
    String correo2;
    String direccion;

    public Contacto( String nombre, String telefono, String etiqueta, int fotografia, String correo, String correo2, String direccion, long id ) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.etiqueta = etiqueta;
        this.fotografia = fotografia;
        this.correo = correo;
        this.correo2 = correo2;
        this.direccion = direccion;

    }


}

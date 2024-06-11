package mx.fca.aviones;

import java.util.ArrayList;

public class Aerolineas {

    public static ArrayList<Avion> AEROMEXICO() {
        ArrayList<Avion> aviones = new ArrayList<>();
        aviones.add(new Avion(Direccion.EAST, 0, 2));
        aviones.add(new Avion(Direccion.SOUTH, 0, 3));
        aviones.add(new Avion(Direccion.WEST, 1, 1));
        aviones.add(new Avion(Direccion.EAST, 0, 3));
        aviones.add(new Avion(Direccion.SOUTH, 0, 4));
        aviones.add(new Avion(Direccion.WEST, 3, 5));
        return aviones;
    }
}


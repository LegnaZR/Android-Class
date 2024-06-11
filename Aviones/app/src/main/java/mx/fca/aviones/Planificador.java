package mx.fca.aviones;
import java.util.ArrayList;

public class Planificador {

    public static Plano crearRutaInicial() {
        ArrayList<Avion> aviones = Aerolineas.AEROMEXICO();
        return new Plano(0,aviones, new ArrayList<>());
    }

}

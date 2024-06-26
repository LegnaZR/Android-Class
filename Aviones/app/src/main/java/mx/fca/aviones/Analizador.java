package mx.fca.aviones;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Analizador {

    static HashMap<Integer, Plano> memoria = new HashMap<>();


    public static Plano inicializa(Plano plano) {
        memoria.put(0, plano);
        return plano;
    }


    public static Plano next(int noPaso, Plano plano) {
        if (memoria.containsKey(noPaso)) {
            return memoria.get(noPaso);
        } else {
            Plano planoNuevo;
            ArrayList<Avion> nuevosAviones = new ArrayList<>();
            ArrayList<Colision> colisiones = new ArrayList<>();

            // Calcula el movimiento de los aviones
            for (Avion avion : plano.aviones) {
                switch (avion.direccion) {
                    case NORTH:
                        avion.y -= 1;
                        break;
                    case SOUTH:
                        avion.y += 1;
                        break;
                    case EAST:
                        avion.x += 1;
                        break;
                    case WEST:
                        avion.x -= 1;
                        break;
                }
                nuevosAviones.add(avion);
            }


            if (detectaColisiones(nuevosAviones, colisiones)) {
            }

            planoNuevo = new Plano(noPaso + 1, nuevosAviones, colisiones);
            memoria.put(noPaso + 1, planoNuevo);
            return planoNuevo;
        }
    }


    public static Plano prev(int noPaso) {
        return memoria.get(noPaso - 1);
    }


    public static boolean detectaColisiones(@NonNull List<Avion> aviones, List<Colision> colisiones) {
        Set<String> posiciones = new HashSet<>();
        boolean colisionDetectada = false;

        for (Avion avion : aviones) {
            String pos = avion.x + "," + avion.y;
            if (posiciones.contains(pos)) {
                colisiones.add(new Colision(avion.x, avion.y));
                colisionDetectada = true;
            } else {
                posiciones.add(pos);
            }
        }
        return colisionDetectada;
    }


    public static class Colision {
        int x, y;

        public Colision(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

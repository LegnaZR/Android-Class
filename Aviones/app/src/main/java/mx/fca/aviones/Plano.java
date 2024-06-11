package mx.fca.aviones;

import java.util.ArrayList;

public class Plano {

    public ArrayList<Avion> aviones;
    public ArrayList<Analizador.Colision> colisiones;
    public int col;
    public int row;
    public int noPaso;

    // Constructor
    public Plano(int noPaso, ArrayList<Avion> aviones, ArrayList<Analizador.Colision> colisiones) {
        this.noPaso = noPaso;
        this.aviones = aviones;
        this.colisiones = colisiones;

        int tmpX = 0;
        int tmpY = 0;
        for (Avion avion : aviones) {
            if (avion.x > tmpX) {
                tmpX = avion.x;
            }
            if (avion.y > tmpY) {
                tmpY = avion.y;
            }
        }
        col = tmpX + 1;
        row = tmpY + 1;
    }

    public Plano next() {
        return Analizador.next(noPaso, this);
    }

    public Plano prev() {
        return Analizador.prev(noPaso - 1);
    }

    public Avion[][] crearPlanoConEspacios() {
        Avion[][] planoMatriz = new Avion[row][col];

        for (Avion avion : aviones) {
            planoMatriz[avion.y][avion.x] = avion;
        }
        return planoMatriz;
    }
}









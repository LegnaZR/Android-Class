package mx.fca.aviones;

public class Avion {
    Direccion direccion;
    int x;
    int y;

    public Avion(Direccion direccion, int x, int y) {
        this.direccion = direccion;
        this.x = x;
        this.y = y;
    }

    public void mover() {
        switch (direccion) {
            case NORTH:
                y--;
                break;
            case SOUTH:
                y++;
                break;
            case EAST:
                x--;
                break;
            case WEST:
                x++;
                break;
        }
    }

    public int getImage() {
        switch (direccion) {
            case NORTH:
                return R.mipmap.north;
            case SOUTH:
                return R.mipmap.south;
            case EAST:
                return R.mipmap.east;
            case WEST:
                return R.mipmap.west;
            default:
                return R.mipmap.north;
        }
    }
}
package fr.uvsq;

public class Direction {

    /**
     * Signification valeur de direction :
     * 0 : Haut
     * 1 : Droite
     * 2 : Bas
     * 3 : Gauche
     */
    private int direction;

    Direction() {
        this.direction = 0;
    }

    Direction(int dir) {
        this.direction = dir;
    }

    public void setDirection(int dir) {
        this.direction = dir;
    }

    public int getDirection() {
        return this.direction;
    }
}

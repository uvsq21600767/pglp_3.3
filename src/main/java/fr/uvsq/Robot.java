package fr.uvsq;

import org.graalvm.compiler.loop.InductionVariable;

public class Robot {

    private Position position;
    private Direction direction;

    Robot() {
        this.position = new Position();
        this.direction = new Direction();
    }

    Robot(Position pos, Direction dir) {
        this.position = pos;
        this.direction = dir;
    }
    public void tourne() {

    }

    public void avance() {

    }
}

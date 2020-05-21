package fr.uvsq;

public class RobotStatique extends Robot{

    RobotStatique() {
        super();
    }

    RobotStatique(Position pos, Direction dir) {
        super(pos, dir);
    }
    @Override
    public void avance() {
        throw new UnsupportedOperationException();
    }
}

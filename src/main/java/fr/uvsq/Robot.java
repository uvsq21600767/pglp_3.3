package fr.uvsq;

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

    public void setPosition(Position pos) {
        this.position = pos;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public Position getPosition() {
        return this.position;
    }

    public Direction getDir() {
        return this.direction;
    }
    public void tourne() {
        switch(this.direction.getDirection()) {
            case 0:
                this.direction.setDirection(1);
                break;

            case 1:
                this.direction.setDirection(2);
                break;

            case 2:
                this.direction.setDirection(3);
                break;

            default:
                this.direction.setDirection(0);
                break;
        }
    }

    public void avance() {
        switch (this.direction.getDirection()) {
            case 0:
                this.position.setY(this.position.getY()+1);
                break;

            case 1:
                this.position.setX(this.position.getX()+1);
                break;

            case 2:
                this.position.setY(this.position.getY()-1);
                break;

            default:
                this.position.setX(this.position.getX()-1);
                break;
        }
    }
}

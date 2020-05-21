package fr.uvsq;

public class RobotType2 extends Robot {

    RobotType2() {
        super();
    }

    RobotType2(Position pos, Direction dir) {
        super(pos, dir);
    }

    @Override
    public void avance() {
        switch (this.direction.getDirection()) {
            case 0:
                this.position.setY(this.position.getY()+10);
                break;

            case 1:
                this.position.setX(this.position.getX()+10);
                break;

            case 2:
                this.position.setY(this.position.getY()-10);
                break;

            default:
                this.position.setX(this.position.getX()-10);
                break;
        }
    }
}

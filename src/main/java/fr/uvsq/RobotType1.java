package fr.uvsq;

public class RobotType1 extends Robot{

    RobotType1() {
        super();
    }

    RobotType1(Position pos, Direction dir) {
        super(pos, dir);
    }

    @Override
    public void avance() {
        switch (this.direction.getDirection()) {
            case 0:
                this.position.setY(this.position.getY()+5);
                break;

            case 1:
                this.position.setX(this.position.getX()+5);
                break;

            case 2:
                this.position.setY(this.position.getY()-5);
                break;

            default:
                this.position.setX(this.position.getX()-5);
                break;
        }
    }
}

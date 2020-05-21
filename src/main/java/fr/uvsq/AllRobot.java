package fr.uvsq;

import java.util.ArrayList;
import java.util.List;

public class AllRobot {

    public List<Robot> r = new ArrayList<Robot>();

    public void addRobot(Robot r) {
        this.r.add(r);
    }

    public void avancerTous() {
        for (Robot robot : r) {
            robot.avance();
        }
    }
}

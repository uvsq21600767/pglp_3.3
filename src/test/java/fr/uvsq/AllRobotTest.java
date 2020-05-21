package fr.uvsq;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AllRobotTest {

    private AllRobot a;

    @Before
    public void init() {
        a = new AllRobot();
    }

    @Test
    public void TestAddRobot() {
        Robot r = new Robot();
        a.addRobot(r);

        assertEquals(1, a.r.size());
    }

    @Test
    public void TestAvanceTous() {
        Robot r = new Robot();
        a.addRobot(r);
        a.avancerTous();


        assertEquals(1, a.r.get(0).getPosition().getY());
    }

    @Test
    public void TestAvanceTous2() {
        Robot r = new Robot();
        a.addRobot(r);
        Robot r2 = new Robot();
        a.addRobot(r2);
        a.avancerTous();

        assertEquals(1, a.r.get(1).getPosition().getY());
    }

}
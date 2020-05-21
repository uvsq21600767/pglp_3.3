package fr.uvsq;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotTest {

    private Robot r;

    @Before
    public void init() {
        r = new Robot();
    }

    @Test
    public void TestTourne() {
        r.tourne();

        assertEquals(1, r.getDir().getDirection());
    }

    @Test
    public void TestTourne3() {
        r.setDirection(new Direction(3));
        r.tourne();

        assertEquals(0, r.getDir().getDirection());
    }

    @Test
    public void TestAvance() {
        r.avance();

        assertEquals(1, r.getPosition().getY());
    }

    @Test
    public void TestAvance3() {
        r.setDirection(new Direction(3));
        r.avance();

        assertEquals(-1, r.getPosition().getX());
    }

}
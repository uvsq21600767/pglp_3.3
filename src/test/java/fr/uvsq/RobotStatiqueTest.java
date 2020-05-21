package fr.uvsq;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotStatiqueTest {

    private RobotStatique r;

    @Before
    public void init() {
        r = new RobotStatique();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void TestAvance() {
        r.avance();
    }

}
package model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <h1>The Class test Example.</h1>
 * @author Ludovic Pierson
 *
 */
public class ExampleTest {
    private Example example;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * it's a set up before the all tests.
     * 
     * @throws Exception - exception
     */
    @Before
    public void setUp() throws Exception {
        this.example = new Example(1, "player1");
    }

    /**
     * it's for after all the tests.
     * @throws Exception - exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * test if the id if equal to 0 at the start
     */
    @Test
    public void testGetId() {
        final int expected = 0;
        assertEquals(expected, this.example.getId());
    }

    /**
     * test if the name is "player1" is equal at the start
     */
    @Test
    public void testGetName() {
        final String expected = "player1";
        assertEquals(expected, this.example.getName());
    }

    /**
     * test if the name : "player1" or "player2" is equal at the start
     */
    @Test
    public void testSetName() {
        String expected = "player1";
        assertEquals(expected, this.example.getName());
        expected = "player2";
        this.example.setName(expected);
        assertEquals(expected, this.example.getName());
    }

    /**
     * test if the ToString : "1 s : vainqueur player1" is equal at the start
     */
    @Test
    public void testToString() {
        final String expected = "1 s : vainqueur player1";
        assertEquals(expected, this.example.toString());
    }

}

package model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
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
     * 
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        this.example = new Example(1, "player1");
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * 
     */
    @Test
    public void testGetId() {
        final int expected = 0;
        assertEquals(expected, this.example.getId());
    }

    /**
     * 
     */
    @Test
    public void testGetName() {
        final String expected = "player1";
        assertEquals(expected, this.example.getName());
    }

    /**
     * 
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
     * 
     */
    @Test
    public void testToString() {
        final String expected = "1 s : vainqueur player1";
        assertEquals(expected, this.example.toString());
    }

}

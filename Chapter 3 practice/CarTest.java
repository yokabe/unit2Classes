

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class CarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class CarTest
     */
    public CarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        
    }

    @Test
    public void testAddGas()
    {
        Car car = new Car( 50.0);
        car.addGas( 5 );
        assertEquals( 5, car.getGasInTank(), 1e-6);
        car.addGas( 7 );
        assertEquals( 12, car.getGasInTank(), 1e-6);
    }
    
    @Test
    public void testGetGasInTank()
    {
        Car car = new Car(50);
        assertEquals( 0, car.getGasInTank(), 1e-6);
        car.addGas(10);
        assertEquals(10, car.getGasInTank(), 1e-6);
    }
    
    @Test 
    public void testDrive()
    {
        Car car = new Car(50);
        car.addGas(10);
        car.drive(200);
        assertEquals(6, car.getGasInTank(), 1e-6);
        car.drive(25);
        assertEquals(5.5, car.getGasInTank(), 1e-6);
   }
}

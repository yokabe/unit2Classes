import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;

/**
 * Creates and draws a building for the landscape
 * 
 * @author Yudai Okabe
 * @version 10/1/2015
 */
public class Building1
{
    /** Number of floors of the building */
    private int floors;
    /** Upper left x coordinate*/
    private int leftX;
    /** Upper left y coordinate*/
    private int topY;

    /**
     * Default constructor for objects of class Building1
     */
    public Building1(int floor, int leftx, int top)
    {
        floors = floor;
        leftX = leftx;
        topY = top;
        
    }

    /**
     * Draws a building
     *
     * @param    y    description of parameter y
     */
    public void draw(Graphics2D g2)
    {
        int height = floors*25;
        
        Rectangle building = new Rectangle(leftX, topY, 100, height);
        g2.draw(building);
    }

}

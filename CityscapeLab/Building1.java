import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.util.Random;

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
        int newTop = topY - height;
        Random generator = new Random();
        int n2 = generator.nextInt(5);
        
        Rectangle building = new Rectangle(leftX, newTop, 100, height);
        g2.draw(building);
        if (n2 == 0)
        {
            g2.setColor(Color.GRAY);
        }
        if (n2 == 1)
        {
            g2.setColor(Color.BLACK);
        }
        if (n2 == 2)
        {
            g2.setColor(Color.RED);
        }
        if (n2 == 3)
        {
            g2.setColor(Color.YELLOW);
        }
        if (n2 == 4)
        {
            g2.setColor(Color.WHITE);
        }
        g2.fill(building);
        
        int n = 1;
        
        while (n < floors)
        {
            
            Rectangle window1 = new Rectangle(leftX + 15, newTop + (10*2*n), 25, 25);
            Rectangle window2 = new Rectangle(leftX + 55, newTop + (10*2*n), 25, 25);
            g2.draw(window1);
            g2.draw(window2);
            g2.setColor(Color.BLUE);
            g2.fill(window1);
            g2.fill(window2);
            
            n += 2;
        }    
    }

}
 
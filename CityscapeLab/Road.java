import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 * Creates and draws the road for the landscape
 * 
 * @author Yudai Okabe
 * @version 10/1/2015
 */
public class Road
{
    /** Length of the road (also length of the screen) */
    int length;
    
    /**
     * Default constructor for objects of class Road
     */
    public Road(int length)
    {
        this.length = length;
        
    }

    /**
     * Draws a road
     *
     * @param    y    description of parameter y
     */
    public void draw(Graphics2D g2, int width)
    {
        Rectangle road = new Rectangle(0, 375, this.length, 200);
        g2.draw(road);
        g2.setColor(Color.BLACK);
        g2.fill(road);
        
        int n = 0;
        while (n < width)
        {
            Rectangle lines = new Rectangle(n, 397, 10, 5);
            g2.draw(lines);
            g2.setColor(Color.YELLOW);
            g2.fill(lines);
            n += 25;
        }
    }

}

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Creates and draws the Flying boat for the landscape
 * 
 * @author Yudai Okabe
 * @version 10/1/2015
 */
public class FlyingBoat
{
    /** Length of the boat */
    private int length;
    /** Height of the boat */
    private int height;
    /** X offset for movement */
    private int x;
    
    /**
     * Default constructor for objects of class UFO
     */
    public FlyingBoat(int length, int height)
    {
        this.length = length;
        this.height = height;
        this.x = 0;
    }

    /**
     * Draws a Boat
     *
     * @param    y    description of parameter y
     */
    public void draw(Graphics2D g2)
    {
        Rectangle body = new Rectangle(100 + this.x, 300, this.length, this.height);
        Rectangle body2 = new Rectangle(100 + this.x, 320, 200, 35);
        Rectangle pole1 = new Rectangle(150 + this.x, 225, 20, 75);
        Rectangle pole2 = new Rectangle(200 + this.x, 250, 20, 50);
        
        g2.draw(body);
        g2.setColor(Color.WHITE);
        g2.fill(body);
        
        g2.draw(body2);
        g2.setColor(Color.BLACK);
        g2.fill(body2);
        
        g2.draw(pole1);
        g2.setColor(Color.GRAY);
        g2.fill(pole1);
        
        g2.draw(pole2);
        g2.setColor(Color.GRAY);
        g2.fill(pole2);
    }
    
    /**
     * The boat glides through the air through this method
     *
     */
    public void fly()
    {
        this.x += 50;
    }

}

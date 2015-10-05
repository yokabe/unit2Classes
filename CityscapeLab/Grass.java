import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 * Creates and draws the grass for the landscape
 * 
 * @author Yudai Okabe
 * @version 10/1/2015
 */
public class Grass
{
    /** Length of the grass (also length of the screen) */
    private int length;
    /** Height of the grass */
    private int height;
    /**
     * Default constructor for objects of class grass
     */
    public Grass(int length, int height)
    {
        this.length = length;
        this.height = height;
        
    }

    /**
     * Draws a grass
     *
     * @param    y    description of parameter y
     */
    public void draw(Graphics2D g2)
    {
        Rectangle grass = new Rectangle(0, 825, this.length, this.height);
        g2.draw(grass);
        g2.setColor(Color.GREEN);
        g2.fill(grass);
    }

}

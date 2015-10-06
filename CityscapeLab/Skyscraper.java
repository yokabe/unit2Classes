import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.util.Random;

/**
 * Creates and draws a skyscraper
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skyscraper
{
    /** Top left y coordinate */
    private int topY;
    /** Top left x coordinate */
    private int leftX;
    /** Height of building */
    private int height;
    /** Width of building */
    private int width;
    
    /**
     * Default constructor for objects of class Skyscraper
     */
    public Skyscraper(int x, int y, int height, int width)
    {
        this.leftX = x;
        this.topY = y;
        this.height = height;
        this.width = width;
        
    }

    /**
     * Draws a skyscraper
     *
     * @param    Graphics2D g2
     */
    public void draw(Graphics2D g2)
    {
        int newTop = this.topY - this.height;
        Rectangle p1 = new Rectangle(this.leftX, newTop, this.width, this.height);
        g2.draw(p1);
        g2.setColor(Color.CYAN);
        g2.fill(p1);
        
        Rectangle p2 = new Rectangle(this.leftX, newTop - 200, this.width - 20, this.height);
        g2.draw(p2);
        g2.setColor(Color.CYAN);
        g2.fill(p2);
        
        Rectangle p3 = new Rectangle(this.leftX, newTop - 400, this.width - 40, this.height);
        g2.draw(p3);
        g2.setColor(Color.CYAN);
        g2.fill(p3);
        
        Rectangle p4 = new Rectangle(365, newTop - 550, 10, this.height - 50);
        g2.draw(p4);
        g2.setColor(Color.GRAY);
        g2.fill(p4);
        
    }

}

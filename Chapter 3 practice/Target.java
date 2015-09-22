import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


/**
 * Class that draws shooting target with alternating colors of black and white
 * 
 * @author Yudai Okabe
 * @version (a version number or a date)
 */
public class Target
{
    /** the x coordinate of the top left corner of the circle */
    private int xLeft;
    /** the y coordinate of the top left corner of the circle */
    private int yTop;

    /**
     * Constructs a Target with specified x and y coordinates
     */
    public Target(int x, int y)
    {
       xLeft = x;
       yTop = y;
    }

    /**
     * Draws the target
     * @param   g2  the graphics context
     */
    public void draw(Graphics2D g2)
    {
        int n = 0;
        Ellipse2D.Double black = new Ellipse2D.Double(xLeft, yTop, 500, 500);
        Ellipse2D.Double white = new Ellipse2D.Double(xLeft-50, yTop-50, 400, 400);
        g2.draw(black);
        g2.draw(white);
        while (n<50)
        {
            
            n += 1;
        }
        
        
    }


}

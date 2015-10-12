import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import java.util.Scanner;

/**
 * Creates and draws the sky for the landscape
 * 
 * @author Yudai Okabe
 * @version 10/1/2015
 */

public class SkyFrame
{
    
    
    /**
     * Default constructor for objects of class sky 
     */
    public SkyFrame()
    {
       
        
    }

    /**
     * Draws a sky
     *
     * @param    g2 Graphics2D
     */
    public void draw(Graphics2D g2)
    {
        
        
        
        //Draws sky for the city
        Rectangle sky = new Rectangle(0, 0, 100000, 100000);
        g2.draw(sky);
        
            
        
        
       g2.setColor(Color.BLUE);
            
        
        g2.fill(sky);
        
    }

}

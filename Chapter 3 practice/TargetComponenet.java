import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class TargetComponenet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetComponenet extends JComponent
{

    /**
     * Default constructor for objects of class TargetComponenet
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int n = 0;
        while (n < 100)
        {
            Target target = new Target(100+(5*n),100+(5*n));
            target.draw(g2, n);
            n += 1;
            
        }
        
       
    }

}

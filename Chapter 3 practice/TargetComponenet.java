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
        Target first = new Target(100, 100);
        
        first.draw(g2);
    }

}

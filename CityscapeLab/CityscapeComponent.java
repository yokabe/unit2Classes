import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    
    private Road road;
    
    private Grass grass;
    
    public CityscapeComponent()
    {
        this.road = new Road(10000);
        this.grass = new Grass(10000, 10000);
        
    }
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int n = 50;
        
        Random generator = new Random();
        
        while (n < getWidth())
        {
            int floor = generator.nextInt(10) + 5;
            Building1 building = new Building1(floor, n, 775);
            building.draw(g2);
            n += 150;
        }
       
        
        
        road.draw(g2);
        grass.draw(g2);
     
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}

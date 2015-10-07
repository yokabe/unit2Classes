import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.net.URL;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /**  Road object in picture */
    private Road road;
    /** Grass object in picture */
    private Grass grass;
    /** Skyscraper object in picture */
    private Skyscraper skyscraper1;
    /** Flying boat in picture */
    private FlyingBoat boat;
    
    
    public CityscapeComponent()
    {
        this.road = new Road(10000);
        this.grass = new Grass(10000, 10000);
        
        this.skyscraper1 = new Skyscraper(350, 775, 200, 100);
        
        this.boat = new FlyingBoat(200, 50);
        
    }
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        
        //try {
               // URL url = new URL(getCodeBase(), "https://upload.wikimedia.org/wikipedia/commons/1/16/Appearance_of_sky_for_weather_forecast,_Dhaka,_Bangladesh.JPG");
                //img = ImageIO.read(url);
            //}catch (IOException e){
           // }
        //g2.drawImage(img, 0, 0, observer);
        
        
        int n = 50;
        
        Random generator = new Random();
        
        while (n < getWidth())
        {
            if (n == 350)
            {
                
                n += 150;
            }
            else
            {
                int floor = generator.nextInt(10) + 5;
                Building1 building = new Building1(floor, n, 775);
                building.draw(g2);
                n += 150;
            }   
        }
       
        
        
        road.draw(g2);
        grass.draw(g2);
        skyscraper1.draw(g2);
        boat.draw(g2);
     
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        boat.fly(); //Makes the boat move to the right
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}

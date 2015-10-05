

/**
 * Write a description of class Skyscraper here.
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
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     */
    public void draw(int y)
    {
        // put your code here
        return x+y;
    }

}

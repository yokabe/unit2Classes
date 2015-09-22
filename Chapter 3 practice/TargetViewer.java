import javax.swing.JFrame; 

/**
 * Write a description of class TargetViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetViewer
{
    /**
     * Default constructor for objects of class TargetViewer
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponenet component = new TargetComponenet();
        frame.add(component);
        
        frame.setVisible(true);
        
    }

}

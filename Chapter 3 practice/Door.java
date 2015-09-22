
/**
 * The class Door makes a door.
 * 
 * @author Yudai Okabe 
 * @version 9/15/2015
 */
public class Door
{
    /** Specifies the door that is being referenced */
    private String name;
    
    /** Specifies the state of the door */
    private String state;

    /**
     * Constructor for objects of class Door that specifies the specific door and its state.
     */
    public Door(String name, String state)
    {
        this.name = name;
        this.state = state;
    }
    
    /**
     * Changes the state of the door to closed
     *
     * @pre     The door cannont be closed if the state of the door is already closed
     */
    public void closeDoor()
    {
        if (this.state == "open")
        {
            this.state = "closed";
        }
        
        else 
        {
            System.out.println("Door is already closed");
        }
    }
    
    /**
     * Changes the state of the door to open
     *
     * @pre     The door cannot be opened if the state of the door is already open
     */
    public void openDoor()
    {
        if (this.state == "closed")
        {
            this.state = "open";
        }
        
        else 
        {
            System.out.println("Door is already open");
        }
    }

    /**
     * Returns the state of the door in string form
     * @return  Returns the state of the door in string form
     */
    public String getState()
    {
        return this.state;
    }
    
    /**
     * Sets a new name for the door object
     * @param   newName   Name of door
     */
    public void setName(String newName)
    {
       this.name = newName;
    }

}

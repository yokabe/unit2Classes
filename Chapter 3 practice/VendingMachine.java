

/**
 * This class VendingMachine creates a class for a veding machine that holds a can of soda which 
 * can be restocked and bought with coins. The vending machine stores soda cans and coins.
 * 
 * @author  Yudai Okabe 
 * @version 9/16/2015
 */
public class VendingMachine
{
    /** The number of soda cans inside the vending machine */
    private int sodaCan;
    /** The number of coins inside the vending machine */
    private int coins;
    
    /**
     * Constructor for objects of class VendingMachine that specifies the number of cans in the
     * machine
     */
    public VendingMachine(int sodaCan)
    {
        this.sodaCan = sodaCan;
        this.coins = 0;
    }

    /**
     * Fills up the vending machine with a number of soda cans that is specified in the 
     * parameter
     * @pre     The number of soda cans must be an integer that is greater than 0
     * @param   cans    The number of soda cans that is being added to the vending machine
     */
    public void fillUp(int cans)
    {
        this.sodaCan += cans;
    }

    /**
     * Inserts a coin into the vending machine and reduces the number of soda cans in the
     * vending machine
     * @pre     The number of soda cans must be greater than 0
     */
    public void insertToken()
    {
        if (this.sodaCan > 0)
        {   this.coins += 1;
            this.sodaCan -= 1;
        }
        else
        {
            System.out.println("There are no Soda cans in the machine");
        }
    }

    /**
     * Returns the number of cans inside the vending machine
     *
     * @return  The number of cans inside the vending machine
     */
    public int getCanCount ()
    {
        return this.sodaCan;
    }
    
    /**
     * Returns the number of coins/tokens inside the vending machine
     *
     * @return  The number of coins inside/tokens the vending machine
     */
    public int getTokenCount ()
    {
        return this.coins;
    }

}

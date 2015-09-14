

/**
 * The class Car has a certain fuel efficiency and a certain amonut of fuel in the gas
 * tank. A Car may be driven a specified distance which reduces the amount of gas in the tank.
 * 
 * @author Yudai Okabe
 * @version 10 September 2015
 */
public class Car
{
    /** specifies the fuel efficiency of the car in units of miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** specifies the amount of fuel in the gas tank in units of gallons */
    private double fuelInTank;
    

    /**
     * Constructor for objects of class Car that specifies the fuel efficiency of car
     */
    public Car( double fuelEfficiency )
    {
        this.fuelInTank = 0.0;
        this.fuelEfficiency = fuelEfficiency;
    }

    /**
     * Simulates driving the car the specified distance in miles and reduces the amount of fuel 
     * in the car's tank
     *
     * @pre        The specified distance cannot consume more than the fuel available in the tank
     * @param    distance   the specified distance to drive in miles
     */
    public void drive( double distance )
    {
       fuelInTank -= distance / fuelEfficiency;
    }
    
    /**
     * Returns the number of gallons of gas in the car's tank
     * @return  the number of gallons of gas in the car's tank
     */
    public double getGasInTank()
    {
        return fuelInTank;
    }


    /**
     * Increments the fuel stored in the car's tank by the specified amount in gallons
     * @pre     Gallons of gas must be positive
     * @param   gallonsOfGas    amount in gallons to incrememt the fuel in the car's tank
     * 
     */
    public void addGas( double gallonsOfGas)
    {
        fuelInTank += gallonsOfGas;
    }


}

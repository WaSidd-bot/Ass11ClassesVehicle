/**@author Wasay
 * @version 2025.05.05
 * 
*/

/**
* Class to make a vehicle of some kind
*/

public class Vehicle {
    
    private String vehicleName;
    private int numberOfCrew;
    private int maxCrew;
    private double fuelAmount;
    private double fuelEfficiency;
    private double startPosition;

    /**
     * default constructor for Vehicle
     */
    public Vehicle() {
        this.vehicleName = "";
        this.maxCrew = 0;
        this.numberOfCrew = 0;
        this.fuelAmount = 0;
        this.startPosition = 0;
        this.fuelEfficiency = 0;
    }

    /**
     * parameterized constructor for Vehicle
     * @param vehicleName name of vehicle
     * @param numberOfCrew number of crew
     * @param maxCrew maximum crew allowed
     * @param fuelAmount amount of fuel onboard
     * @param fuelEfficiency efficiency of fuel burn for vehicle
     */
    public Vehicle(String vehicleName, int numberOfCrew, int maxCrew, double fuelAmount, double fuelEfficiency) {
        this.vehicleName = vehicleName;
        this.maxCrew = maxCrew;
        this.numberOfCrew = numberOfCrew;
        this.fuelAmount = fuelAmount;
        this.startPosition = 0;
        this.fuelEfficiency = fuelEfficiency;
    }

    /**
     * moves the vehicle based on the amount of fuel required and it's fuel efficiency, then adds the distance travelled to a start position, which at first, is 0
     * @param moveDistance how far the vehicle will move with the required fuel amount and efficiency.
     * @return how much the position of vehicle changes
     */

    public double moves(double moveDistance) {
        double fuelNeeded = 0;

        fuelNeeded = moveDistance * fuelEfficiency;

        if (this.fuelAmount > fuelNeeded) {
            this.fuelAmount -= fuelNeeded;
            this.startPosition += moveDistance;

            System.out.println("we moved " + moveDistance + " units, and consumed " + fuelNeeded + " units of fuel.");
            return this.startPosition;
        } else {
            System.out.println("out of fuel");
            return 0;
        }
    }

    /**
     * method for adding crew to vehicle
     * @param addedCrew how many passengers/crew is added to original amount.
     * @return how many passengers/crew is successfully added to original amount.
     */
    public int boarding(int addedCrew) {
        int newCrew;

        newCrew = this.numberOfCrew + addedCrew;

        if (newCrew > this.maxCrew) {
            System.out.println("specified number of crew to be added is above vehicle maximum capacity, try adding less.");
            return 0;
        } else {
            this.numberOfCrew = newCrew;
            return newCrew;
        } 
    }

    /**
     * method for substracting crew from vehicle
     * @param decrewing how many passengers/crew is substracted from original amount.
     * @return how many passengers/crew is successfully substracted from original amount.
     */

    public int leaving(int decrewing) {
        int newCrew;

        newCrew = this.numberOfCrew - decrewing;

        if (newCrew < 0) {
            System.out.println("specified number of crew to be added is below 0, try substracting less.");
            return 0;
        } else {
            this.numberOfCrew = newCrew;
            return newCrew;
        } 
    }

    /**
     * adds more fuel to vehicle
     * @param fuelAdded how much fuel is added to original amount.
     * @return how much fuel successfully added to original amount.
     */

    public double addMoreFuel(int fuelAdded) {
        this.fuelAmount += fuelAdded;
        return this.fuelAmount;
    }

    /**
     * gets name of vehicle
     * @return name of vehicle.
     */

    public String getVehicleName() {
        return this.vehicleName;
    }

    /**
     * allows for setting name of vehicle
     * @param vehicleName set vehicle name.
     * @return name of vehicle.
     */

    public String setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
        return this.vehicleName;
    }
}

/**@author Wasay
 * @version 2025.05.05
*/

/**
* Class to make a Plane of some kind
*/

public class Plane extends Vehicle {
    
    private double altitude;
    private String currentState;

    /**
     * default constructor for Plane
     */

    public Plane() {
        super();
        this.altitude = 0;
        this.currentState = "ground";
    }

    /**
     * parameterized constructor for Plane
     * @param vehicleName name of vehicle
     * @param numberOfCrew number of crew
     * @param maxCrew maximum crew allowed
     * @param fuelAmount amount of fuel onboard
     * @param fuelEfficiency efficiency of fuel burn for vehicle
     * @param altitude current altitude relative to sea level
     * @param currentState state of vehicle, "ground" or "flight" 
     */

    public Plane(String vehicleName, int numberOfCrew, int maxCrew, double fuelAmount, double fuelEfficiency ,double altitude, String currentState) {
        super(vehicleName, numberOfCrew, maxCrew, fuelAmount, fuelEfficiency);
        this.altitude = altitude;
        this.currentState = currentState;
    }

    /**
     * adds value to current altitude
     * @param ascendBy adds current altitude to value of ascendby
     * @return current altitude
     */

    public double ascend(double ascendBy) {
        this.altitude += ascendBy;
        this.currentState = "flight";
        return this.altitude;
    }

    /**
     * decreases value of current altitude
     * @param descendBy substracts current altitude to value of descendby
     * @return current altitude
     */

    public double descend(double descendBy) {
        if (this.altitude - descendBy >= 0) {
            this.altitude -= descendBy;
            return this.altitude;
        } else if (this.altitude - descendBy == 0) {
            this.currentState = "ground";
            this.altitude -= descendBy;
            return this.altitude;
        } else {
            System.out.println("Plane cannot descend beneath sea level");
            return 0;
        }   
    }

    /**
     * makes Plane fly
     * @param moveDistance adds moveDistance to current position 
     * @return distance moved
     */

    public double fly(double moveDistance) {
        if (this.currentState.equals("flight")) {
            moves(moveDistance);
            return moveDistance;
        } else {
            System.out.println("raise your altitude first if you would like to fly");
            return 0;
        }

    }
}

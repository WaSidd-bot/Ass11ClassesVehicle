/**@author Wasay
 * @version 2025.05.05
*/

/**
* Class to make a FighterJet of some kind
*/

public class FighterJet extends Plane {

    private boolean missileLock;
    private int missilesRemaining;
    private int fireRate;
    private int roundsRemaining;

    /**
     * default constructor for FighterJet
     */

    public FighterJet() {
        super();
        this.fireRate = 0;
        this.missileLock = false;
        this.missilesRemaining = 0;
        this.roundsRemaining = 0;
    }

    /**
     * parameterized constructor for FighterJet
     * @param vehicleName name of vehicle
     * @param numberOfCrew number of crew
     * @param maxCrew maximum crew allowed
     * @param fuelAmount amount of fuel onboard
     * @param fuelEfficiency efficiency of fuel burn for vehicle
     * @param altitude current altitude relative to sea level
     * @param currentState state of vehicle, "ground" or "flight" 
     * @param fireRate fire rate for vehicle autocannon
     * @param missileLock missile lock is true of false
     * @param missilesRemaining amount of missiles remaining
     * @param roundsRemaining amount of autocannon rounds remaining
     */

    public FighterJet(String vehicleName, int numberOfCrew, int maxCrew, double fuelAmount, double fuelEfficiency, double altitude, String currentState, boolean missileLock, int missilesRemaining, int fireRate, int roundsRemaining) {
        super(vehicleName, numberOfCrew, maxCrew, fuelAmount, fuelEfficiency, altitude, currentState);
        this.fireRate = fireRate;
        this.missileLock = missileLock;
        this.missilesRemaining = missilesRemaining;
        this.roundsRemaining = roundsRemaining;
    }

    /**
     * sets missile lock to true
     * @return missileLock
     */

    public boolean acquireLock() {
        missileLock = true;
        return missileLock;
    }

    /**
     * fires a missile, substracts 1 from missilesRemaining
     * @return missilesRemaining 
     */

    public int FireMissile() {
        if (missileLock == true) {
            if (missilesRemaining > 0) {
                missilesRemaining -= 1;
                System.out.println("SHOOOOOOOOOOOOOOOOOOOOOOOHHHHHHHHHHHHHHHHHHHH");
            } else {
                System.out.println("WARNING: LUCK HAS RAN OUT");
            }
        } else {
            System.out.println("Lock-on failed");
        }

        return missilesRemaining;
    }

    /**
     * discharges rounds based on set fire duration
     * @param autoCannonFireDuration set fire duration
     * @return rounds remaining
     */

    public int FireAutocannon(double autoCannonFireDuration) {
        double roundsFired = autoCannonFireDuration * fireRate;
        int roundsFiredInt = (int) roundsFired;

        if (roundsFiredInt > roundsRemaining) {
            roundsRemaining = 0;
            System.out.println("out of ammo, couldnt fire " + (roundsFiredInt - roundsRemaining));
        } else {
            roundsRemaining -= roundsFiredInt;
            System.out.println("BRRRRRRRRRRRRRRT, " + roundsRemaining + " rounds remaining.");
        }

        return roundsRemaining;
    }
}

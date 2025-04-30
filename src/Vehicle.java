public class Vehicle {
    
    private String vehicleName;
    private int numberOfCrew;
    private int maxCrew;
    private double fuelAmount;
    private double fuelEfficiency;
    private double startPosition;

    public Vehicle() {
        this.vehicleName = "";
        this.maxCrew = 0;
        this.numberOfCrew = 0;
        this.fuelAmount = 0;
        this.startPosition = 0;
        this.fuelEfficiency = 0;
    }

    public Vehicle(String vehicleName, int numberOfCrew, int maxCrew, double fuelAmount, double fuelEfficiency) {
        this.vehicleName = vehicleName;
        this.maxCrew = maxCrew;
        this.numberOfCrew = numberOfCrew;
        this.fuelAmount = fuelAmount;
        this.startPosition = 0;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double moves(double moveDistance) { //return to this later mate
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

    public double addMoreFuel(int fuelAdded) {
        this.fuelAmount += fuelAdded;
        return this.fuelAmount;
    }

    public String getVehicleName() {
        return this.vehicleName;
    }

    public String setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
        return this.vehicleName;
    }
}

// attributes: vehicleName, terrainNav, numberOfCrew, maxCrew, fuelAmount
// behaviours: move - consumesFuel, boardingAndLeaving, addMoreFuel
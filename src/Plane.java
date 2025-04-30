public class Plane extends Vehicle {
    
    private double altitude;
    private String currentState;

    public Plane() {
        super();
        this.altitude = 0;
        this.currentState = "ground";
    }

    public Plane(String vehicleName, int numberOfCrew, int maxCrew, double fuelAmount, double fuelEfficiency ,double altitude, String currentState) {
        super(vehicleName, numberOfCrew, maxCrew, fuelAmount, fuelEfficiency);
        this.altitude = altitude;
        this.currentState = currentState;
    }

    public double ascend(double ascendBy) {
        this.altitude += ascendBy;
        this.currentState = "flight";
        return this.altitude;
    }

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

/* Task 1: Implement an OOD that features:
    A generic Aircraft that has common features
    A Glider with commonalities with Aircraft as well as unique things
    A Jet with commonalities with Aircraft as well as unique things
    A Helicopter with commonalities with Aircraft as well as unique things
    Print instances of the above objects in console
*/

public class Main {
    public static void main(String[] args) {

      Glider myGlider = new Glider();
      Jet myJet = new Jet();
      Helicopter myHelicopter = new Helicopter();

      // Creating objects and calling the objects' methods
      Aircraft myAircraft = new Aircraft("ZS1000", "Front", "6 ft", 2, 60, 40);
      System.out.println(myAircraft.getNumberOfWheels());
      myAircraft.fly();

      System.out.println("This aircraft's tail number is " + myAircraft.getTailNumber());      
    }
}

public class Aircraft {
    // Attributes/Properties - an Aircraft have these in common
    private String tailNumber;
    private String cockpitLocation;
    private String wingsSpan;
    private int numberOfWheels;
    private int length;
    private int width;

    // Default Constructor
    public Aircraft() {}

    // Default Constructor
    public Aircraft(String tailNum, String cockpitLoc, String wingsLength, int wheelsNum, int length, int width) {
        this.tailNumber = tailNum;
        this.cockpitLocation = cockpitLoc;
        this.wingsSpan = wingsLength;
        this.numberOfWheels = wheelsNum;
        this.length = length;
        this.width = width;
    }

    // Setters and Getters
    public void setTailNumber(String tailNum) {
        this.tailNumber = tailNum;
    }
    public String getTailNumber() {
        return tailNumber;
    }
    public void setCockpitLocation(String cockpitLoc) {
        this.cockpitLocation = cockpitLoc;
    }
    public String getCockpitLocation() {
        return cockpitLocation;
    }
    public void setWingsSpan(String wingsLength) {
        this.wingsSpan = wingsLength;
    }
    public String getWingsSpan() {
        return wingsSpan;
    }
    public void setNumberOfWheels(int wheelsNum) {
        this.numberOfWheels = wheelsNum;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }

    // Behaviors/Actions - methods
    public void takeOff() {
        System.out.println("The Aircraft is taking off.");
    }
    public void fly() {
        System.out.println("The Aircraft is flying.");
    }
    public void land() {
        System.out.println("The Aircraft is landing.");
    }
}

public class Glider extends Aircraft {
    // Unique to Glider - no engine, uses tow plane
    private String towPlane;

    // Default Constructor
    public Glider() {}

    // Default Constructor
    public Glider(String towPlaneName) {
        this.towPlane = towPlaneName;
    }

    // Setter and Getter
    public void setEngine(String towPlaneName) {
		this.towPlane = towPlaneName;
	}
	public String getEngine() {
		return towPlane;
	}
}

public class Jet extends Aircraft {
    // Unique to Jet - gas-turbine, specific fuel
    private String gasTurbineType;
    private String fuel;

    // Default Constructor
    public Jet() {}

    // Default Constructor
    public Jet(String fuel, String gasTurbine) {
        this.fuel = fuel;
        this.gasTurbineType = gasTurbine;
    }

    // Setters and Getters
    public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getFuel() {
		return fuel;
	}
    public void setGasTurbineType(String gasTurbine) {
		this.gasTurbineType = gasTurbine;
	}
	public String getGasTurbineType() {
		return gasTurbineType;
	}
}

public class Helicopter extends Aircraft {
    // Unique to Heli - blade and rotor
    private int lengthOfBlade;
    private int rotorRpm;

    // Default Constructor
    public Helicopter() {}

    // Default Constructor
    public Helicopter(int bladeLength, int rpm) {
        this.lengthOfBlade = bladeLength;
        this.rotorRpm = rpm;
    }

    // Setters and Getters
    public void setBladeLength(int bladeLength) {
		this.lengthOfBlade = bladeLength;
	}
	public int getBladeLength() {
		return lengthOfBlade;
	}
    public void setRotorRpm(int rpm) {
		this.rotorRpm = rpm;
	}
	public int getRotorRpm() {
		return rotorRpm;
	}
}
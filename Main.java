/* Task 1: Implement an OOD that features:
    A generic Aircraft that has common features
    A Glider with commonalities with Aircraft as well as unique things
    A Jet with commonalities with Aircraft as well as unique things
    A Helicopter with commonalities with Aircraft as well as unique things
    Print instances of the above objects in console
*/

public class Main {
    public static void main(String[] args) {
      // Creating objects
      Aircraft myAircraft = new Aircraft();
      Glider myGlider = new Glider();
      Jet myJet = new Jet();
      Helicopter myHelicopter = new Helicopter();

      // Calling the objects' methods
      myAircraft.fly();
      myGlider.fly();
      myJet.fly();
      myHelicopter.fly();
    }
}

public class Aircraft {
    // Attributes/Properties - an Aircraft have these in common
    private String tailNumber;
    private String cockpitLocation;
    private String propellerType;
    private String wingsType;

    // Default Constructor
    public Aircraft() {}

    // Setters and Getters
    public void setTailNumber(String tail) {
        this.tailNumber = tail;
    }
    public String getTailNumber() {
        return tailNumber;
    }
    public void setCockpitLocation(String cockpit) {
        this.cockpitLocation = cockpit;
    }
    public String getCockpitLocation() {
        return cockpitLocation;
    }
    public void setPropellerType(String propeller) {
        this.propellerType = propeller;
    }
    public String getPropellerType() {
        return propellerType;
    }
    public void setWingsType(String wings) {
        this.wingsType = wings;
    }
    public String getWingsType() {
        return wingsType;
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
    // Unique to Glider - no engine
    private boolean hasEngine;

    // Default Constructor
    public Glider() {}

    // Default Constructor
    public Glider(boolean engine) {
        this.hasEngine = engine;
    }

    // Setter and Getter
    public void setEngine(boolean engine) {
		this.hasEngine = engine;
	}
	public boolean getEngine() {
		return hasEngine;
	}

    // Method override
    @Override
    public void fly() {
        System.out.println("The Glider is gliding.");
    }
}

public class Jet extends Aircraft {
    // Unique to Jet - yes engine, yes gas-turbine
    private boolean hasGasTurbine;
    private String fuel;
    // Default Constructor
    public Jet() {}

    // Default Constructor
    public Jet(String fuel, boolean gasTurbine) {
        this.fuel = fuel;
        this.hasGasTurbine = gasTurbine;
    }

    // Setters and Getters
    public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getFuel() {
		return fuel;
	}
    public void setTurbine(boolean gasTurbine) {
		this.hasGasTurbine = gasTurbine;
	}
	public boolean getEngine() {
		return hasGasTurbine;
	}

    // Method override
    @Override
    public void fly() {
        System.out.println("The Jet is going fast.");
    }
}

public class Helicopter extends Aircraft {
    // Unique to Heli - yes blade, yes rotor
    private boolean hasBlade;
    private boolean hasRotor;

    // Default Constructor
    public Helicopter() {}

    // Default Constructor
    public Helicopter(boolean blade, boolean rotor) {
        this.hasBlade = blade;
        this.hasRotor = rotor;
    }

    // Setters and Getters
    public void setBlade(boolean blade) {
		this.hasBlade = blade;
	}
	public boolean getBlade() {
		return hasBlade;
	}
    public void setRotor(boolean rotor) {
		this.hasRotor = rotor;
	}
	public boolean getRotor() {
		return hasRotor;
	}

    // Method override
    @Override
    public void fly() {
        System.out.println("The Helicopter is rotating its blade.");
    }
}
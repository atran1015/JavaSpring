/* Task 1: Implement an OOD that features:
    A generic Aircraft that has common features
    A Glider with commonalities with Aircraft as well as unique things
    A Jet with commonalities with Aircraft as well as unique things
    A Helicopter with commonalities with Aircraft as well as unique things
    Print instances of the above objects in console
*/
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldSB {
    public static void main(String[] args) {
      System.out.println("testing"); // can run program here
      Aircraft myAircraft = new Aircraft("ZS1000", "Front", "11 ft", 2, 60, 40);
      Glider myGlider = new Glider("YX2000", "Front", "50 ft", 1, 30, 15, "Beagle Husky");
      Jet myJet = new Jet("N904DE", "Front", "38.7 ft", 2, 13, 24, "Jet A-1", "Turbojet");
      Helicopter myHelicopter = new Helicopter("N721AF", "Front", "20 ft", 3, 45, 33, 14, 500);

      // Printing instances to console
      System.out.println("---------- Aircraft's details ----------");
      myAircraft.printDetails();
      System.out.println("---------- Glider's details ----------");
      myGlider.printDetails();
      System.out.println("---------- Jet's details ----------");
      myJet.printDetails();
      System.out.println("---------- Helicopter's details ----------");
      myHelicopter.printDetails();    
      SpringApplication.run(HelloWorldSB.class, args);
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
    public void printDetails() {
        System.out.println("Tail Number: " + getTailNumber());
        System.out.println("Cockpit Location: " + getCockpitLocation());
        System.out.println("Wings Span Length: " + getWingsSpan());
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
    }
}

public class Glider extends Aircraft {
    // Unique to Glider - no engine, uses tow plane
    private String towPlane;

    // Default Constructor
    public Glider() {}

    // Default Constructor
    public Glider(String tailNum, String cockpitLoc, String wingsLength, int wheelsNum, int length, int width, String towPlaneName) {
        super(tailNum, cockpitLoc, wingsLength, wheelsNum, length, width);
        this.towPlane = towPlaneName;
    }

    // Setter and Getter
    public void setTowPlaneName(String towPlaneName) {
		this.towPlane = towPlaneName;
	}
	public String getTowPlaneName() {
		return towPlane;
	}
    public void printDetails() {
        System.out.println("Tail Number: " + getTailNumber());
        System.out.println("Cockpit Location: " + getCockpitLocation());
        System.out.println("Wings Span Length: " + getWingsSpan());
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
        System.out.println("Name of Towplane: " + getTowPlaneName());
    }
}

public class Jet extends Aircraft {
    // Unique to Jet - gas-turbine, specific fuel
    private String gasTurbineType;
    private String fuel;

    // Default Constructor
    public Jet() {}

    // Default Constructor
    public Jet(String tailNum, String cockpitLoc, String wingsLength, int wheelsNum, int length, int width, String fuel, String gasTurbine) {
        super(tailNum, cockpitLoc, wingsLength, wheelsNum, length, width);
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
    public void printDetails() {
        System.out.println("Tail Number: " + getTailNumber());
        System.out.println("Cockpit Location: " + getCockpitLocation());
        System.out.println("Wings Span Length: " + getWingsSpan());
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
        System.out.println("Name of Fuel: " + getFuel());
        System.out.println("Type of Gas-Turbine: " + getGasTurbineType());
    }
}

public class Helicopter extends Aircraft {
    // Unique to Heli - blade and rotor
    private int lengthOfBlade;
    private int rotorRpm;

    // Default Constructor
    public Helicopter() {}

    // Default Constructor
    public Helicopter(String tailNum, String cockpitLoc, String wingsLength, int wheelsNum, int length, int width, int bladeLength, int rpm) {
        super(tailNum, cockpitLoc, wingsLength, wheelsNum, length, width);
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
    public void printDetails() {
        System.out.println("Tail Number: " + getTailNumber());
        System.out.println("Cockpit Location: " + getCockpitLocation());
        System.out.println("Wings Span Length: " + getWingsSpan());
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
        System.out.println("Length of Blade: " + getBladeLength());
        System.out.println("Rotor RPM: " + getRotorRpm());
    }
}

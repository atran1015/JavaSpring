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
public class HelloSpringBoot {
    public static void main(String[] args) {
      System.out.println("testing"); // can run program here
    //   Aircraft myAircraft = new Aircraft("ZS1000", "Front", "11 ft", 2, 60, 40);
    //   Glider myGlider = new Glider("YX2000", "Front", "50 ft", 1, 30, 15, "Beagle Husky");
    //   Jet myJet = new Jet("N904DE", "Front", "38.7 ft", 2, 13, 24, "Jet A-1", "Turbojet");
    //   Helicopter myHelicopter = new Helicopter("N721AF", "Front", "20 ft", 3, 45, 33, 14, 500);

    //   // Printing instances to console
    //   System.out.println("---------- Aircraft's details ----------");
    //   myAircraft.printDetails();
    //   System.out.println("---------- Glider's details ----------");
    //   myGlider.printDetails();
    //   System.out.println("---------- Jet's details ----------");
    //   myJet.printDetails();
    //   System.out.println("---------- Helicopter's details ----------");
    //   myHelicopter.printDetails();    
      SpringApplication.run(HelloSpringBoot.class, args);
    }
}
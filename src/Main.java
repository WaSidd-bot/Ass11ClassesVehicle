/**@author Wasay
 * @version 2025.05.05
*/

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Main method of project to test classes
*/

public class Main {

    /**
    * Method to test project classes
    * @param args main method inputs
    * @exception InputMismatchException when inputs are mismatched, scanner will throw an exception
    * @throws java.lang.Exception possible exception with scanner class
    */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello operator, please choose the characteristice of a fighter jet to input:");

        System.out.println("Name of vehicle");
        String name = scan.nextLine();

        System.out.println("Number of souls onboard");
        int crew = scan.nextInt();

        System.out.println("Input maximum crew capacity");
        int maxCrew = scan.nextInt();

        System.out.println("Fuel loaded");
        double fuel = scan.nextDouble();

        System.out.println("Fuel efficiency of jet");
        double efficiency = scan.nextDouble();

        System.out.println("Number of explodeys onboard");
        int missile = scan.nextInt();

        System.out.println("Fire rate of the BBBBBBBBBBRRRRRRRRRRRRRRRRTTTTTTTTTT");
        int rate = scan.nextInt();

        System.out.println("Number of bullets");
        int bullets = scan.nextInt();

        scan.close();
        
        FighterJet test = new FighterJet(name, crew, maxCrew, fuel, efficiency, 0, "ground", false, missile, rate, bullets);

        test.fly(10);

        test.ascend(100);

        test.fly(10);

        test.FireMissile();

        test.acquireLock();

        test.FireMissile();

        test.FireAutocannon(5);
    }
}

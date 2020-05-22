package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.CapuccinoCoffee;
import lab.assignment.beforerefactoring.CoffeeMaker;
import lab.assignment.beforerefactoring.MochaCoffee;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new MochaCoffee();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new CapuccinoCoffee();

        starbuzz.prepareCoffee();

    }

}

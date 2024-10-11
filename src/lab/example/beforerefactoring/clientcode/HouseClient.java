package lab.example.beforerefactoring.clientcode;

import lab.example.beforerefactoring.HouseTemplate;

/**
 * ISSUES HERE: 
 * Tight Coupling: HouseClient is tightly coupled to HouseTemplate. Any change in the house building methods affects the client.
 * Lack of Extensibility: To introduce a new house type, HouseTemplate must be modified, which violates the Open-Closed Principle.
 */
public class HouseClient {

    public static void main(String[] args) {
        HouseTemplate house = new HouseTemplate();

        house.buildWoodenHouse();
        System.out.println("************");


        house.buildGlassHouse();
        System.out.println("************");

        house.buildConcreteHouse();
        System.out.println("************");

    }
}

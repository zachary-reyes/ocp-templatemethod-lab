package lab.assignment.beforerefactoring;

public class MochaCoffee extends CoffeeMaker{

    @Override
    protected void addIngredients() {

        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    protected void finalTouch() {
        System.out.println("Adding sugar");
    }
}
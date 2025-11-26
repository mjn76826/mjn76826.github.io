import java.util.Scanner;

public class HomeWork_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Coffee Hour!!!");

        // First coffee
        System.out.print("What's the name of the first coffee? ");
        String name1 = input.nextLine();

        System.out.print("What's the caffeine content? ");
        double caffeine1 = input.nextDouble();
        input.nextLine(); // clear input buffer

        Coffee coffee1 = new Coffee(name1, caffeine1);

        // Second coffee
        System.out.print("What's the name of the second coffee? ");
        String name2 = input.nextLine();

        System.out.print("What's the caffeine content? ");
        double caffeine2 = input.nextDouble();

        Coffee coffee2 = new Coffee(name2, caffeine2);

        // Display results
        System.out.println();
        System.out.println("It would take " + coffee1.riskyAmount() + " cups of " + coffee1.getName() + " before it's dangerous to drink more.");
        System.out.println("It would take " + coffee2.riskyAmount() + " cups of " + coffee2.getName() + " before it's dangerous to drink more.");

        input.close();
    }
}
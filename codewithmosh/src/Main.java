import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome!!!");
        System.out.println("PRESS 1 for Basic Operation Class");
        System.out.println("PRESS 2 for Mortgage Calculator");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your class choice: ");
        int x = input.nextInt();

        if (x == 2) {
            mortgageCalculator calcObject = new mortgageCalculator();
            calcObject.calculator();
        }

        else if (x == 1) {
            basicOperations mainObject = new basicOperations();
            mainObject.main();
        }

        else {
            System.out.println("Invalid Choice :(");
        }
    }
}
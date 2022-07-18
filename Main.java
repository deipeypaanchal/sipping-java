import java.text.NumberFormat;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        /*
        int num = 1_00_000;
        System.out.println(num);
        //We can use underscore to separate big numbers instead of commas in JAVA.
        //For example: 1,00,000 should be written as 1_00_000, BUT IT WON'T PRINT IT WITH COMMAS.

        Date now = new Date();
        System.out.println(now);
        //Date is a class available in java.util package.

        String message = "Hello World !!";
        System.out.println(message.replace("World","India"));

        String message2 = "   Hello World      !!     ";
        System.out.println(message2);
        System.out.println(message2.trim());
        //trim() will only trim extra spaces before and after the string but not the one within the string.

        int[] numbers = {2,4,3,5,1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //Arrays.toString() is used to get the original list instead of some random and weird output.

        int[][] numbers2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers2));
        //Arrays.ToString() is used to print multidimensional Arrays.

        final float PI = 3.14F;
        //F is added to the data so that it can be identified as float value, otherwise it'll be treated as a double value.
        //final is added prior to the data type so make the variable constant throughout the program.
        //By convention, we use all CAPITAL LETTERS for CONSTANTS.

        double num1 = 1.1;
        int num2 = (int) num1 + 2;
        System.out.println(num2);
        //when adding an int with double, or in short, when adding different data type, use braces. Refer example below.
        double num3 = 3.45;
        float sum = (float) num3 + 1.234F;
        System.out.println(sum);

        String num4 = "24";
        int num5 = 123;
        int sum2 = Integer.parseInt(num4) + num5;
        System.out.println(sum2);

        String num6 = "123.23";
        double sum3 = (double) num5 + Double.parseDouble(num6);
        float sum4 = (float) num5 + Float.parseFloat(num6);
        System.out.println(sum3);
        System.out.print(sum4);
        //parse is used to collect the data from string in the form of numeric expression

        double result = Math.random();
        System.out.println("\n" + result);
        float result2 = (float) (Math.random() * 100);
        int result3 = (int) (Math.random() * 100); //this will get the number between 0 and 100
        System.out.println("Random float number is " + result2 + " and the random int number is " + result3);
        */

        /*
        //MORTGAGE CALCULATOR
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Principal (in $): ");
        float p = input.nextFloat();

        System.out.print("Enter your monthly interest rate: ");
        float r = input.nextFloat();

        System.out.print("Enter your number of payments (the number of months you will be paying the loan): ");
        int n = input.nextInt();

        if (r == 0) {
            float m1 = (p / 12);
            String MortgageFormatted1 = NumberFormat.getCurrencyInstance().format(m1);
            System.out.println("Monthly Payment: " + MortgageFormatted1);
        }

        else {
            float m2 = (float) ((p * r * (Math.pow(1 + r, n))) / ((Math.pow(1 + r, n)) - 1));
            String MortgageFormatted2 = NumberFormat.getCurrencyInstance().format(m2);
            System.out.println("Monthly Payment: " + MortgageFormatted2);
        }
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = input.nextInt();
        String ClassName = income > 100000 ? "First" : "Economy";
        //This line of code is an example of TERNARY OPERATOR
        //We add a condition, for example income here, then we add ? (if true) and : (otherwise) with their values.
        System.out.println("Class Name: " + ClassName);

    }
}

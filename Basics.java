////Code 1 - Helloworld - Basic code to print in JAVA
//class Basics {
//    public static void main(String args[]) {
//        System.out.println("Hello World");
//    }
//}

////Code 2 - .length() method - To determine the length of string - Way 1
//class Basics {
//    public static void main(String[] args) {
//        int deepey = "Hello".length();
//        System.out.println(deepey);
//    }
//}

////Code 3 - .length() method - To determine the length of string - Way 2
//class Basics {
//    public static void main(String[] args) {
//        System.out.println("Hello World".length());
//    }
//}

////Code 4 - .toLowerCase and .toUpperCase method - To format all the characters in UPPER/lower case
//class Basics{
//    public static void main (String[] args) {
//        System.out.println("Hello World".toLowerCase());
//        System.out.println("Hello World".toUpperCase());
//    }
//}

////Code 5 - .substring() method
//class Basics {
//    public static void main(String[] args) {
//        System.out.println("Deepey Panchal".substring(0,6));
//    }
//}

//Method .charAt(x) can be used to find out the character at index x

////Code 6 - .equals() method
//class Basics {
//    public static void main(String[] args) {
//        boolean equalsOrNot = "This is Jamie".equals("This is Jamie");
//        boolean equalsOrNot2 = "This is Jamie".equals("Hello World");
//        //equalsOrNot will be true while equalsOrNot2 will be false
//    }
//}

////Code 7 - Arrays - using .sort() for ascending order and .toString() to print an array
//import java.util.Arrays;
//class Basics {
//    public static void main(String[] args) {
//        int[] numbers = {0,-2,2,1,-1};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//    }
//}

////Code 8 - Taking inputs
//import java.util.Scanner;
//class Basics {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//                System.out.print("Enter your birth year: ");
//                int year = input.nextInt();
//                int age = 2022 - year;
//                        System.out.printf("You are probably %d years old.", age);
//    }
//}

////Code 9 - If Statement
//import java.util.Scanner;
//class Basics {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("\nPlease enter your age: ");
//        int age = input.nextInt();
//        if (age<0 || age>100) {
//            System.out.println("Invalid age. Please enter an age between 0 and 100.");
//        }
//        else if (age<18) {
//            System.out.println("Sorry, you are underage.");
//        }
//        else if (age<21) {
//            System.out.println("You will need a parental consent.");
//        }
//        else {
//            System.out.println("Congratulations! You are eligible to sign up for the event.");
//        }
//    }
//}

////Code 10 - Python lecture codes in JAVA
//import java.util.Scanner;
//class Basics {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("\nEnter a score between 0 and 100: ");
//        int score = input.nextInt();
//        while (score<0 || score>100) {
//            System.out.print("\nInvalid score. Please enter a score between 0 and 100 again: ");
//            score = input.nextInt();
//        }
//        if (score>=80) {
//            System.out.println("\nYay! You passed!");
//        }
//        else {
//            System.out.println("\nOh no! Try again");
//        }
//    }
//}

////Code 11 - python codes to JAVA
//import java.util.Scanner;
//class Basics {
//   public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//       System.out.print("\nEnter the temperature in Farenheit: ");
//       float temperature = input.nextFloat();
//
//       while (temperature <= -58 || temperature >= 41) {
//           System.out.println("Temperature must be between -58F and 41F");
//           System.out.print("\nPlease re-enter the temperature in Fahrenheit: ");
//           temperature = input.nextFloat();
//       }
//
//       if (temperature > -58 || temperature < 41) {
//           System.out.print("\nEnter the wind speed miles per hour: ");
//           float wind_speed = input.nextFloat();
//           while (wind_speed < 2) {
//               System.out.println("\nSpeed must be greater than or equal to 2");
//               System.out.print("\nPlease re-enter the wind speed miles per hour: ");
//               wind_speed = input.nextFloat();
//           }
//           if (wind_speed>2){
//               double wind_chill_index = 35.74 + 0.6215 * temperature - 35.75 * (float)Math.pow(wind_speed, 0.16) + 0.4275 * temperature * (float)Math.pow(wind_speed, 0.16);
//               System.out.printf("\nThe wind chill index is %.3f", wind_chill_index);
//           }
//       }
//   }
//}

////Code 12 - For Loop
//class Basics {
//    public static void main(String[] args) {
//        for (int i = -10; i <= 10; i++) {
//            System.out.println(i);
//        }
//    }
//}

////Code 13 - For Loop
//class Basics {
//    public static void main(String[] args) {
//        int[] numbers = {10, 20, 30, 40, 50};
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println(numbers[i]);
//        }
//    }
//}

////Code 14 - Enhanced For Loop
//    class Basics {
//    public static void main(String[] args) {
//        int[] numbers = {10, 20, 30, 40, 50};
//        for (int item : numbers) {
//            System.out.println(item);
//        }
//    }
//}

////Code 15 - Switch
//import java.util.Scanner;
//class Basics {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your grade: ");
//        String grade = input.nextLine().toUpperCase();
//
//        switch (grade)
//        {
//            case "A+":
//            case"A-":
//            case"A":
//                System.out.println("Excellent!!!");
//                break;
//            case "B+":
//            case"B":
//            case"B-":
//                System.out.println("Good!!");
//                break;
//            default:
//                System.out.println("Better luck next time");
//                break;
//        }
//    }
//}

////Code 16 - if statement inside a for statement
//class Basics {
//    public static void main(String[] args) {
//        for (int i = 0; i<5; i++) {
//            System.out.println(i);
//            if (i == 2)
//                break;
//        }
//    }
//}

////Code 17 - continue statement
//class Basics {
//    public static void main(String[] args) {
//        for (int i = 0; i<5; i++) {
//            System.out.println(i);
//            if (i == 2)
//                continue; //continue is used to skip an iteration
//            System.out.println("This statement will not be printed when i is equals to 2");
//        }
//    }
//}

////Code 18 - Exception handling using try-catch-finally
//import java.util.Scanner;
//class Basics {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        try {
//            System.out.print("Enter a numerator: ");
//            int numerator = input.nextInt();
//            System.out.print("Enter a denominator: ");
//            int denominator = input.nextInt();
//            System.out.println("The result is " + numerator/denominator);
//            }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//            }
//        finally {
//            System.out.println("---- End of Error Handling Example ----");
//            }
//    }
//}

////Code 19
//import java.util.Arrays;
//class Basics {
//    public static void main(String[] args) {
//        int[] arr1 = {0,2,4,6,8,10};
//        int[] arr2 = {0,2,4,6,8,10};
//        int[] arr3 = {10,8,6,4,2,0};
//        boolean result1 = Arrays.equals(arr1, arr2);
//        boolean result2 = Arrays.equals(arr1, arr3);
//
//        System.out.println(result1);
//        System.out.println(result2);
//    }
//}

////Code 20
//class Basics {
//    public static void main(String[] args) {
//        String name = "Shaktimaan";
//        System.out.println(name);
//    }
//}

////Code 21
//import java.util.Scanner;
//class Basics {
//    public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//       System.out.print("Enter your grade: ");
//       String grade = input.nextLine().toUpperCase();
//
//       switch (grade) {
//           case "AB":
//               System.out.println("Okay");
//                       break;
//           default:
//               System.out.println("Alright");
//               break;
//       }
//    }
//}
///*
//After doing this, I learned that Switch doesn't work with the range of values.
//Also, I was unable to implement case ("AB" || "BC"):. Instead we can do as follows:
//case "AB":
//case "BC":
//case "Bla bla":
//System.out.println("message");
//break;
//.toUpperCase in code line 287 interprets every input as an upper case string which helps in output regardless of input's alphabetical case.
// */

////Code 22 - InputMismatchException - Specific Errors
//import java.util.InputMismatchException;
//import java.util.Scanner;
//class Basics {
//    public static void main(String[] args) {
//        int choice = 0;
//        Scanner input = new Scanner(System.in);
//        int[] numbers = {10, 11, 12 , 13, 14, 15};
//        System.out.print("Please enter the index of the array: ");
//        try {
//            choice = input.nextInt();
//            System.out.printf("numbers[%d] = %d%n", choice, numbers[choice]);
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Error: Index is invalid.");
//        }
////This (above) exception occurs when you try to access an element of an array with an index that is outside its bounds.
////This (below) exception occurs when the input received by a Scanner method does not match the expected type.
//        catch (InputMismatchException e) {
//            System.out.println("Error: You did not enter an integer.");
//        }
////This exception is to catch any general errors that we did not pre-empt.
//        catch (Exception e) {
//            System.out.printf(e.getMessage());
//        }
//    }
//}

////Code 23 - Throwing Exceptions
//import java.util.InputMismatchException;
//import java.util.Scanner;
//class Basics {
//    public static void main(String[] args) {
//        int choice = 0;
//        int[] numbers = {10, 11, 12 , 13, 14, 15};
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter the index of the array: ");
//        try {
//            choice = input.nextInt();
//            if (choice == 0) {
//                throw new ArrayIndexOutOfBoundsException();
//            }
//            System.out.printf("numbers[%d] = %d%n", choice, numbers[choice]);
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Error: Index is invalid.");
//        }
//        catch (InputMismatchException e) {
//            System.out.println("Error: You did not enter an integer.");
//        }
//        catch (Exception e) {
//            System.out.printf(e.getMessage());
//        }
//    }
//}

////Code 24 - half pyramid using for LOOP
//class Basics {
//    public static void main(String[] args) {
//        int rows = 5;
//
//        for (int i=1; i<=rows; ++i) {
//            for (int j=1; j<=i; ++j) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

////Code 25 - full pyramid using the for loop
//import java.util.Scanner;
//class Basics {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a value between 1 and 10: ");
//        int rows = input.nextInt();
//
//        while (rows > 10 || rows < 1) {
//            System.out.print("Invalid input. Enter a value between 1 and 10: ");
//            rows = input.nextInt();
//        }
//
//        for (int i=1; i<=rows; i++) {
//            for (int j=1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//import java.util.Scanner;
//class Basics {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a starting number: ");
//        int start = input.nextInt();
//        System.out.print("Enter an ending number: ");
//        int end = input.nextInt();
//
//        while (end < start) {
//            System.out.print("Your number is smaller than Start. Please enter a larger value: ");
//            end = input.nextInt();
//        }
//        int i;
//        for (i=start ; i<=end; i++){
//            System.out.println(i);
//        }
//    }
//}

////Code 26
//class Basics{
//    static void deepey() {
//        String name = "Deepey";
//        System.out.println("My name is " + name + ".");
//    }
//
//    public static void main(String[] args) {
//        deepey();
//        System.out.println("You can write program like that and can also add print statement in main method.");
//    }
//}

////Code 27 - Arrays
//class Basics {
//    static void arrays() {
//
//        int[] scores = {90, 80, 85, 90, 100};
//
//        System.out.println("\nExam 1: " + scores[0]);
//        System.out.println("Exam 2: " + scores[1]);
//        System.out.println("Exam 3: " + scores[2]);
//        System.out.println("Final Project: " + scores[3]);
//        System.out.println("Extra Credit: " + scores[4] + "\n");
//    }
//
//        /* Another method is as follows:
//
//        class Basics {
//        static int[] scores;
//        static void arrays() {
//        scores = new int[] {90, 80, 85, 90, 100}
//        [...]
//
//        */
//
//    public static void main(String[] args) {
//        arrays();
//    }
//}

////Code 28 - HackerRank 
// import java.util.Scanner;
// class Basics {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter a integer: ");
//         int a = input.nextInt();
//         System.out.print("Enter a double: ");
//         double b = input.nextDouble();
//         System.out.print("Enter a string: ");
//         input.nextLine(); 
//         String c = input.nextLine();
// /*
// # This line is necessary when needed to take a string input
// # Whenever you use the nextLine() method after the nextDouble() method. 
// # You should always have an additional nextLine() method to consume theprevious newline character.
// */

//         System.out.println("String: " + c);
//         System.out.println("Double: " + b);
//         System.out.println("Integer: " + a);
//     }
// }

//// Code 29 - HackerRank - 1 of 30 Days of Code - Data Types
// import java.util.Scanner;
// class Solution {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int i = input.nextInt();
//         double d = input.nextDouble();
//         input.nextLine();
//         String s = input.nextLine();        
//         /* double sum = i+d;
//         int sum1 = (int) sum; */  
//         int sum = (int) (i + 4);
//         double sum2 = d + 4;  
//         System.out.println(sum);    
//         System.out.println(sum2);
//         System.out.println("HackerRank " + s);
//     }
// }

// Code 30 - HackerRank Daily Practice
// import java.util.Scanner;
// class Solution {
//     public static void main(String[] args) {
//             Scanner input = new Scanner(System.in);
//             System.out.println("================================");
//             for (int i=0; i<3; i++) {
//                 String s1=input.next();
//                 int x = input.nextInt();
//                 System.out.printf("%-15s%03d %n", s1, x);
//             }
// /* %-15s will format a string left-justified, %n will get us a new line, and %03d is getting us 3 decimal points. */  
//             System.out.println("================================");
//     }
// }

// Code 31 - Java-In-Depth -  Arrays
class Basics {

    static void currency(){
        double[] exchangeRates = {63, 3 , 3, 595, 18, 107, 2};
        System.out.println("rupee: " + exchangeRates[0]);
        System.out.println("dirham: " + exchangeRates[1]);
        System.out.println("real: " + exchangeRates[2]);
        System.out.println("chilean_peso: " + exchangeRates[3]);
        System.out.println("mexican_peso: " + exchangeRates[4]);
        System.out.println("yen: " + exchangeRates[5]);
        System.out.println("$australian: " + exchangeRates[6]);
    }

    public static void main(String[] args) {
        currency();
    }

}
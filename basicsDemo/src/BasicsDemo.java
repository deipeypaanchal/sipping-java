import java.util.Date;
import java.util.ArrayList;

public class BasicsDemo {
    static void print() {
        System.out.println("\n\nInside print ...");
        System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
        System.out.println();                 // Print empty line
        System.out.print("Hello, world!!");   // Cursor stayed after the printed string
        System.out.println("Hello,");
        System.out.print(" ");                // Print a space
        System.out.print("world!!");
    }

    static void primitives() {
        System.out.println("\n\nInside primitives ...");
        // literals demo
        int intHex = 0x0041;
        System.out.println("intHex: " + intHex);
        int intBinary = 0b01000001;
        System.out.println("intBinary: " + intBinary);
        int intChar = 'A'; // holds decimal equivalent, which is 65
        System.out.println("intChar: " + intChar);
        int intUnderscore = 1_23_456;
        System.out.println("intUnderscore: " + intUnderscore);

        char charA = 'A';
        System.out.println("charA: " + charA);
        char charInt = 65;
        System.out.println("charInt: " + charInt);
        char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
        System.out.println("charUnicode1: " + charUnicode1);
        char charUnicode2 = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
        System.out.println("charUnicode2: " + charUnicode2);
        char charBinary = 0b01000001; // binary corresponding to decimal 65
        System.out.println("charBinary: " + charBinary);
    }

    static void typeCasting() {
        System.out.println("\nInside typeCasting ...");
        // Explicit casting
        long y = 42;
        //int x = y;
        int x = (int)y;

        // Information loss due to out-of-range assignment
        byte narrowdByte = (byte)123456;
        System.out.println("narrowdByte: " + narrowdByte);

        // Truncation
        int iTruncated = (int)0.99;
        System.out.println("iTruncated: " + iTruncated);

        // Implicit cast (int to long)
        y = x;

        // Implicit cast (char to int)
        char cChar = 'A';
        int iInt = cChar;
        System.out.println("iInt: " + iInt);

        // byte to char using an explicit cast
        byte bByte = 65;
        cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
        System.out.println("cChar: " + cChar);
    }

    static void arrays() {
        System.out.println("\nInside arrays ...");
        int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
        System.out.println("myArray.length: " + myArray.length);
        System.out.println("myArray[1]: " + myArray[1]);
        System.out.println("myArray[7]: " + myArray[7]);
    }

    static void threeDimensionalArrays() {
        System.out.println("\nInside threeDimensionalArrays ...");
        int[][][] unitsSold = new int[][][]{
                { // New York
                        {0,0,0,0}, // Jan
                        {0,0,0,0}, // Feb
                        {0,0,0,0}, // Mar
                        {0,850,0,0}// Apr
                },
                { // San Francisco
                        {0,0,0,0}, // Jan
                        {0,0,0,0}, // Feb
                        {0,0,0,0}, // Mar
                        {0,0,0,0}  // Apr
                },
                {
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                },
                {
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                }
        };

        System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
    }

    static void varargsOverload(boolean b, int i, int j, int k){
        System.out.println("\nInside varargsOverload without varargs ...");
    }
    static void varargsOverload(boolean b, int... list){
        System.out.println("\nInside varargsOverload with varargs ...");
        System.out.println("list.length: " + list.length);
    }

    static void charTypePromotion() {
        System.out.println("\nInside charTypePromotion ...");
        char char1 = 50; // Will be assigned corresponding UTF16 value 2
        System.out.println("char1: " + char1);
        System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e., decimal equivalent 50 in UTF16 is used
        System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to ints
        System.out.println("('a' + 'b'): " + ('a' +'b')); // 'a' & 'b' are promoted to ints and the respective equivalents 97 & 98 are added
    }

    static void bitwiseOperators() {
        System.out.println("\nInside bitwiseOperators ...");
        int x = 1;
        int y = 3;

        System.out.println("x & y: " + (x & y));
        System.out.println("x | y: " + (x | y));
        System.out.println("x ^ y: " + (x ^ y));
        System.out.println("~x: " + (~x));
        System.out.println("true & false: " + (true & false));

        char c1 = 'a'; // U+0061 --> 0110 0001
        char c2 = 'b'; // U+0062 --> 0110 0010
        System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal

        // Since bitwise work only on Integer types, following will not compile
        //double d1 = 3.14;
        //double d2 = 5.15;
        //System.out.println("d1 | d2: " + (d1 | d2));
    }

    static void switchExample() {
        System.out.println("\nInside switchExample ...");
        int month = 3;
        switch (month) {
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            default: System.out.println("April");
        }
    }

    static void labeledContinue() {
        System.out.println("\nInside labeledContinue ...");
        int num = 0;

        outermost: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    continue outermost;
                }
                num++;
            }
        }

        System.out.println("num: " + num); // prints 55
    }

    static void labeledBreak() {
        System.out.println("\nInside labeledBreak...");
        int num = 0;

        outermost: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    break outermost;
                }
                num++;
            }
        }
        System.out.println("num: " + num);
    }

    static void stringExamples() {
        System.out.println("\nInside stringExamples...");
        String s = "hello world!";
        System.out.println("s: " + s);

        System.out.println("\ns.length(): " + s.length());
        System.out.println("s.isEmpty(): " + s.isEmpty());
        System.out.println("s.contains(\"world!\"): " + s.contains("world!"));
        /*
        There are also methods such as endsWith(), indexOf(), lastIndexOf(), startsWith(), charAt(), etc.
        */
        //This returns the string with trimmed extra spaces=
        System.out.println("\ns.trim(): " + s.trim());
    }

    static void stringPool() {
        System.out.println("\nInside stringPool...");
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hello".intern();
        String s4 = new String("hello");
        final String s5 = "lo";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1 == s4: " + (s1 == s4));
        System.out.println("s1 == s4.intern(): " + (s1 == s4.intern()));
        System.out.println("s1 == \"hel\" + \"lo\": " + (s1 == "hel" + "lo"));
        System.out.println("s1 == \"hel\" + s5 : " + (s1 == "hel" + s5));
    }

    private static void mathDemo() {
        double random = Math.random();
        int winner = (int) (random * 100) + 1;
        System.out.println(random);
        System.out.println(winner);

        //Round ~ rounding floating point to the nearest integer
        long distance1 = Math.round(24.45);
        int distance2 = Math.round(24.5f);
        System.out.println(distance1);
        System.out.println(distance2);

        //Ceil ~ round-up
        double ceil1 = Math.ceil(24.45);
        double ceil2 = Math.ceil(25.0);
        System.out.println(ceil1);
        System.out.println(ceil2);

        //floor ~ round down
        double floor1 = Math.floor(24.45);
        double floor2 = Math.floor(25.0);
        System.out.println(floor1);
        System.out.println(floor2);

        double max = Math.max(23.34, 24.5);
        System.out.println(max);

        double abs = Math.abs(-23.34);
        System.out.println(abs);

        double pow = Math.pow(2.0, 4.0);
        System.out.println(pow);

        double nan = 0.0/0.0;
        double sqrt = Math.sqrt(nan);
        System.out.println(sqrt);

        double idf = Math.log(100/8);
        System.out.println(idf);
    }

    public BasicsDemo() {
        System.out.println("Inside no-arg constructor ...");
    }

    public BasicsDemo(int id) {
        System.out.println("Inside constructor with a parameter ...");
    }

    {
        //Instance initializer code will be copied to the beginning of each of the constructor.
        System.out.println("\nInside instance initializer ...");
    }

    public static void main(String[] args) {
        // print();
        // primitives();
        // typeCasting();
        // arrays();
        // threeDimensionalArrays();
        // varargsOverload(true, 1, 2, 3);
        // varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);
        // varargsOverload(true);
        // charTypePromotion();
        // bitwiseOperators();
        // switchExample();
        // labeledContinue();
        // labeledBreak();
        // Date date;
        // ArrayList List;
        // java.sql.Date date2;
        // stringExamples();
        //stringPool();
        //mathDemo();
        BasicsDemo bd0 = new BasicsDemo();
        BasicsDemo bd = new BasicsDemo(1);
        

    }
}
import java.util.Scanner;

public class Section2 {
    //Class Scope
    // Can be accessed in any method inside this class
    public static int myInteger = 15;

    public static void main(String[] args) {

        // How to define constant (Final Variable)
        final double PI = 3.145;

    }

    // This game will show to the user two numbers and will loop till the user enter the correct answer
    public static void sumGame() {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        System.out.println(num1 + " + " + num2 + " = ");
        // To take input from user we have to define the scanner object
        Scanner scanner = new Scanner(System.in);
        // After defining the object we can us it like this to take input from user in Integer type
        int result = scanner.nextInt();
        while ((num1 + num2) != result) {
            System.out.println("Try again");
            result = scanner.nextInt();
        }
        System.out.println("Correct Answer");
    }

    public static void testLoop() {
        //   While loop
        int i = 0; // Control Variable
        while (i < 100) { // Condition
            System.out.println(i + " Hello Java");
            i++; //Control Variable Adjustment
        }
        // Do While loop
        //        int i = 0;
        //        do {
        //            System.out.println(i + " Hello Java");
        //            i++;
        //        }while (i < 100);

        // For Loop
        //        for(int i = 0;i<100;i++)
        //            System.out.println(i + " Hello Java");
    }

    //The variable inside this method can only be accessed inside it's curly braces
    public static void scopeTest() {

        int myInteger = 15;
    }

    //Method Overloading With 2 Integer Parameter Example
    public static int getMax(int num1, int num2) {
        System.out.println("inside int parameter method");
        if (num1 > num2)
            return num1;
        return num2;
    }

    //Method Overloading With 2 Double Parameter Example
    // Changing return type will have no effect on the overloading
    public static int getMax(double num1, double num2) {
        System.out.println("inside double parameter method");
        if (num1 > num2)
            return (int) num1; //This is example of Explicit Casting from double (Large Data Type) => int (Smaller Data Type)
        return (int) num2;
    }
}

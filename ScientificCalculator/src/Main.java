import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = "\nSelect an Arithmetic operation:\n__________________________________________________________\n| 1a = add | 2a = subtract | 3a = multiply | 4a = divide |\n\nSelect a  Scientific operation:\n___________________________________________________________________________________________________________________________________________________________________________________________________________________________________\n| 1b = Power | 2b = Square Root | 3b = Sine | 4b = Cosine | 5b = Tangent | 6b = Natural Logarithm | 7b = Logarithm | 8b = Absolute Value  | 9b = Round (nearest long) | 10b = Ceiling | 11b = Floor | 12b = Minimum | 13b = Maximum |\nControl & Utilities:\n________________________________________________________\n| 1c  = Display Menu | 2c = Helper Methods | 3c = Exit |\n\n";
        while (true) {
            System.out.print(menu);
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();
            switch (input.toLowerCase()) {
                case "1a":
                    System.out.println("you chose addition");
                    addition();
                case "2a":
                    System.out.println("you chose subtraction");
                    subtraction();
                case "3a":
                    System.out.println("you chose multiplication");
                    multiplication();
                case "4a":
                    System.out.println("you chose division");
                    division();cm
            }
        }

    }

    public static void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        double result = a + b;
        System.out.print("The Sum of " + a + " and " + b + " is " + result);
    }

    public static void subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        double result = a - b;
        System.out.print("The subtraction of " + a + " and " + b + " is " + result);
    }

    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        double result = a * b;
        System.out.print("The product of " + a + " and " + b + " is " + result);
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        double result = a / b;
        System.out.print("The Quotient of " + a + " and " + b + " is " + result);
    }

    public static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double b = scanner.nextDouble();
        double result = Math.pow(a, b);
        System.out.print("The Power of " + a + " and " + b + " is " + result);
    }

    public static void squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The Square Root of " + a + " is " + Math.sqrt(a));
    }

    public static void sine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The Sine of " + a + " is " + Math.sin(a));
    }

    public static void cosine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The Sine of " + a + " is " + Math.cos(a));
    }

    public static void tangent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The Sine of " + a + " is " + Math.tan(a));
    }

    public static void naturalLogarithm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The natural logarithm of " + a + " is " + Math.log(a));
    }

    public static void logarithm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The logarithm of " + a + " is " + Math.log10(a));
    }

    public static void absoluteValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The absolute value of " + a + " is " + Math.abs(a));
    }

    public static void round() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The rounded value of " + a + " is " + Math.round(a));
    }

    public static void ceiling() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The ceiling of " + a + " is " + Math.ceil(a));
    }

    public static void floor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The floor of " + a + " is " + Math.floor(a));
    }

    public static void minimum() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> numList = new ArrayList<>();
        while (true) {

            System.out.print("Enter your number: (input exit to stop)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting");
                break;
            }
            try {
                float value = Float.parseFloat(input);
                numList.add(value);
                System.out.println(value + " is added to the list");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
        float min = Collections.min(numList);
        System.out.println("the minimum is " + min);
    }
    public static void maximum() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> numList = new ArrayList<>();
        while (true) {

            System.out.print("Enter your number: (input exit to stop)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting");
                break;
            }
            try {
                float value = Float.parseFloat(input);
                numList.add(value);
                System.out.println(value + " is added to the list");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
        float max = Collections.max(numList);
        System.out.println("the maximum is " + max);

    }
}
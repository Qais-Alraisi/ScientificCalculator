
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Scanner(System.in);
        while (true) {
            System.out.print("Select an Arithmetic operation:\n__________________________________________________________\n| 1a = add | 2a = subtract | 3a = multiply | 4a = divide |\n\nSelect a  Scientific operation:\n___________________________________________________________________________________________________________________________________________________________________________________________________________________________________\n| 1b = Power | 2b = Square Root | 3b = Sine | 4b = Cosine | 5b = Tangent | 6b = Natural Logarithm | 7b = Logarithm | 8b = Absolute Value  | 9b = Round (nearest long) | 10b = Ceiling | 11b = Floor | 12b = Minimum | 13b = Maximum |\nControl & Utilities:\n________________________________________________________\n| 1c  = Display Menu | 2c = Helper Methods | 3c = Exit |\n\n");
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

    public static void Multiplication() {
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

    public static void power(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double b = scanner.nextDouble();
        double result = Math.pow(a,b);
        System.out.print("The Power of " + a + " and " + b + " is " + result);
    }

    public static void squareRoot(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The Square Root of " + a + " is " + Math.sqrt(a));
    }

    public static void sine(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The Sine of " + a + " is " + Math.sin(a));
    }

    public static void cosine(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The Sine of " + a + " is " + Math.cos(a));
    }

    public static void tangent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The Sine of " + a + " is " + Math.tan(a));
    }

    public static void naturalLogarithm(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The natural logarithm of " + a + " is " + Math.log(a));
    }

    public static void logarithm(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The logarithm of " + a + " is " + Math.log10(a));
    }
}
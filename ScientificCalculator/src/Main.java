import java.util.InputMismatchException;
import java.util.Scanner;
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
            if (!input.equals("3c")) {
                switch (input.toLowerCase()) {
                    case "1a":
                        System.out.println("you chose addition");
                        addition();
                        break;
                    case "2a":
                        System.out.println("you chose subtraction");
                        subtraction();
                        break;
                    case "3a":
                        System.out.println("you chose multiplication");
                        multiplication();
                        break;
                    case "4a":
                        System.out.println("you chose division");
                        division();
                        break;
                    case "1b":
                        System.out.println("you chose power");
                        power();
                        break;
                    case "2b":
                        System.out.println("you chose square root");
                        squareRoot();
                        break;
                    case "3b":
                        System.out.println("you chose sine");
                        sine();
                        break;
                    case "4b":
                        System.out.println("you chose cosine");
                        cosine();
                        break;
                    case "5b":
                        System.out.println("you chose tangent");
                        tangent();
                        break;
                    case "6b":
                        System.out.println("you chose Natural Logarithm");
                        naturalLogarithm();
                        break;
                    case "7b":
                        System.out.println("you chose Logarithm");
                        logarithm();
                        break;
                    case "8b":
                        System.out.println("you chose Absolute Value");
                        absoluteValue();
                        break;
                    case "9b":
                        System.out.println("you chose Rounding to nearest long");
                        round();
                        break;
                    case "10b":
                        System.out.println("you chose ceiling");
                        ceiling();
                        break;
                    case "11b":
                        System.out.println("you chose floor");
                        floor();
                        break;
                    case "12b":
                        System.out.println("you chose minimum");
                        minimum();
                        break;
                    case "13b":
                        System.out.println("you chose maximum");
                        maximum();
                        break;
                    case "1c":
                        System.out.println(menu);
                    default:
                        System.out.println("Invalid input, please try again");
                }
            } else{
                break;
            }
        }

    }

    public static void addition() {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b=0, result = 0;
        while (true) {
            try {
                System.out.print("Enter first number: ");
                a = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again");
                scanner.next();
            }
        }
        while (true){
            try {
                System.out.print("Enter second number: ");
                b = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again");
                scanner.next();
            }
        }
        result = a + b;
        System.out.print("The Sum of " + a + " and " + b + " is " + result);
    }

    public static void subtraction() {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0, result = 0;
        while (true) {
            try {
                System.out.print("Enter first number: ");
                a = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again");
                scanner.next();
            }
        }
        while (true) {
            try {
                System.out.print("Enter second number: ");
                b = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again");
                scanner.next();
            }
        }
        result = a - b;
        System.out.print("The subtraction of " + a + " and " + b + " is " + result);
    }


    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b=0, result = 0;
        while (true) {
            try {
                System.out.print("Enter first number: ");
                a = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again");
                scanner.next();
            }
        }
        while (true){
            try {
                System.out.print("Enter second number: ");
                b = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again");
                scanner.next();
            }
        }
        result = a * b;
        System.out.print("The product of " + a + " and " + b + " is " + result);
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b=0, result = 0;
        while (true) {
            try {
                System.out.print("Enter first number: ");
                a = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again");
                scanner.next();
            }
        }
        while (true){
            try {
                System.out.print("Enter second number: ");
                b = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again");
                scanner.next();
            }
        }
        result = a / b;
        System.out.print("The division of " + a + " and " + b + " is " + result);
    }

    public static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double b = scanner.nextDouble();
        double result = Math.pow(a, b);
        System.out.print(a + " to the power of "+b+ " is " + result);
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
        System.out.print("The Cosine of " + a + " is " + Math.cos(a));
    }

    public static void tangent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double a = scanner.nextDouble();
        System.out.print("The Tangent of " + a + " is " + Math.tan(a));
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

            System.out.print("Enter your number: (input exit to stop): ");
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

            System.out.print("Enter your number: (input exit to stop): ");
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
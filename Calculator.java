import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== End of Calculation ===");
        System.out.println("=== Simple Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter operator (+, -): ");
        char op = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        if (op == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else {
            System.out.println("Invalid operator");
        }
        scanner.close();
    }
} 
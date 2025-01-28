


import java.util.Scanner;

public class SimpleCalculator{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter Second Number: ");
        double number2 = input.nextDouble();

        System.out.println("Sum : "+ (number1 + number2));
        System.out.println("Dif : "+ (number1 - number2));
        System.out.println("Product : "+ (number1 * number2));
        System.out.println("Division : "+ (number1 / number2));
    }
}
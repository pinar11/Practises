import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;
        System.out.println("Please enter the first number:   ");
        n1 = input.nextInt();
        System.out.println("Please enter the second number:   ");
        n2 = input.nextInt();

        System.out.println("1-Addition\n 2-Subtraction\n 3-Multiplication\n 4-Division");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Addition: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtraction: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplication: " + (n1 * n2));
                break;
            case 4:
                if ( n2 == 0) {
                    System.out.println("Number cannot be divided by zero.");
                } else
                System.out.println("Division: " + (n1 / n2));
                break;
            default:
            System.out.println("Please Try again.");

        }
    }
}

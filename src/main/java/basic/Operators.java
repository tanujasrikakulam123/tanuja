package basic;
import java.util.Scanner;
public class Operators {
    Scanner scan = new Scanner(System.in);
    int result;

    public int execute(int operand1, int operand2) {
        System.out.println("Enter an operator : ");
        String action = scan.next();
        switch (action) {
            case "+":
                result = operand1 + operand2;
                break;

            case "-":
                result = operand1 - operand2;
                break;

            case "*":
                result = operand1 * operand2;
                break;

            case "/":
                result = operand1 / operand2;
                break;
        }
        return result;
    }
}

package basic;

public class Calculator {
    public static void main(String[] args) {
        int result;
        Operators operations = new Operators();
        result = operations.execute(4,2);
        System.out.println(" Result is " +result);
    }

}

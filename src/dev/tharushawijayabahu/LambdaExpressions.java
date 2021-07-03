package dev.tharushawijayabahu;

public class LambdaExpressions {
    public static void main(String[] args) {

        LambdaExpressions le = new LambdaExpressions();

        MathOperation addition = (int a, int b) -> a + b;

        MathOperation subtraction = (int a, int b) -> a - b;

        MathOperation division = (int a, int b) -> a / b;

        System.out.println("Summation of 10 + 5 = " + le.operate(10,5, addition));
        System.out.println("Subtraction of 10 + 5 = " + le.operate(10,5, subtraction));
        System.out.println("Division of 10 + 5 = " + le.operate(10,5, division));
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}

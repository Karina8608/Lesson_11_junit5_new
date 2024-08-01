package Aston;

public class FactorialCalculator {

    //Метод для вычисления факториала числа n
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не существует");

        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    //Метод для обработки верхней границы вычисления факториала
    public static void handleUpperBound() {
        long factorial = Long.MAX_VALUE;

        System.out.println("Факториал верхней границы: " + factorial);
    }

    //Метод для обработки нижней границы вычисления факториала
    public static void handleLowerBound() {
        long factorial = Long.MIN_VALUE;

        System.out.println("Факториал нижней границы: " + factorial);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Факториал " + n + " = " + FactorialCalculator.calculateFactorial(n));

        handleUpperBound();
        handleLowerBound();
    }
}
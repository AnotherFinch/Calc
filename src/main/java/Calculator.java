import java.util.Scanner;

public class Calculator implements MathOperation {
    double firstNum;
    double secondNum;
    Scanner scanner = new Scanner(System.in);

    public Calculator() {

    }

    public Calculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public double getFirstNum() {
        return firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public double sum(double firstNum, double secondNum) {
        double result = firstNum + secondNum;
        return result;
    }

    public double minus(double firstNum, double secondNum) {
        double result = firstNum - secondNum;
        return result;
    }

    public double separate(double firstNum, double secondNum) {
        double result = firstNum / secondNum;
        return result;
    }

    public double multiplication(double firstNum, double secondNum) {
        double result = firstNum * secondNum;
        return result;
    }

    public double findNum() {
        System.out.println("введите число");
        double num = scanner.nextDouble();
        return num;
    }

    public String getOperation() {
        System.out.println("выберите операцию: +, - , /, * ");
        String operation = scanner.next();
        return operation;
    }
}

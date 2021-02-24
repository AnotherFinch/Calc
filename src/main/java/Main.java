

/** Домашнаяя работа Соколова Никиты для курса
 *  JAVA 2.0
 * */

public class Main extends Calculator{

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double firstNum = calculator.findNum();
        double secondNum = calculator.findNum();
        String operation = calculator.getOperation();
        switch (operation) {
            case ("+"):
                System.out.println(calculator.sum(firstNum, secondNum));
                break;
            case ("-"):
                System.out.println(calculator.minus(firstNum, secondNum));
                break;
            case ("/"):
                System.out.println(calculator.separate(firstNum, secondNum));
                break;
            case ("*"):
                System.out.println(calculator.multiplication(firstNum, secondNum));
                break;
        }
    }
}



import java.util.Scanner;

/** Домашнаяя работа Соколова Никиты для курса
 *  JAVA 2.0
 * */

public class MyCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете задание 1 или 2, где 1 - это калькулятор, а 2 - поиск самого длинного слова в массиве ");
        String num = scanner.next();
        if (num.equals("1")){
            System.out.println("Вы выбрали калькулятор");
            calculator();
        }else {
            System.out.println("Вы выбрали поиск самого длинного слова в массиве");
            findTheLongestWord();
        }

    }
    public static void calculator(){
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double firstNum = scanner.nextDouble();


        System.out.println("Введите второе число");
        double secondNum = scanner.nextDouble();

        System.out.println("Введите необходимую математическую операцию, например: +, -, *, /");
        String mathOperation = scanner.next();

        if (mathOperation.equals("-")) {
            sum = firstNum - secondNum;
        }
        if (mathOperation.equals("+")) {
            sum = firstNum + secondNum;
        }
        if (mathOperation.equals("/")) {
            sum = firstNum / secondNum;
        }
        if (mathOperation.equals("*")) {
            sum = firstNum * secondNum;
        }
        System.out.printf("%.4f", sum);
        scanner.close();
    }
    public static void findTheLongestWord(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количетсво слов в массиве ");
        int numberOfWords = scanner.nextInt();
        String maxWord = "";
        String[] words = new String[numberOfWords];

        int maxWordLength = 0;
        for (int i = 0; i < words.length; i ++){
            System.out.println("напишите слово № " + (i + 1));
            String word = scanner.next();
            words[i] = word;
            if (word.length() > maxWordLength){
                maxWordLength = word.length();
                maxWord = word;
            }
        }
        System.out.println("Самое длинное слово в массиве это " + maxWord.toUpperCase() + " и оно состоит из " + maxWordLength + " букв");
    }
}

import java.util.Scanner;

/*
1. Реализовать операции сложения, вычитания, умножения и деления для калькулятора из предыдущего задания
2. Поиск максимального элемента в массиве:
- задаем массив слов
- размерность массива произвольна, задается в консоли
- после чего в консоли вводятся слова в количестве равном заданной длине массива
- в полученном массиве необходимо найти самое длинное слово
- результат вывести на консоль

3. Программа должна выполнять одно из заданий на выбор.
- Если в консоли ввести 1 - запуститься выполнение калькулятора
- Если в консоли ввести 2 - поиск максимального слова в массиве
*/

/**
 * @author Chernikova Veronika
 * @see #Calculator()
 * @see #searchMaxElementArray()
 */

public class TaskJavaAdvanced02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Calculator();
        } else if (choice == 2) {
            searchMaxElementArray();
        } else {
            System.out.println("Error, you entered the wrong number");
        }
        scanner.close();
    }

    public static void Calculator() {
        float numberOne; // Переменная первого числа математической операции
        float numberTwo; // Переменная второго числа математической операции
        String operator; // Переменная математической операции
        float result; // Переменная результата математической операции

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        numberOne = scanner.nextFloat(); //Ввод пользователем первого числа
        System.out.println("Enter the second number:");
        numberTwo = scanner.nextFloat(); //Ввод пользователем второго числа
        operator = scanner.nextLine();
        System.out.println("Enter the operator + - / * :");
        operator = scanner.nextLine(); //Ввод пользователем оператора сложения чисел

        //Выполнение математического действия в зависимости от выбранного пользователем оператора
        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                System.out.printf("Result = %.4f", result);
                break;
            case "-":
                result = numberOne - numberTwo;
                System.out.printf("Result = %.4f", result);
                break;
            case "/":
                result = numberOne / numberTwo;
                System.out.printf("Result = %.4f", result);
                break;
            case "*":
                result = numberOne * numberTwo;
                System.out.printf("Result = %.4f", result);
                break;
            default:
                System.out.println("Error: you entered an invalid operator");
        }
        scanner.close();
    }

    public static void searchMaxElementArray() {
        String[] wordArray;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int lengthArray = scanner.nextInt();
        wordArray = new String[lengthArray];
        wordArray[0] = scanner.nextLine();
        //заполнение массива значениями
        for (int i = 0; i < wordArray.length; i++) {
            System.out.println("Write any word: ");
            wordArray[i] = scanner.nextLine();
        }
        int maxSize = wordArray[0].length();
        String maxWord = wordArray[0];
        // определение самого длинного слова в массиве
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() > maxSize) {
                maxSize = wordArray[i].length();
                maxWord = wordArray[i];
            }
        }
        System.out.println("The longest word in the array: " + maxWord);
        scanner.close();
    }
}

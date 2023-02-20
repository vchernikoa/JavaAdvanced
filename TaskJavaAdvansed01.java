/*
Задание №1 - Калькулятор
- Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
- Использовать комментарии и JavaDoc при описании метода.
- Использовать форматирование при выводе результата в консоль.
Полученный результат округлять до 4-х знаков после запятой.
Запушить проект в свой репозиторий на GitHub и прикрепить ссылку на него в ответе на задание
* Доп задание по желание: добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
 */

import java.util.Scanner;

/**
 * @author Chernikova Veronika
 */
public class Main {

    public static void main(String[] args) {
        //Переменные
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

}

/*
1.
- Массив размерностью 20
- Он заполняется случайными целыми числами от -10 до 10
- Нужно найти максимальный отрицательный и минимальный положительный элементы массива
- Поменять их местами.

2. Формируется сладкий подарок.
- Он может включать в себя разные сладости (Candy, Jellybean, etc.)
- У каждой сладости есть название, вес, цена и свой уникальный параметр
- Необходимо собрать подарок из сладостей
- Найти общий вес подарка, общую стоимость подарка
- Вывести на консоль информацию о всех сладостях в подарке
 */

import present.Candy;
import present.Cookies;
import present.Jellybean;
import present.Present;

/**
 * @author Chernikova Veronika
 */

public class TaskJavaAdvanced03 {
    public static void main(String[] args) {
        // Задание №1
        int[] oneArray = new int[20]; // создание массива
        // заполнение массива случайными числами от -10 до 10
        for (int i = 0; i < oneArray.length; i++) {
            oneArray[i] = ((int) (Math.random() * 20) - 10);
            System.out.print(oneArray[i] + " ");
        }
        System.out.println();
        int maxNegative = -10;
        int indexMaxNegative = 0;
        int minPositive = 10;
        int indexMinPositive = 0;

        for (int i = 0; i < oneArray.length; i++) {
            // поиск максимально отрицательного числа
            if (oneArray[i] < 0 && oneArray[i] > maxNegative) {
                maxNegative = oneArray[i];
                indexMaxNegative = i;
            }

            //поиск минимально положительного числа
            if (oneArray[i] > 0 && oneArray[i] < minPositive) {
                minPositive = oneArray[i];
                indexMinPositive = i;
            }
        }

        // перестановка максимального и минимального числа местами
        oneArray[indexMaxNegative] = minPositive;
        oneArray[indexMinPositive] = maxNegative;
        // вывод на экран измененног массива
        for (int i : oneArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание №2
        Candy candy1 = new Candy("Lollipop", 20.5f, 6.5f, "red");
        Jellybean jellybean1 = new Jellybean("Bear", 15.0f, 10.0f, "apple");
        Cookies cookies1 = new Cookies("Shortbread cookies", 14.5f, 8.5f, true);
        Present[] present1 = {candy1, jellybean1, cookies1};
        // вычисление общей стоимости подарка
        float pricePresent1 = candy1.getPrice() + jellybean1.getPrice() + cookies1.getPrice();
        // вычисление общего веса подарка
        float weightPresent1 = candy1.getWeight() + jellybean1.getWeight() + cookies1.getWeight();
        System.out.println("Price present 1 = " + pricePresent1 + ". Weight present 1 = " + weightPresent1 + '.');
        //вывод на экран всех сладостей в подарке
        for (Present somePresent : present1) {
            System.out.println(somePresent.toString());
        }
    }
}

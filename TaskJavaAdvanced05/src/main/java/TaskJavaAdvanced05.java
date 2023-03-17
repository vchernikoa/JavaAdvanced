import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/*
Есть входной файл с набором слов, написанных через пробел
Необходимо:
- Прочитать слова из файла.
- Отсортировать в алфавитном порядке.
- Посчитать сколько раз каждое слово встречается в файле
- Вывести статистику на консоль
- Найти слово с максимальным количеством повторений
- Вывести на консоль это слово и сколько раз оно встречается в файле
 */

public class TaskJavaAdvanced05 {
    public static void main(String[] args) throws IOException {

        ArrayList<String> words = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("Words.txt"));
        String text = br.readLine();
        //разделение строки на массив слов по пробелу
        String[] word = text.split(" ");
        //запись слов в ArrayList
        for (String w : word) {
            words.add(w);
        }
        //сортировка по алфавиту
        Collections.sort(words);

        Map<String, Integer> countRepeatWord = new LinkedHashMap<>();
        // подсчет сколько раз в списке встречается слово
        for (String w : words) {
            if (!countRepeatWord.containsKey(w)) {
                countRepeatWord.put(w, 1);
            } else {
                countRepeatWord.put(w, countRepeatWord.get(w) + 1);
            }
        }
        System.out.println(countRepeatWord);
        //вывод на экран статистики
        String key = null;
        int value = 0;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : countRepeatWord.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value > maxCount) {
                maxCount = value;
            }
            System.out.println("Слово " + key + ", количество повторений: " + value);
        }

        //вывод на экран самого часто встречающего
        for (Map.Entry<String, Integer> entry : countRepeatWord.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value == maxCount) {
                System.out.println("Самое часто употребляемое слово в файле - " + key + ", количество его повторений = " + maxCount);
            }
        }
    }
}


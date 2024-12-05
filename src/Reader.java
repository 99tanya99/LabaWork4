import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс считывает данные о человеке из CSV-файла и обрабатывает их.
 */
public class Reader {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\foreign_names.csv";
        String currLine = "";
        String separator = ";";
        List<Human> humanList = new ArrayList<>();
        Map<String, Division> divisionMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine(); // Пропускаем заголовок
            while ((currLine = br.readLine()) != null) {
                String[] line = currLine.split(separator);
                try {
                    int id = Integer.parseInt(line[0]);
                    int salary = Integer.parseInt(line[5]);

                    //Обработка потенциальных исключений NumberFormatException
                    if(id < 0 || salary < 0){
                        System.err.println("Ошибка: некорректные значения ID или зарплаты. Строка: " + currLine);
                        continue; //Пропускаем строку с ошибкой
                    }

                    Division division = divisionMap.get(line[4]);
                    if (division == null) {
                        division = new Division(line[4]);
                        divisionMap.put(line[4], division);
                    }
                    Human human = new Human(id, line[1], line[2], division, salary, line[3]);
                    humanList.add(human);
                } catch (NumberFormatException e) {
                    System.err.println("Ошибка преобрaзования числа в строке: " + currLine + ". Ошибка: " + e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e){
                    System.err.println("Ошибка формата строки в файле: " + currLine + ". Ошибка: " + e.getMessage());
                }
                //Добавьте catch блок для обработки ParseException, если в файле есть даты
            }

            for (Human human : humanList) { //Более чистый цикл
                System.out.println(human);
            }
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }
}
package task_5.java_task_5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Book{
       // Метод, который добавляет номера в книгу
    public static void appendNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (Entry<String, ArrayList<Integer>> item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        appendNumber("Sidorov", 6767, bookPhone);
        appendNumber("Sidorov", 86473, bookPhone);
        appendNumber("Petrov", 23456, bookPhone);
        appendNumber("Sidorov", 987, bookPhone);
        appendNumber("Ivanov", 54565433, bookPhone);
        appendNumber("Petrov", 709897, bookPhone);
        printBook(bookPhone);
       }
}
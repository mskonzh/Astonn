import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    // Словарь для хранения фамилий и телефонных номеров
    private Map<String, List<String>> phonebook = new HashMap<>();

    // Метод для добавления записи в справочник
    public void add(String surname, String phoneNumber) {
        phonebook.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Метод для поиска номеров по фамилии
    public List<String> get(String surname) {
        return phonebook.getOrDefault(surname, Collections.emptyList());
    }
}
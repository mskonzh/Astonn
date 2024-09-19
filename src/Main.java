import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape", "orange", "apple"};

        UniqueWords uniqueWords = new UniqueWords();
        uniqueWords.printUniqueWords(words);

        Phonebook phonebook = new Phonebook();

        phonebook.add("Ivanov", "123456");
        phonebook.add("Petrov", "654321");
        phonebook.add("Ivanov", "789123");

        List<String> ivanovNumbers = phonebook.get("Ivanov");
        System.out.println("Номера для Иванов: " + ivanovNumbers);
    }
}



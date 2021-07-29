package hw10;


import java.util.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Task 1
        List<String> words = Arrays.asList("яблоко", "груша", "абрикос", "банан", "мандарин", "лимон",
                "дыня", "яблоко", "апельсин", "арбуз", "банан", "дыня", "лимон", "груша", "мандарин", "апельсин");
        HashMap<String, Integer> uniqueWords = new HashMap<>();
        for (String word: words) {
            int count = uniqueWords.getOrDefault(word, 0);
            uniqueWords.put(word, count + 1);
        }
        System.out.println(uniqueWords);


        // Task 2
        Phonebook phonebook = new Phonebook();
        phonebook.add("Арбузов", "89543587634");
        phonebook.add("Смирнов", "12321312332");
        phonebook.add("Борисов", "47873892784");
        phonebook.add("Громов", "41425458888");
        phonebook.add("Чернов", "78957766677");
        phonebook.add("Борисов", "44448887676");
        phonebook.get("Арбузов");
        phonebook.get("Путин");
        phonebook.get("Борисов");

    }

}

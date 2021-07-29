package hw10;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {

    HashMap<String, HashSet<String>> dictionary = new HashMap<>();

    boolean add(String name, String number) {
        HashSet<String> numbers = dictionary.getOrDefault(name, new HashSet<>());
        boolean ok = numbers.add(number);
        if (ok) {
            dictionary.put(name, numbers);
        }
        return ok;
    }

    void get(String name) {
        System.out.print(name + ": ");
        System.out.println(dictionary.getOrDefault(name, new HashSet<>()));
    }

}


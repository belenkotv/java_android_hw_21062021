package hw11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] array = {
                "One", "Two", "Three", "Four", "Five"
        };
        task1(array);
        ArrayList<String> arrayList = task2(array);
        System.out.println(arrayList);

//        Task3

        Box box1 = new Box();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        Box box2 = new Box();
        box2.add(new Orange());
        box2.add(new Orange());

        Box box3 = new Box();
        box3.add(new Orange());
        box3.add(new Orange());
        box3.add(new Orange());

        box1.print();
        box2.print();
        box3.print();
        box2.move(box3);
        box1.print();
        box2.print();
        box3.print();
    }

    public static void task1(String[] array) {
        for (String item : array) {
            System.out.println(item);
        }
        String tmp = array[3];
        array[3] = array[1];
        array[1] = tmp;
        for (String item : array) {
            System.out.println(item);
        }
    }

    public static ArrayList<String> task2(String[] array) {
        return new ArrayList<String>(Arrays.asList(array));
    }

}

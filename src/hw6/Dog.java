package hw6;

public class Dog extends Animal {

    public static int count = 0;

    Dog(String name) {
        super(name, 500, 10);
        count += 1;
    }

}

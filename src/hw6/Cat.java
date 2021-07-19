package hw6;

public class Cat extends Animal {

    public static int count = 0;

    Cat(String name) {
        super(name, 200, 0);
        count += 1;
    }

}

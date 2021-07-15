package hw6;

public class Animal {

    public static int count = 0;

    String name;
    int maxRun;
    int maxSwim;

    Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        count += 1;
    }

    public void run(int length) {
        if (length > maxRun) {
            System.out.println(name + " не может пробежать " + length + " метров");
        } else {
            System.out.println(name + " пробежал " + length + " метров");
        }
    }

    public void swim(int length) {
        if (length > maxSwim) {
            System.out.println(name + " не может проплыть " + length + " метров");
        } else {
            System.out.println(name + " проплыл " + length + " метров");
        }
    }

}

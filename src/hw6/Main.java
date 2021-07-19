package hw6;

public class Main {

    public static void main(String[] args) {

        Dog mitya = new Dog("Митя");
        Cat vasya = new Cat("Вася");

        mitya.run(100);
        mitya.swim(8);
        vasya.swim(8);
        System.out.println(Animal.count + " животных: " + Cat.count + " котов, " + Dog.count + " собак");

    }
}

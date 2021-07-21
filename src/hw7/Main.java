package hw7;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Vasya", 10);
        Plate plate = new Plate(10);

        Cat[] catsArray = {
                new Cat("lucky", 15),
                new Cat("Mursik", 10),
                new Cat("Tomas", 12),
                new Cat("Oscar", 8),
                new Cat("Mars", 14),
        };

           for (int i = 0; i < catsArray.length; i++) {
               catsArray[i].eat(plate);
           }

        cat.eat(plate);
        System.out.println(plate);
        plate.addFood(25);
    }

}

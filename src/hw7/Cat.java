package hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (satiety) {
            System.out.println("Cat " + name + " is full already");
            return;
        }
        System.out.println("Cat " + name + " eats...");
        satiety = plate.decreaseFood(appetite);
        if (satiety) {
            System.out.println("Cat " + name + " is full");
        } else {
            System.out.println("Cat " + name + " is hungry");
        }
    }

 //   public boolean isSatiety() {
 //       return satiety;
 //   }
}

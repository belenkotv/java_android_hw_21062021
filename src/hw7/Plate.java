package hw7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
         //   System.out.println("Cat eat");
            return true;
        } else {
         //   System.out.println("Cat doesn't eat");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }


    public boolean addFood(int add) {
        if (add < 0) {
            return false;
        }
        food += add;
        System.out.println("plate: " + food);
        return true;
    }


}

package hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <F extends Fruit> {

    private ArrayList <F> container;

    public Box() {
        this.container = new ArrayList<>();
    }

    public Box (F... fruits){
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float sum = 0;
        for (Fruit fruit: container) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean add(F fruit) {
        if (!this.container.isEmpty()) {
            if (fruit.getName() != this.container.get(0).getName()) {
                System.out.println("Cannot put different fruits in one box");
                return false;
            }
        }
        this.container.add(fruit);
        return true;
    }

    public boolean compare(Box toCompare) {
        return Math.abs(getWeight() - toCompare.getWeight()) < 0.01f;
    }

    public boolean move(Box<F> toMove) {
        if (this == toMove) {
            return false;
        }
        for (F fruit: container) {
            if (!toMove.container.add(fruit)) {
                return false;
            }
        }
        container.clear();
        return true;
    }

    public void print() {
        if (this.container.isEmpty()) {
            System.out.println("This box is empty");
        } else {
            System.out.println(
               "This box contains " + this.container.size() + " " +
               this.container.get(0).getName() + " items"
            );
        }
    }

}

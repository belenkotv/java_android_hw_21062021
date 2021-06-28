package hw1;

public class Main {
    public static void main(String[] args) {

        byte a = 100; // задача №2
        short b = 3564;
        int c = 743768;
        long d = 987564266987L;
        float f = 0.87644378f;
        double g = 0.3579876544;
        char h = '\u34A5';
        boolean k = true;
        String m = "hello";

        System.out.println(a); // проверка задачи №2
        System.out.println(b); // проверка задачи №2
        System.out.println(c); // проверка задачи №2
        System.out.println(d); // проверка задачи №2
        System.out.println(f); // проверка задачи №2
        System.out.println(g); // проверка задачи №2
        System.out.println(h); // проверка задачи №2
        System.out.println(k); // проверка задачи №2
        System.out.println(m); // проверка задачи №2
        System.out.println(task3(0.5f, 0.3f, 0.7f, 0.2f)); // проверка задачи №3
        System.out.println(task4(12, 8)); // проверка задачи №4
        System.out.println(task4(16, 8)); // проверка задачи №4
        task5(-3); // проверка задачи №5
        task5(8); // проверка задачи №5
        System.out.println(task6(-7)); // проверка задачи №6
        task7("Анна"); // проверка задачи №7
        task8(1900); // проверка задачи №8


    }

    public static float task3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task4(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void task5(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean task6(int a) {
        return a < 0;
    }

    public static void task7(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void task8(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("leap");
        }else {
            System.out.println("non-leap");
        }
    }

}

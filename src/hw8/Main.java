package hw8;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Василий", 1, 2000);
        Cat cat = new Cat("Васька", 2, 5000);
        Robot robot = new Robot("Василиск", 10, 20000);
        Wall wall = new Wall(2);
        Track track = new Track(2000);
        human.jump(wall);
        human.run(track);
        cat.jump(wall);
        cat.run(track);
        robot.jump(wall);
        robot.run(track);

        Olympic[] olympics = {
                new Human("Григорий", 0, 1000),
                new Cat("Гришка", 3, 7000),
                new Robot("Грифон", 12, 25000),
                new Human("Фёдор", 1, 3000),
                new Cat("Федька", 2, 5500),
                new Robot("Феникс", 8, 18000)
        };

        for (int i = 0; i < olympics.length; i++) {
            olympics[i].jump(wall);
            olympics[i].run(track);
        }

    }
}

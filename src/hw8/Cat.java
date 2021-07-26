package hw8;

public class Cat implements Olympic {
    private String name;
    private int maxJump;
    private int maxRun;

    public Cat(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight() > maxJump) {
            System.out.println("Кот " + name + " не смог прыгнуть");
            return false;
        } else {
            System.out.println("Кот " + name + " прыгнул " + wall.getHeight());
            return true;
        }
    }

    @Override
    public boolean run(Track track) {
        if (track.getLength() > maxRun) {
            System.out.println("Кот " + name + " не смог пробежать");
            return false;
        } else {
            System.out.println("Кот " + name + " пробежал " + track.getLength());
            return true;
        }
    }

}

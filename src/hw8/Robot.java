package hw8;

public class Robot implements Olympic {
    private String name;
    private int maxJump;
    private int maxRun;

    public Robot(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight() > maxJump) {
            System.out.println("Робот " + name + " не смог прыгнуть");
            return false;
        } else {
            System.out.println("Робот " + name + " прыгнул " + wall.getHeight());
            return true;
        }
    }

    @Override
    public boolean run(Track track) {
        if (track.getLength() > maxRun) {
            System.out.println("Робот " + name + " не смог пробежать");
            return false;
        } else {
            System.out.println("Робот " + name + " пробежал " + track.getLength());
            return true;
        }
    }
}

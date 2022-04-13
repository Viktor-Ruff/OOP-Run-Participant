public class Human implements Participant {

    private String name;
    private int runLimit;
    private double jumpLimit;


    public Human(String name, int runLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int getRunLimit() {
        return this.runLimit;
    }

    @Override
    public double getJumpLimit() {
        return this.jumpLimit;
    }

    @Override
    public void jump() {
        System.out.println("Человек " + getName() + " приступил к преодолению барьера:");
    }

    @Override
    public void run() {
        System.out.println("Человек " + getName() + " побежал дистанцию:");
    }
}

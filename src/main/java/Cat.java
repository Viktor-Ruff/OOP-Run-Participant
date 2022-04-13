public class Cat implements Participant {
    private String name;
    private int runLimit;
    private double jumpLimit;

    public Cat(String name, int runLimit, double jumpLimit) {
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
        System.out.println("Кот " + getName() + " приступил к преодолению барьера");
    }

    @Override
    public void run() {
        System.out.println("Кот " + getName() + " побежал дистанцию");
    }
}

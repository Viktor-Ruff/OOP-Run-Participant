
abstract class Obstacles {

    private String name;

    protected abstract boolean moving(Participant participant);

    public Obstacles(String name){
        this.name = name;
    }
}

public class RunningTrack extends Obstacles {

    private int runDistance;

    public RunningTrack(String name, int runDistance) {
        super(name);
        this.runDistance = runDistance;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    @Override
    protected boolean moving(Participant participant) {

        participant.run();

        if (runDistance <= participant.getRunLimit()) {
            System.out.println("Участник пробежал все " + runDistance + " метров. Испытание пройдено!");
            return true;
        } else {
            System.out.println("Участник пробежал только " + participant.getRunLimit() + " метров. Испытание не пройдено. Участник покидает соревнования.");
            return false;
        }
    }
}

public class Wall extends Obstacles{


    private double wallHeight;

    public Wall(String name, double wallHeight) {
        super(name);
        this.wallHeight = wallHeight;
    }

    public double getWallHeight() {
        return wallHeight;
    }

    public void setWallHeight(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    protected boolean moving(Participant participant) {

        participant.jump();

        if (wallHeight <= participant.getJumpLimit()) {
            System.out.println("Барьер высотой " + wallHeight + " метра успешно преодолен.");
            return true;
        } else {
            System.out.println("Участник прыгнул только на " + participant.getJumpLimit() + " метра. Барьер не преодолен. Участник покидает соревнования.");
            return false;
        }

    }
}

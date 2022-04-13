public class TestParticipant {

    public static void main(String[] args) {
        Human human1 = new Human("Владимир", 5000, 1.1);
        Human human2 = new Human("Александр", 3800, 1.4);
        Robot robot1 = new Robot("Unix3000", 20000, 5);
        Cat cat1 = new Cat("Яшка", 2000, 1.5);
        Cat cat2 = new Cat("Яшка", 4000, 1.3);


        RunningTrack runningTrack1 = new RunningTrack("Беговая дорожка Fusion", 4000);
        Wall wall1 = new Wall("Барьер", 1.4);


        Participant[] participant = {human1, robot1, cat1, human2, cat2};
        Obstacles[] obstacles = {runningTrack1, wall1};

        for (int i = 0; i < participant.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstacles.length; j++) {
                result = obstacles[j].moving(participant[i]);
                if (!result) {
                    break;
                }
            }
        }
    }
}

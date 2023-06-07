package Task1;

import Task1.Obstacle.Obstacle;
import Task1.Obstacle.Track;
import Task1.Obstacle.Wall;
import Task1.Participant.Cat;
import Task1.Participant.Human;
import Task1.Participant.Participant;
import Task1.Participant.Robot;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Participant> participants = new ArrayList<>();
        participants.add(new Cat("Боша"));
        participants.add(new Human("Іван"));
        participants.add(new Robot("Лі"));

        ArrayList<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Track(800));
        obstacles.add(new Track(230));
        obstacles.add(new Wall(340));
        obstacles.add(new Wall(620));

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);

            }
        }




    }
}

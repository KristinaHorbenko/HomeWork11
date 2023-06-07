package Task1.Obstacle;
import Task1.Participant.Participant;

public class Track implements Obstacle{
    private int distance;

    public Track (int distance) {
        this.distance = distance;
    }
    @Override
    public void overcome(Participant participant) {
        participant.run(distance);
    }
}



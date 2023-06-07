package Task1.Obstacle;
import Task1.Participant.Participant;


public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Participant participant) {
        participant.jump(height);

       }
    }



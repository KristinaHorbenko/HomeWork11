package Task1.Participant;

public class Human extends Participant {
    public Human(String name) {
        super(name);
        this.type = "Людина";
        this.maxRunDistance = 700;
        this.maxJumpHeight = 300;
    }

}


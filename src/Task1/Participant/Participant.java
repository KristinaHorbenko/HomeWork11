package Task1.Participant;

public class Participant {
    protected String name;
    protected String type;
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected boolean active;

    public Participant(String name) {
        this.name = name;
        this.active = true;
    }

    public void run(int distance) {
        if (distance >= maxRunDistance) {
            System.out.println(this.type + " " + name + " пробіг " + maxRunDistance + " метрів");
        } else {
            System.out.println(this.type + " " + name + " не зміг пробігти " + maxRunDistance + " метрів");

        }

    }

    public void jump(int height) {
        if (height >= maxJumpHeight) {
            System.out.println(this.type + " " + this.name + " перестрибнув стіну висотою " +  maxJumpHeight + " метрів");
        } else {
            System.out.println(this.type + " " + this.name + " не зміг перестрибнути стіну висотою " + maxJumpHeight + " метрів");

        }
    }

}



package behavioral.state;

public class Tv {
    private RemoteControl state;

    public Tv(RemoteControl state) {
        this.state = state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }

    public void togglePower() {
        state.switchState(this);
        System.out.println("--------------------");
    }
}

package behavioral.state;

public class On implements RemoteControl {
    public static On INSTANCE = new On();

    private On() {
    }

    @Override
    public void switchState(Tv tv) {
        System.out.println("TV is now On ...");
        tv.setState(Off.INSTANCE);
        System.out.println("TV is powering Off ...");
    }
}

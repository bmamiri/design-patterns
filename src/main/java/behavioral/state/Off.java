package behavioral.state;

public class Off implements RemoteControl {
    public static Off INSTANCE = new Off();

    private Off() {
    }

    @Override
    public void switchState(Tv tv) {
        System.out.println("TV is now Off ...");
        tv.setState(On.INSTANCE);
        System.out.println("TV is powering On ...");
    }
}

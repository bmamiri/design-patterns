package behavioral.state;

public class StateTest {
    public static void main(String[] args) {
        Tv tv = new Tv(Off.INSTANCE);
        tv.togglePower();
        tv.togglePower();
    }
}

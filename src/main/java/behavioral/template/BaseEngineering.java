package behavioral.template;

public abstract class BaseEngineering {
    public void study() {
        math();
        physics();
        additionalStudy();
    }

    public abstract void additionalStudy();

    private void physics() {
        System.out.println("Physics");
    }

    private void math() {
        System.out.println("Math");
    }
}

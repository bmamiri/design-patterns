package structural.flyweight;

@FunctionalInterface
public interface Order {
    static Order of(String flavourName, int tableNumber) {
        var flavour = CoffeeFlavour.intern(flavourName);
        return () -> System.out.println("Serving " + flavour + " to table " + tableNumber);
    }

    void serve();
}


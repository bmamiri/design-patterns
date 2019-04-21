package structural.flyweight;

import java.util.WeakHashMap;

public class CoffeeFlavour {
    private static final WeakHashMap<String, CoffeeFlavour> CACHE = new WeakHashMap<>();
    private final String name;

    // only intern() can call this constructor
    private CoffeeFlavour(String name) {
        this.name = name;
    }

    public static CoffeeFlavour intern(String name) {
        synchronized (CACHE) {
            return CACHE.computeIfAbsent(name, CoffeeFlavour::new);
        }
    }

    public static int flavoursInCache() {
        synchronized (CACHE) {
            return CACHE.size();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

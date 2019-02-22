package creational.prototype.registry;

public class PrototypeWithRegistryTest {
    public static void main(String[] args) {
        //Test prototype with registry
        ItemRegistry itemRegistry = new ItemRegistry();
        System.out.println("Hash code of Item 1 after clone is: " + itemRegistry.get(11L).hashCode());
    }
}

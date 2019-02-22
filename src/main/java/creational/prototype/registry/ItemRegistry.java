package creational.prototype.registry;

import java.util.HashMap;
import java.util.Map;

//Registry design pattern
public class ItemRegistry {
    private Map<Long, Item> cacheData = new HashMap<>();

    {
        add(new Item(11L, "Item 1"));
        add(new Item(23L, "Item 2"));
        System.out.println("Hash code of Item 1 before clone is: " + cacheData.get(11L).hashCode());
    }

    public Item get(Long id) {
        if (cacheData.containsKey(id)) {
            return cacheData.get(id).clone();
        }
        return null;
    }

    public void add(Item item) {
        cacheData.put(item.getId(), item);
    }
}

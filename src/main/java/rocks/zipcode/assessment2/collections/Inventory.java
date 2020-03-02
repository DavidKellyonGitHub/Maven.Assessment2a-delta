package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    HashMap<String, Integer> itemNumOf = new HashMap<>();
    ArrayList<String> toBeAdded = new ArrayList<>();
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        for (String item : strings){
            this.itemNumOf.put(item,1);
        }

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.itemNumOf = new HashMap<String, Integer>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if (this.getItemQuantity(item) == 0) {
            this.itemNumOf.put(item, 1);
        }else {
            int incremented = this.itemNumOf.get(item) + 1;
            this.itemNumOf.replace(item, incremented);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        int decremented = this.itemNumOf.get(item)-1;
        this.itemNumOf.replace(item,decremented);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if (!this.itemNumOf.containsKey(item)){
            return 0;
        }
        return this.itemNumOf.get(item);
    }
}

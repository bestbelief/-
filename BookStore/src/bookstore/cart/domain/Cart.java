package bookstore.cart.domain;

import java.util.HashMap;
import java.util.Map;

public class Cart {
   private Map<String,CartItem> map;

    public Cart(Map<String, CartItem> map) {
        this.map = map;
    }

    public Cart() {
    }

    @Override
    public String toString() {
        return "Cart{" +
                "map=" + map +
                '}';
    }

    public Map<String, CartItem> getMap() {
        return map;
    }

    public void setMap(Map<String, CartItem> map) {
        this.map = map;
    }
}

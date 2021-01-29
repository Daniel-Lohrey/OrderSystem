package orderservice.products;

import orderservice.orders.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductDb {

    HashMap<String, Product> productHashMap = new HashMap<>();

    // Constructor
    public ProductDb(List<Product> productsList) {
        for (Product product : productsList) {

        }
    }

    // in der listmethode nehmen wir die Hashmap und wenden darauf die methode values (standardmethode) an. die values aus der Hashmap
    // übergeben wir an die neudefinierte Arraylist "products"!
    public ArrayList<Product> list() {
        ArrayList<Product> products = new ArrayList<Product>(this.productHashMap.values());
        return products;
    }

    public HashMap<String, Product> getProductHashMap() {
        return productHashMap;
    }
}

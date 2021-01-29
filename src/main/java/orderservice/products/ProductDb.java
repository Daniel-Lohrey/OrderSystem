package orderservice.products;

import orderservice.orders.Order;

import java.util.HashMap;

public class ProductDb {

    HashMap<Product productId, Order order> = new HashMap<>();
}

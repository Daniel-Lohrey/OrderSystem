package orderservice.orders;

import orderservice.products.Product;

import java.util.ArrayList;
import java.util.Objects;

public class Order {

    private String orderId;
    private ArrayList<Product> productList;

    public Order(String orderId, ArrayList<Product> productList) {
        this.orderId = orderId;
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", productList=" + productList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderId, order.orderId) && Objects.equals(productList, order.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productList);
    }
}


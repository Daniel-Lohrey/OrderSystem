package orderservice;

import orderservice.orders.OrderDb;
import orderservice.products.ProductDb;

import java.util.Objects;

public class OrderService {

    OrderDb serviceOrderDb;
    ProductDb serviceProductDb;

    public OrderService(OrderDb serviceOrderDb, ProductDb serviceProductDb) {
        this.serviceOrderDb = serviceOrderDb;
        this.serviceProductDb = serviceProductDb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderService that = (OrderService) o;
        return Objects.equals(serviceOrderDb, that.serviceOrderDb) && Objects.equals(serviceProductDb, that.serviceProductDb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceOrderDb, serviceProductDb);
    }
}

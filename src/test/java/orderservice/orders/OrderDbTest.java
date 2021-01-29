package orderservice.orders;

import orderservice.products.Product;
import orderservice.products.ProductDb;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OrderDbTest {

    @Test
    @DisplayName("ProductDb List Method Test")
    public void TestOrderDbAdd(){

        // given
        Product prod1 = new Product("1", "Gorchfok");
        Product prod2 = new Product("2", "SantaMaria");
        Product prod3 = new Product("3", "BlackPearl");
        Order ord1 = new Order("1", new ArrayList<Product>(Arrays.asList(prod1)));
        Order ord2 = new Order("2", new ArrayList<Product>(Arrays.asList(prod1,prod2)));
        Order ord3 = new Order("3", new ArrayList<Product>(Arrays.asList(prod3,prod2)));
        ArrayList<Order> expected = new ArrayList<Order>(Arrays.asList(ord1, ord2, ord3));
        //OrderDb expectedDb = new OrderDb(expected);
        ArrayList<Order> testOrderList = new ArrayList<Order>(Arrays.asList(ord1, ord2));
        OrderDb orderDbTest = new OrderDb(testOrderList);

        // when
        orderDbTest.addOrder(ord3);

        // then
        assertEquals(expected, orderDbTest.list());
    }

}
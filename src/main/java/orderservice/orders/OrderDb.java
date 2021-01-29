package orderservice.orders;

import java.util.ArrayList;

public class OrderDb {

    private ArrayList<Order> orderList;

    public OrderDb(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
}

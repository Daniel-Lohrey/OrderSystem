package orderservice.orders;

import java.util.ArrayList;

public class OrderDb {

    private ArrayList<Order> orderList;

    public OrderDb(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<Order> list() {
        return orderList;
    }

    // add order to ArrayList
    public void addOrder(Order newOrder){
        this.orderList.add(newOrder);
    }

}

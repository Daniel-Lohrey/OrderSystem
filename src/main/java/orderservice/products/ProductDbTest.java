package orderservice.products;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

class ProductDbTest {

    @Test
    @DisplayName("ProductDb List Method Test")
    public void TestProductDbList(){

        // given
        Product prod1 = new Product("1", "Gorchfok");
        Product prod2 = new Product("2", "SantaMaria");
        Product prod3 = new Product("3", "BlackPearl");

        ArrayList<Product> prodList = new ArrayList<>(Arrays.asList(prod1, prod2, prod3));
        System.out.println(prodList);


        // Constructor aufrufen

        ProductDb Test = new ProductDb(prodList);


        // ProductDb

        // when


        // then
        assertEquals(0, 0);
    }


}
package orderservice.products;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

class ProductDbTest {
    @Test
    @DisplayName("ProductDb List Method Test")
    public void TestProductDbList(){

        // given
        Product prod1 = new Product("1", "Gorchfok");
        Product prod2 = new Product("2", "SantaMaria");
        Product prod3 = new Product("3", "BlackPearl");
        ArrayList<Product> expected = new ArrayList<Product>(Arrays.asList(prod1, prod2, prod3));
        // Constructor aufrufen
        ProductDb productDbTest = new ProductDb(expected);

        // when
        ArrayList<Product> actual = productDbTest.list();

        // then
        assertEquals(expected, actual);
    }

}
package kata.supermarket.model;

import java.math.BigDecimal;
import java.util.Map.Entry;

import kata.supermarket.pojo.BuyXForPriceOfYDiscount;
import kata.supermarket.pojo.BuyXforYDiscount;
import kata.supermarket.pojo.Product;
import kata.supermarket.pojo.SellingUnit;
import kata.supermarket.pojo.ShoppingBasket;

import org.junit.Before;
import org.junit.Test;

public class BillingModelImplTest {

    private ShoppingBasket basket;
    private BillingModelImpl model;

    @Before
    public void setup() {
        Product beans = new Product("Beans", new BigDecimal(0.50D),
                        SellingUnit.CAN, new BuyXForPriceOfYDiscount(
                                        new BigDecimal(3L), new BigDecimal(2L)));
        Product coke = new Product("Coke", new BigDecimal(0.70D),
                        SellingUnit.CAN, new BuyXforYDiscount(
                                        new BigDecimal(2L), new BigDecimal(1L)));
        Product oranges = new Product("Oranges", new BigDecimal(1.99D),
                        SellingUnit.CAN, null);

        basket = new ShoppingBasket();
        basket.addProduct(beans);
        basket.addProduct(beans);
        basket.addProduct(beans);
        basket.addProduct(coke);
        basket.addProduct(coke);
        basket.addProduct(oranges, new BigDecimal(.2D));

        model = new BillingModelImpl();
    }

    @Test
    public void getSubtotal() {
        System.out.println(model.getSubtotal(basket));
        System.out.println(basket);
        for(Entry<Product, BigDecimal> e : basket.getProductQuantities().entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    @Test
    public void getTotalSavings() {
        System.out.println(model.getTotalSavings(basket));
    }
}

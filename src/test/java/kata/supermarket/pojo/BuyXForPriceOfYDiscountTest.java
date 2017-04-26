package kata.supermarket.pojo;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class BuyXForPriceOfYDiscountTest {

    private BuyXForPriceOfYDiscount discount;

    @Before
    public void setup() {
        discount = new BuyXForPriceOfYDiscount(
                        new BigDecimal(3L), new BigDecimal(2));
    }

    @Test
    public void shouldApplyDiscount_success() {
        assertTrue(discount.shouldApplyDiscount(new BigDecimal(5L)));
    }

    @Test
    public void getTriggerQuantity_success() {
    }

    @Test
    public void totalDiscounted_success() {

    }

    @Test
    public void discountMsg_success() {

    }
}

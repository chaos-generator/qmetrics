package kata.supermarket.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class BuyXForPriceOfYDiscountTest {

    private BuyXForPriceOfYDiscount discount;

    @Before
    public void setup() {
        discount = new BuyXForPriceOfYDiscount(new BigDecimal(3L),
                        new BigDecimal(2));
    }

    @Test
    public void shouldApplyDiscount_successTrue() {
        assertTrue(discount.shouldApplyDiscount(new BigDecimal(5L)));
    }

    @Test
    public void shouldApplyDiscount_successFalse() {
        assertFalse(discount.shouldApplyDiscount(new BigDecimal(2L)));
    }

    @Test
    public void totalDiscounted_success() {
        BigDecimal expected = new BigDecimal(2L);
        assertEquals(expected, discount.totalDiscounted(new BigDecimal(6L),
                        new BigDecimal(1L)));
    }

    @Test
    public void discountMsg_success() {
        assertEquals("3 for 2", discount.discountMsg());
    }
}

package kata.supermarket.pojo;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class BuyXforYDiscount extends Discountable {

    private final BigDecimal discountedPrice;

    /**
     * Buy triggerQuantity for the price of targetQuantity, eg. buy 3 for 2.
     * 
     * @param triggerQuantity
     * @param targetQuantity
     */
    public BuyXforYDiscount(BigDecimal triggerQuantity, BigDecimal discount) {
        super(triggerQuantity);
        this.discountedPrice = discount;
    }

    @Override
    public BigDecimal totalDiscounted(BigDecimal currentQuantity,
                    BigDecimal unitPrice) {
        return currentQuantity
                        .divideToIntegralValue(super.getTriggerQuantity())
                        .multiply(discountedPrice);
    }

    @Override
    public String discountMsg() {
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        return String.format("%s for %s", super.getTriggerQuantity()
                        .longValue(), defaultFormat
                        .format(this.discountedPrice));
    }
}

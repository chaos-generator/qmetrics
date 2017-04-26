package kata.supermarket.pojo;

import java.math.BigDecimal;

/**
 * @author augusto
 *
 */
public class BuyXForPriceOfYDiscount extends Discountable {

    private final BigDecimal targetQuantity;

    /**
     * Buy triggerQuantity for the price of targetQuantity, eg. buy 3 for 2.
     * 
     * @param triggerQuantity
     * @param targetQuantity
     */
    public BuyXForPriceOfYDiscount(BigDecimal triggerQuantity,
                    BigDecimal targetQuantity) {
        super(triggerQuantity);
        this.targetQuantity = targetQuantity;
    }

    @Override
    public BigDecimal totalDiscounted(BigDecimal currentQuantity,
                    BigDecimal unitPrice) {
        return currentQuantity
                        .divideToIntegralValue(super.getTriggerQuantity())
                        .multiply(unitPrice);
    }

    @Override
    public String discountMsg() {
        return String.format("%s for %s ", super.getTriggerQuantity()
                        .longValue(), this.targetQuantity.longValue());
    }
}

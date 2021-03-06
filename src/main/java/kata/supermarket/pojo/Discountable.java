package kata.supermarket.pojo;

import java.math.BigDecimal;

public abstract class Discountable {

    private final BigDecimal triggerQuantity;

    public Discountable(BigDecimal triggerQuantity) {
        this.triggerQuantity = triggerQuantity;
    }

    public boolean shouldApplyDiscount(BigDecimal currentQuantity) {
        if (currentQuantity.compareTo(triggerQuantity) >= 0)
            return true;
        return false;
    }

    public BigDecimal getTriggerQuantity() {
        return triggerQuantity;
    }

    public abstract BigDecimal totalDiscounted(BigDecimal currentQuantity,
                    BigDecimal unitPrice);

    public abstract String discountMsg();

}

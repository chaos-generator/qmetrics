package kata.supermarket.pojo;

import java.math.BigDecimal;

public abstract class Discountable {

    private final BigDecimal triggerQuantity;

    public Discountable(BigDecimal triggerQuantity) {
        this.triggerQuantity = triggerQuantity;
    }

    public boolean shouldApplyDiscount(BigDecimal currentQuantity) {
        if (triggerQuantity.compareTo(currentQuantity) > 0)
            return true;
        return false;
    }

    public BigDecimal getTriggerQuantity() {
        return triggerQuantity;
    }

    abstract BigDecimal totalDiscounted(BigDecimal currentQuantity,
                    BigDecimal unitPrice);

    abstract String discountMsg();

}

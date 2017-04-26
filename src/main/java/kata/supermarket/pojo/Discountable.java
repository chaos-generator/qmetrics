package kata.supermarket.pojo;

import java.math.BigDecimal;

public interface Discountable {

    boolean applyDiscount();

    BigDecimal totalDiscounted();

    String discountMsg();

}

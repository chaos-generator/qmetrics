package kata.supermarket.model;

import java.math.BigDecimal;

import kata.supermarket.pojo.ShoppingBasket;

public interface BillingModel {

    BigDecimal getSubtotal(ShoppingBasket basket);
    
    BigDecimal getTotalSavings(ShoppingBasket basket);
}

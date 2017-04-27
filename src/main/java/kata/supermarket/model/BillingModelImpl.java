package kata.supermarket.model;

import java.math.BigDecimal;

import kata.supermarket.pojo.ShoppingBasket;

public class BillingModelImpl implements BillingModel {

    @Override
    public BigDecimal getSubtotal(ShoppingBasket basket) {
        BigDecimal subtotal = basket.getProductQuantities().entrySet().stream()
                        .map(e -> e.getKey().getPrice().multiply(e.getValue()))
                        .reduce(BigDecimal.ZERO, BigDecimal::add);

        return subtotal;
    }

    @Override
    public BigDecimal getTotalSavings(ShoppingBasket basket) {
        BigDecimal totalSavings = basket
                        .getProductQuantities()
                        .entrySet()
                        .stream()
                        .filter(e -> (e.getKey().getDiscount() != null && e
                                        .getKey().getDiscount()
                                        .shouldApplyDiscount(e.getValue())))
                        .map(e -> e.getKey()
                                        .getDiscount()
                                        .totalDiscounted(e.getValue(),
                                                        e.getKey().getPrice()))
                        .reduce(BigDecimal.ZERO, BigDecimal::add);

        return totalSavings;
    }

}

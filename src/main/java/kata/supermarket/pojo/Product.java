package kata.supermarket.pojo;

import java.math.BigDecimal;

public class Product {

    private final String name;
    private final BigDecimal price;
    // unit the product is sold on eg cans, bottles, kilograms, pack, etc.
    private final SellingUnit unit;
    // a discount to apply to this product when certain triggers are met.
    private final Discountable discount;
    
    public Product(String name, BigDecimal price, SellingUnit unit, Discountable discount){
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.discount = discount;
        
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public SellingUnit getUnit() {
        return unit;
    }

    public Discountable getDiscount() {
        return discount;
    }
}

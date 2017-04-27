package kata.supermarket.pojo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<Product, BigDecimal> productQuantities = new HashMap<Product, BigDecimal>();

    public Map<Product, BigDecimal> getProductQuantities() {
        return productQuantities;
    }

    public ShoppingBasket addProduct(Product product) {
        productQuantities.merge(product, new BigDecimal(1L), BigDecimal::add);
        return this;
    }

    public ShoppingBasket removeProduct(Product product) {
        productQuantities.merge(product, new BigDecimal(1L),
                        BigDecimal::subtract);
        return this;
    }

    public ShoppingBasket addProduct(Product product, BigDecimal weight) {
        productQuantities.merge(product, weight, BigDecimal::add);
        return this;
    }
    
    public ShoppingBasket removeProduct(Product product, BigDecimal weight) {
        productQuantities.merge(product, weight, BigDecimal::subtract);
        return this;
    }
}

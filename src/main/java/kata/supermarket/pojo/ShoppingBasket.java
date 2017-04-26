package kata.supermarket.pojo;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<Product, Integer> productQuantities = new HashMap<Product, Integer>();

    public Map<Product, Integer> getProductQuantities() {
        return productQuantities;
    }

    public ShoppingBasket addProduct(Product product) {
        productQuantities.merge(product, 1, Integer::sum);
        return this;
    }

    public ShoppingBasket removeProduct(Product product) {
        productQuantities.merge(product, 1, (oldQuantity, one) -> oldQuantity
                        - one);
        return this;
    }
}

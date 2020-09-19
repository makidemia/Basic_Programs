package Amazon;

import java.util.List;

public class Cart {

    List<Product> productsInCart;

    public Cart(List<Product> productsInCart) {
        this.productsInCart = productsInCart;
    }

    public List<Product> listofProduct(){
        return productsInCart;
    }
}

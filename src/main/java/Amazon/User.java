package Amazon;

import java.util.List;

public class User {

    String name;
    String lastname;
    String address;

    //Has-a Relation Ship

    Cart cart;

    public User(String name, String lastname, String address, List<Product> productList) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        cart = new Cart(productList);
    }

    public List<Product> getProductInCart(){

        return cart.listofProduct();

    }

}

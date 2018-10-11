package ru.gorshckov.basket;

import java.util.ArrayList;
import java.util.List;

public class BasketImple implements Basket {

    private List<Product> products = new ArrayList<>();






    @Override
    public void addProduct(Product product) {
        products.add(product);

    }

    @Override
    public void removeProduct(Product product) {
       products.remove(product);

    }

    @Override
    public void updateProductQuantity(Product product, int quantity) {
        product.setQuantity(quantity);
    }


    public void addQuantity(Product product, int quantity){
        product.setQuantity(product.getQuantity() + quantity);
    }


    @Override
    public void clear() {
          products.clear();


    }
    @Override
    public List<Product> getProducts() {
        for (Product product:products) {
            System.out.println(product.getProduct()+" "+product.getQuantity());
        }
        return products;
    }


    @Override
    public int getProductQuantity(Product name) {
        System.out.print(name.getProduct() + " Наличие товара в корзине : "+ name.getQuantity());
        return name.getQuantity();
    }

}

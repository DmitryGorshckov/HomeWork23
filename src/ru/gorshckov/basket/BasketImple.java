package ru.gorshckov.basket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketImple implements Basket {

    private Map<String,Integer> products = new HashMap<>();


    public Map<String, Integer> getProducts() {
        return products;
    }

    @Override
    public void addProduct(String product, int quantity) {
        products.put(product,quantity);
    }

    @Override
    public void removeProduct(String product) {
         products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        products.put(product,quantity);
    }

    @Override
    public void clear() {
       products.clear();
    }

    @Override
    public List<String> getProductList() {
       List<String> product = new ArrayList<>();
        for ( Map.Entry<String, Integer> entry: products.entrySet()) {
            product.add(entry.getKey());
        }
        return product;
    }

    @Override
    public int getProductQuantity(String product) {
        return products.get(product);
    }

    @Override
    public String toString() {
        return "BasketImple{" +
                "products=" + products +
                '}';
    }
}

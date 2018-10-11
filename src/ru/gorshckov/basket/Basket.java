package ru.gorshckov.basket;

import java.util.List;

public interface Basket {
    void addProduct(Product product);

    void removeProduct(Product product);

    void updateProductQuantity(Product product, int quantity);

    void clear();

    List<Product> getProducts();

    int getProductQuantity(Product name);
}

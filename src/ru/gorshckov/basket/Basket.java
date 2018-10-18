package ru.gorshckov.basket;

import java.util.List;

public interface Basket {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProductList();

    int getProductQuantity(String product);
}

package ru.gorshckov.basket;

public class Product {
private String name;
private int quantity;

    public Product(String name) {
        this.name = name;
    }

    public Product(String product, int quantity) {
        this.name = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return name;
    }

    public void setProduct(String product) {
        this.name = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Chocolate", 20, "Bitter Chocolate");
        products[1] = new Coke("Coke", 15, "Cold Drink");
        products[2] = new Bread("Bread", 8, "Daily Bread");

        listProducts(products);
    }
}

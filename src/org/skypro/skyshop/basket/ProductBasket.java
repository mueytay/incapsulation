package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductBasket {
    private Product[] products;
    private int count;

    public ProductBasket() {
        this.products = new Product[5];
        this.count = 0;
    }


    public boolean addProduct(Product product) {
        if (count >= 5) {
            System.out.println("Корзина полна");
            return false;
        }

        products[count] = product;
        count++;
        return true;
    }

    public int getTotalCost() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            if (products[i] != null) {
                total += products[i].getPrice();
            }
        }
        return total;
    }

    public void printBasket() {
        if (count == 0) {
            System.out.println("Корзина пуста");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(products[i].getName() + ":" + products[i].getPrice());
        }
        System.out.println("Итого" + getTotalCost());
    }

    public boolean presentsProduct(String name) {
        for (int i = 0; i < count; i++) {
            if (products[i] != null && products[i].getName().equals(name)) {
                return true;

            }
        }
        return false;
    }
    public void clean(){
        for (int i=0;i<products.length;i++){
            products[i]=null;
        }
        count=0;
    }
}


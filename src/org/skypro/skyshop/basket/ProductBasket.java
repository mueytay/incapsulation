package org.skypro.skyshop.basket;

import org.skypro.skyshop.Product;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

//import org.skypro.skysjahop.Product;
public class PruductBasket {
    private Product[] products;
    private int index;

    public PruductBasket() {
        this.products = new Product[5];
        this.index = 0;
    }

    public void addProduct(Product product) {
        if (index < products.length) {
            products[index] = product;
            index++

        } else {
            System.out.println("корзина полна");
        }
        public int getTotalPrice(){
            int total =0;
            for (Product product : products){
                if (product != null){
                    total+=Product.getPrice;
                }
            }
            return total;
        }
        public void printBasket(){
            for (Product product :product){
                if (product != null) {
                    System.out.println(Product);
                }
            }
        }
    }


}

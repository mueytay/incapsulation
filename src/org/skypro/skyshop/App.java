package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;


public class App {
    public static void main(String[] args) {
        ProductBasket productbasket = new ProductBasket();

        Product product1 = new Product("яблоко", 50);
        Product product2 = new Product("персик", 80);
        Product product3 = new Product("помидор", 90);
        Product product4 = new Product("авокадо", 95);
        Product product5 = new Product("лук", 20);
       // Product product6 = new Product("jjj", 77);
        productbasket.addProduct(product1);
        productbasket.addProduct(product2);
        productbasket.addProduct(product3);
        productbasket.addProduct(product4);
        productbasket.addProduct(product5);
       // productbasket.addProduct(product6);

        productbasket.printBasket();
        System.out.println("есть ли молоко"+ productbasket.presentsProduct("молоко"));
        productbasket.clean();
        productbasket.printBasket();
    }

}


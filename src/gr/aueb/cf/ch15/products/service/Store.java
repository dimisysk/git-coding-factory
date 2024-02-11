package gr.aueb.cf.ch15.products.service;

import gr.aueb.cf.ch15.products.model.IProduct;
import gr.aueb.cf.ch15.products.model.Milk;

public class Store {
    // Interface as composition
    private IProduct product;

    // Dependency Injection - Inversion of control
    public Store(IProduct product) {
        this.product = product;
    }

    public void purchase() {
        System.out.println("");
    }

}

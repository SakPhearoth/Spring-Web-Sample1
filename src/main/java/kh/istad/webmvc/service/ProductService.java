package kh.istad.webmvc.service;

//Business logic: getAllProduct,searchProduct,getProduct

import kh.istad.webmvc.domain.Product;

import java.util.List;

public interface ProductService {
    //getAllProducts -> /products
    //getProductById -> products/123
    //getProductByName //use query string -> /products?name = "coca"
    List<Product> getAllProducts();
    Product getProductById(String id);
    Product getProductByName(String name);
}

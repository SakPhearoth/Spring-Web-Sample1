
//package name should be kh.edu.istad.webmvc

package kh.istad.webmvc.service.impl;

import kh.istad.webmvc.domain.Product;
import kh.istad.webmvc.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final List<Product> products = Product.getProducts();

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(String id) {
        return products.stream()
                .filter(p -> p.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Product getProductByName(String name) {
        return products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

}

package kh.istad.webmvc.controller;

import kh.istad.webmvc.domain.Product;
import kh.istad.webmvc.service.ProductService;
import kh.istad.webmvc.service.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api/v1") //for group mapping all endpoint (POST,PUT,GET)
@RequiredArgsConstructor
public class ProductController {

//    private final ProductService productService;
    private final ProductServiceImpl productService;

    @GetMapping("/products")
    public String getAllProducts(Model model, @RequestParam(required = false) String name) {
        if (name != null) {
            Product product = productService.getProductByName(name);
            model.addAttribute("products", List.of(product));
            model.addAttribute("data", "Product with name: " + name);
        } else {
            List<Product> products = productService.getAllProducts();
            model.addAttribute("products", products);
            model.addAttribute("data", "All Products");
        }
        return "home";
    }

    @GetMapping("/products/{id}")
    public String getProductById(@PathVariable String id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("products", List.of(product));
        model.addAttribute("data", "Product with ID: " + id);
        model.addAttribute("Id", id);
        return "home";
    }


}

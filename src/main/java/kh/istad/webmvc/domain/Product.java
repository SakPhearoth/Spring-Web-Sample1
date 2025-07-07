package kh.istad.webmvc.domain;

//domain stores application data

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Product {
    private String id;
    private String name;
    private String category;
    private double price;

    public static List<Product> getProducts() {
        return List.of(
                new Product("A123", "Pepsi", "Drink", 1.5),
                new Product("B321", "Coca", "Drink", 1.6),
                new Product("C999", "Cookie", "Snack", 2.0),
                new Product("D888", "Popcorn", "Snack", 1.8),
                new Product("E777", "Water", "Drink", 1.2),
                new Product("B612", "Croissant", "Pastry", 2.4),
                new Product("F456", "Lollipop", "Candy", 1.2)
        );
    }


}

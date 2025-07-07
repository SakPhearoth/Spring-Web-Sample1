package kh.istad.webmvc;

import kh.istad.webmvc.service.ProductService;
import kh.istad.webmvc.service.impl.ProductServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWebMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebMvcApplication.class, args);
    }

//    @Bean
//    public ProductService productService() {
//        return new ProductServiceImpl();
//    }

}

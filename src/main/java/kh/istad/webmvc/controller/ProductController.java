package kh.istad.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1") //for group mapping all endpoint (POST,PUT,GET)
public class ProductController {
    // getAllProduct

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("data", "Hello World!");
        return "home";
    }
}

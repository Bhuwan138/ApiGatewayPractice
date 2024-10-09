package com.bhuwan.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @GetMapping
    public String getProducts(){
        return "Java Book, Spring Book, Python Book";
    }
}

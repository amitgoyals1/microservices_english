package com.example.Retail.ProductService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String welcomeProduct()
    {
        return "Welcome to Product Page";
    }

    @GetMapping("/callServiceB")
    public String welcome()
    {
        String url = "http://shopping-service/shoppingcart";
        return restTemplate.getForObject(url , String.class);
    }
}

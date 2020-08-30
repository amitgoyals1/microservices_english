package com.example.Retail.ShoppingCartService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shoppingcart")
public class ShoppingCartController {

    @GetMapping
    public String welcomeShopping()
    {
        return "Welcome to Shopping Cart Page";
    }
}

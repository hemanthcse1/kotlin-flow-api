package com.hemanth.kotlinflowapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/product/")
class TestingController {

    var products: ArrayList<Product> = arrayListOf()

    @GetMapping("/welcome")
    fun welcome(): String{
        return "Welcome to kotlin API's"
    }

    @GetMapping("/get-all")
    fun getAllProducts(): List<Product>{
        return products;
    }


    @PostMapping("/add")
    fun add(@RequestBody product: Product){
        products.add(product)
    }
}
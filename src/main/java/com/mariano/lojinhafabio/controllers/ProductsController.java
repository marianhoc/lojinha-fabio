package com.mariano.lojinhafabio.controllers;

import com.mariano.lojinhafabio.model.Product;
import com.mariano.lojinhafabio.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/produtos")
public class ProductsController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public String getProducts(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "product/index";

    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable("id") int id){

        return productService.getProductById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUserById(@PathVariable("id") int id){
        productService.removeProductById(id);
    }
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestBody Product product){
        productService.updateProduct(product);
    }
    @RequestMapping(method = RequestMethod.POST)
    public void insertProduct(@RequestBody Product product){
        productService.insertProduct(product);
    }




}

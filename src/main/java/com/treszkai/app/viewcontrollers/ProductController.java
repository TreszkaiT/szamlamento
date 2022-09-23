package com.treszkai.app.viewcontrollers;

import com.treszkai.app.service.component.Product;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    private Product product;

    public ProductController(Product product) {
        this.product = product;
    }

    public Double getProductVersion(){
        return product.getVersion();
    }
}

package tw.mymis.ajaxdemoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.mymis.ajaxdemoweb.model.Product;
import tw.mymis.ajaxdemoweb.service.ProductService;


@RestController
public class ProductDataController {
    @Autowired
    ProductService productService;
    @GetMapping("/api/product")
    public Product showProduct(Model model) {
        Product p = productService.getProduct();
        return p;
    }
}

package tw.mymis.ajaxdemoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tw.mymis.ajaxdemoweb.model.Product;
import tw.mymis.ajaxdemoweb.service.ProductService;

import java.util.List;


@RestController
public class ProductDataController {
    @Autowired
    ProductService productService;
    @GetMapping("/api/product")
    public List<Product> showProduct() {
        return productService.getProduct();
    }

    @GetMapping("/api/productById/{pcode}")
    public List<Product> queryByID(@PathVariable String pcode) {
        return productService.getProductById(pcode);
    }
    @GetMapping("/api/productByScale")
    public List<Product> queryByScale(@RequestParam String scale) {
        return productService.getProductByScale(scale);
    }
}

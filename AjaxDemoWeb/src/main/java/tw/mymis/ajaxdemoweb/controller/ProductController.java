package tw.mymis.ajaxdemoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tw.mymis.ajaxdemoweb.model.Product;
import tw.mymis.ajaxdemoweb.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping("/showproduct")
    public String showProduct(Model model) {
        Product p = productService.getProduct();
        model.addAttribute("product", p);
        return "product_detail";
    }
}

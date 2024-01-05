package tw.mymis.ajaxdemoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tw.mymis.ajaxdemoweb.model.Product;
import tw.mymis.ajaxdemoweb.service.ProductService;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping("/showproduct")
    public String showProduct(Model model) {
        //Product p = productService.getProduct();
        //model.addAttribute("product", p);
        return "product_list";
    }


    @GetMapping("/product/{pc}")
    public String getProduct(@PathVariable("pc") String pcode, Model model) {
        // 撈取資料 ( 此段 屬於 後端動態 )
        List<Product> products = productService.getProductById(pcode);
        if( products.size()>0 ) {
            // Product p = products.get(0);
            model.addAttribute("product", products.get(0));
            return "product_detail";
        } else {
            // 沒有資料
            return "NoData";
        }

    }
}

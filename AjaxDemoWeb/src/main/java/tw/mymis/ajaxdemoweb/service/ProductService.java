package tw.mymis.ajaxdemoweb.service;

import org.springframework.stereotype.Service;
import tw.mymis.ajaxdemoweb.model.Product;

import java.util.Random;

@Service
public class ProductService {

    public Product getProduct() {
        java.util.Random r = new Random();
        Product product = new Product("Fiat","500", r.nextInt(100) );
        return product;
    }
}

package tw.mymis.ajaxdemoweb.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tw.mymis.ajaxdemoweb.DAO.mapper.ProductMapper;
import tw.mymis.ajaxdemoweb.model.Product;

import java.util.List;

@Repository
public class ProductRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Product> getProductAll() {
        // 實務上 嚴禁此種行為 (資料洩漏,
        return jdbcTemplate.query("select * from products ", new ProductMapper());
    }

    public List<Product> getProductById(String id) {
        // String sql = "select * from products where productCode=?";
        // 取資料 回傳
        // return jdbcTemplate.query(sql, new ProductMapper(), id);
        return jdbcTemplate.query("select * from products where productCode=?", new ProductMapper(), id);
    }

    public List<Product> getProductByLine(String line) {
        // String sql = "select * from products where productLine=?";
        // 取資料 回傳
        // return jdbcTemplate.query(sql, new ProductMapper(), id);
        return jdbcTemplate.query("select * from products where productLine=?", new ProductMapper(), line);
    }
    public List<Product> getProductByScale(String scale) {
        // String sql = "select * from products where productScale=?";
        // 取資料 回傳
        // return jdbcTemplate.query(sql, new ProductMapper(), scale);
        return jdbcTemplate.query("select * from products where productScale=?", new ProductMapper(), scale);
    }
}

package tw.mymis.ajaxdemoweb.DAO.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import tw.mymis.ajaxdemoweb.model.Product;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product p = new Product();
        p.setCode(rs.getString("productCode"));
        p.setName(rs.getString("productName"));
        p.setLine(rs.getString("productLine"));
        p.setScale(rs.getString("productScale"));
        p.setDescription(rs.getString("productDescription"));
        p.setQty(rs.getShort("quantityInStock"));
        p.setMsrp(rs.getDouble("msrp"));
        return p;
    }
}

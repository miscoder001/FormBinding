package tw.mymis.ajaxdemoweb.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private String code;    // 產品編號
    private String name;    // 產品名稱
    private String line;    // 產品類型
    private String scale;   // 比例
    private String description;
    private int qty;        // 庫存
    private double msrp;    // 售價
    // private String[]  image;   // 照片路徑 /images/product/S10-1234/1.png
}

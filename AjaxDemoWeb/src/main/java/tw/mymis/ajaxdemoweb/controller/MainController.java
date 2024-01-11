package tw.mymis.ajaxdemoweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class MainController {

    Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String root() {
        System.out.println("程式正常啟動 輸入首頁網址就可以看到");
        logger.debug("用在程式有邏輯錯誤的時候要找可能錯誤的訊息分類");
        logger.info("一般日常的訊息用這種");
        logger.warn("這是警告 系統發現有異常或不應該發生的狀況用這種方式記錄");
        logger.error("這是發生錯誤 或是 例外exception發生後 通知紀錄的類型");
        return "ecommerce";
    }

    @GetMapping("/load")
    public String loadDemo() {
        return "ajax_load";
    }

    @GetMapping("/part1")
    @ResponseBody
    public String showFragement() {
        java.util.Random random = new Random();
        return "<h2> 這是從伺服器下載的網頁內容 </h2><h3>" + random.nextInt(50000) + "</h3>";
    }
    @GetMapping("/aa")
    public String showFragementaa() {
        java.util.Random random = new Random();
        System.out.println("收到 http://localhost:8080/aa");
        return "aa";
    }
}

package tw.mymis.ajaxdemoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "index";
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
        return "aa";
    }
}

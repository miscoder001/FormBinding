package tw.mymis.formbinding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("msg", "這是 Controller傳給首頁的資料");
        return "index";
    }

    @GetMapping("/jsdemo")
    public String JsTest(Model model) {
        model.addAttribute("msg", "這是 Controller傳給首頁的資料");
        return "jstest";
    }
}

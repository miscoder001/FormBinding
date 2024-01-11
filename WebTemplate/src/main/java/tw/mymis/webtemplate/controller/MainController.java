package tw.mymis.webtemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String rootl(Model model) {
        model.addAttribute("name", "全國模型");
        model.addAttribute("url", "http://www.model.com.tw");
        return  "index";
    }
}

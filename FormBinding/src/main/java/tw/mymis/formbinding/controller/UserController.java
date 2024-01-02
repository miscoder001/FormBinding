package tw.mymis.formbinding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @GetMapping("/regform")
    public String UserReg() {
        // 使用者送 request 進來後 回傳 註冊表單名稱
        return "user-regform";
    }

    @PostMapping("/regform")
    public String UserRegProcess(@RequestParam("username") String username,
                                 @RequestParam String email,
                                 @RequestParam String mobile,
                                 Model model) {
        // 使用者送 request 進來後 回傳 註冊表單名稱
        model.addAttribute("user", username);
        return "reg-result";
    }
}

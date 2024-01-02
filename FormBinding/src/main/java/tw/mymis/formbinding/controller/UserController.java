package tw.mymis.formbinding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tw.mymis.formbinding.model.form.UserRegModel;


@Controller
public class UserController {

    @GetMapping("/regform")
    public String UserReg(Model model) {
        // 使用者送 request 進來後 回傳 註冊表單名稱
        // 準備好一個空的 UserRegModel 物件 提供表單與 UserRegModel 綁定
        UserRegModel userModel = new UserRegModel();
        model.addAttribute("usermodel", userModel);
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

    @PostMapping("/regform2")
    public String UserRegProcess2(@ModelAttribute UserRegModel usermodel, Model model) {
        // 使用者送 request 進來後 回傳 註冊表單名稱
        model.addAttribute("user", usermodel.getUsername());
        model.addAttribute("email", usermodel.getEmail());
        return "reg-result";
    }
}


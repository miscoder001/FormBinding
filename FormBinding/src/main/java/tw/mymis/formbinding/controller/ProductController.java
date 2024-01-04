package tw.mymis.formbinding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class ProductController {

    @GetMapping("/product/{type}/{pid}")
    public String showProductInfo(@PathVariable String type ,@PathVariable String pid, Model model) {
        model.addAttribute("pid", pid);
        model.addAttribute("category", type);
        Path p = Paths.get("c:\\temp\\enzo.jpg");
        try {
            byte[] image = Files.readAllBytes(p);
            String s = new String(image, StandardCharsets.UTF_8);
            String s2 = java.util.Base64.getEncoder().encodeToString(image);
            model.addAttribute("image", s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "product-detail";
    }
}

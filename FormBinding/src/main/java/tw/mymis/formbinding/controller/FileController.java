package tw.mymis.formbinding.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class FileController
{
    //要瀏覽器上傳檔案 用 get 連 /upload
    @GetMapping("/upload")
    public String upload_request() {
        return "upload-form";
    }
    @PostMapping("/upload")
    public String handleUpload(Model model, HttpServletRequest request) {
        // 接收檔案 存檔
        MultipartFile mpfile = ((MultipartHttpServletRequest)request).getFile("imgfile1");

        model.addAttribute("size" , mpfile.getSize());
        model.addAttribute("type", mpfile.getContentType());
        model.addAttribute("filename", mpfile.getOriginalFilename());
        // 存檔
        try {
            mpfile.transferTo( Paths.get("c:/temp/ttt.png"));
            InputStream is = mpfile.getInputStream();
        } catch (IOException e) {
            System.err.println("寫入存檔失敗");
        }

        //
        model.addAttribute("result", "存檔完畢");
        return "upload-result";
    }
    @PostMapping("/upload2")
    public String handleUpload2(Model model, @RequestPart("imgfile1") MultipartFile mpfile) {
        // 接收檔案 存檔
        model.addAttribute("size" , mpfile.getSize());
        model.addAttribute("type", mpfile.getContentType());
        model.addAttribute("filename", mpfile.getOriginalFilename());
        // 存檔
        try {
            mpfile.transferTo( Paths.get("c:/temp/ttt.png"));
            InputStream is = mpfile.getInputStream();
        } catch (IOException e) {
            System.err.println("寫入存檔失敗");
        }

        //
        model.addAttribute("result", "存檔完畢");
        return "upload-result";
    }

    @PostMapping("/upload3")
    public String handleUpload3(Model model, HttpServletRequest request) {
        // 接收檔案 存檔
        List<MultipartFile> mpfiles = ((MultipartHttpServletRequest)request).getFiles("imgfiles");
        model.addAttribute("count", mpfiles.size());
        for(MultipartFile mpfile : mpfiles) {
            try {
                mpfile.transferTo(Paths.get("c:/temp/" + mpfile.getOriginalFilename()));

            } catch (IOException e) {
                System.err.println("寫入存檔失敗");
            }
        }
        //
        model.addAttribute("result", "存檔完畢");
        return "upload-result2";
    }

    @PostMapping("/upload4")
    public String handleUpload4(Model model, @RequestPart("imgfiles") List<MultipartFile> mpfiles) {
        // 接收檔案 存檔

        model.addAttribute("count", mpfiles.size());
        for(MultipartFile mpfile : mpfiles) {
            try {
                mpfile.transferTo(Paths.get("c:/temp/" + mpfile.getOriginalFilename()));

            } catch (IOException e) {
                System.err.println("寫入存檔失敗");
            }
        }
        //
        model.addAttribute("result", "存檔完畢");
        return "upload-result2";
    }

}

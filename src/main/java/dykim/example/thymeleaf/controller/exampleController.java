package dykim.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kimdoyong on 2016. 1. 2..
 */
@Controller
//@RequestMapping("/thymeleafEx/")
public class exampleController {
    @RequestMapping("/stringValue")
    public String stringValue(Model model){
        model.addAttribute("test","test String");
        return "stringValue";
    }
}

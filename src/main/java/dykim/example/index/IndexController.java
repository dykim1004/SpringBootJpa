package dykim.example.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by kimdoyong on 2015. 12. 14..
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name", "Spring Boot Start");
        return "index";
    }
}

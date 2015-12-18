package dykim.example.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kimdoyong on 2015. 12. 18..
 */
@Controller
//@RequestMapping("/blog")
public class BlogController {
    @RequestMapping("/blog")
    public String blog(Model model) {
        return "blog";
    }
}

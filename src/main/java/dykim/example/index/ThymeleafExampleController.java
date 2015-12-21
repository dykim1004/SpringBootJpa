package dykim.example.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThymeleafExampleController {
	
	@RequestMapping("/example/resultString")
	public String resultString(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model){
		model.addAttribute("name", name);
		return "/example/resultString";
	}
	
	@RequestMapping("/example/tag")
	public String tag(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model){
		model.addAttribute("name", name);
		return "/example/tag";
	}
	
	@RequestMapping("/example/customAttribute")
	public String customAttribute(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model){
		model.addAttribute("name", name);
		return "/example/customAttribute";
	}
}

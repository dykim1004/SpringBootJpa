package dykim.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kimdoyong on 2015. 12. 16..
 */
@RestController
@RequestMapping("/jpa")
public class HelloRestController {

    @Autowired
    private HelloDao helloDao;

    @RequestMapping("/add")
    public Hello add(Hello hello){
        Hello helloData = helloDao.save(hello);
        return helloData;
    }

    @RequestMapping("/list")
    public List<Hello> list(Model model){
        List<Hello> helloList = helloDao.findAll();
        return helloList;
    }

}

package dykim.example.index;

import dykim.example.mongo.Customer;
import dykim.example.mongo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by kimdoyong on 2015. 12. 14..
 */
@Controller
public class IndexController {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name", "Spring Boot Start");
        mongoDbTest();
        return "index";
    }

    private void mongoDbTest(){
        repository.save(new Customer("Alice", "Smith"));
        repository.save(new Customer("Bob", "Smith"));

        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();
    }
}

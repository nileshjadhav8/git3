package nus.iss.cicd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping
    public String home() {
        System.out.println("develop branch changed again2s");

        System.out.println("This is controller class");
        return "index";
    }



}
//
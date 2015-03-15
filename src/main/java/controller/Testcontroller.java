package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by arahansa on 2015-03-15.
 */
@Controller
public class Testcontroller {

    @RequestMapping("/")
    @ResponseBody
    String helloworld(){
        return "hello world";
    }

    @RequestMapping(value = "/thymeleaf")
    String thymeleaf(Model model){
        model.addAttribute("message", "hello thymeleaf");
        return "index";
    }

    @RequestMapping("/jsp")
    String jsp(){
        return "index";
    }
}

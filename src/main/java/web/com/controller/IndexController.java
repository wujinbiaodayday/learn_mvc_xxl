package web.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping("/home/index")
    public String index() {
        System.out.println("wjb love you !");
        return "index";
    }


}

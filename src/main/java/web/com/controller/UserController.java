package web.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping(value = "/queryUserInfo", method = RequestMethod.GET)
    public ModelAndView queryUserInfo() {
        ModelAndView view = new ModelAndView("user/query");
        return view;
    }


}

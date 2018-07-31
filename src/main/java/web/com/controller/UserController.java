package web.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import web.com.pojo.UserPojo;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private BaseController baseController;



    @RequestMapping(value = "/queryUserInfo", method = RequestMethod.GET)
    public ModelAndView queryUserInfo() {
        ModelAndView model = new ModelAndView("user/query");
        model.addObject("baseUrl", baseController.getBaseUrl());
        model.addObject("name","Jims");
        return model;
    }

    @RequestMapping(value = "/queryUserData", method = RequestMethod.GET)
    @ResponseBody
    public List<UserPojo> queryUserData() {
        List<UserPojo> data = new ArrayList<UserPojo>(1);
        UserPojo user = new UserPojo();
        user.setId(1L);
        user.setName("wjb");
        user.setSex("男");
        user.setAge(27);
        data.add(user);
        return data;
    }


}

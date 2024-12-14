package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping(value = "/user", produces="application/json;charset=UTF-8")
    @ResponseBody
    public String test(){
        return "你好";
    }
}

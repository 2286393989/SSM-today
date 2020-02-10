package net.wanho.contorller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class LoginContorller {


    @RequestMapping("hello")
   public  String hello(Map map){
        map.put("msg","hello");
        return "hello";
    }
}

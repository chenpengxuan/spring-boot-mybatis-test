package com.szss.spring.boot.test.webui;

import com.szss.spring.boot.test.entity.User;
import com.szss.spring.boot.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zcg on 15/12/24.
 */

@Controller
public class HelloWorld {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public String home(Model model){
        User user=userMapper.selectUserById(1);
        model.addAttribute("user",user);
        return "/helloworld";
    }
}

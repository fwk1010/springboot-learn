package com.writingless.controller;

import com.writingless.bean.User;
import com.writingless.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * create by fangwk on 2017/11/26 22:35
 */
@Controller
public class UserController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @RequestMapping(value = "/gerUser/{uid}",method = RequestMethod.GET)
    public User getUserInfo(@PathVariable("uid") Integer id){
        logger.info("user id:{}",id);
        return  userService.getUserById(27);
    }
}

package com.pactera.test.controller;

import com.pactera.test.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/getUser")
    public User getUser(){
        User user = new User();

        user.setName("zhangsan");
        user.setAddress("shanghai");

        return user;
    }

    @PostMapping("testLog")
    public void testLog(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//        logger.info("记录了log.........."+df.format(new Date()));
        logger.error("error::::记录了log.........."+df.format(new Date()));
        User user = null;
        user.getAddress();
    }

}

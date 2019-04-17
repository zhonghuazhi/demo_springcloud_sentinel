package net.cc.demo_springcloud_sentinel.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname HelloController
 * @author: zhonghua.zhi
 * @date: 2019-04-16 20:32
 * @version: 1.0
 * @description: TODO
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String hello() {
        System.out.println("Hello");
        return "Hello";
    }
}
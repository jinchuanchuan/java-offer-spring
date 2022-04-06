package com.jcc.framework.web;

import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: RestController.java
 * @Author: jinchuanchuan@longfor.com
 * @Date: 2022/3/30 2:54 下午:00
 * @Description: TODO
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name ) {
        return "hello world!" + name;
    }
}

package com.dream.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jzx
 * @email: jiazhaoxin@ule.com
 * @Date: 2019-05-05 16:38
 */
@Controller

public class PageController {
    Logger logger = LoggerFactory.getLogger(PageController.class);
    @RequestMapping("/")
    public String turnToPage(){
        logger.info("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        return "index";
    }
}

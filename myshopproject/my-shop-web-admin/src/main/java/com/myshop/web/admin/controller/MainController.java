package com.myshop.web.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController
{
    private static String MAIN_PAGE = "main";

    public static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String goToMain()
    {
        logger.debug( "MainController is go to main page!");
        System.out.println("MainController is go to main page!");

        return MAIN_PAGE;
    }
}

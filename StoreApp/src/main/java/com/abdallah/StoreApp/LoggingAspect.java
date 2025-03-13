package com.abdallah.StoreApp;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect

public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
    private static int countHelloCalled =0;
    //return type , class name. method name(args)
    @Before("execution(* com.abdallah.StoreApp.controller.HomeController.hello(..)) ")
    public void logMethodCall(){
        LOGGER.info("The method hello  in HomeController called :" + ++countHelloCalled + "Times");

    }
    @Before("execution(* com.abdallah.StoreApp.controller.productController.*(..)) ")
    public void productLogMethodCall(){
        LOGGER.info("Method in product Controller called");

    }
}

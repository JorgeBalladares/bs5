package com.example.bs5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorLog {

    Logger log = LoggerFactory.getLogger(ErrorLog.class);

    @RequestMapping("/")
    public String saludo(){
        log.error("error tipo error");
        log.warn("error tipo warning");
        return "Hola";
    }
}

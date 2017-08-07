package com.gustav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ${DESCRIPTION}
 *
 * @author liuhc
 * @data 2017年08月07日
 **/
@Controller
public class WebsocketController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}

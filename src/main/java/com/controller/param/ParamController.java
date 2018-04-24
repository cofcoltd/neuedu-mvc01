package com.controller.param;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamController {

    @RequestMapping(value="/param", params="foo")
    public  String byParameter() {
        return "有 foo";
    }

//    @RequestMapping(value="/param",  params="!foo")
//    public String byParameterNegation() {
//        return "没 foo";
//    }

}

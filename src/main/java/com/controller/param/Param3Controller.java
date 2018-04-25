package com.controller.param;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("param3")
public class Param3Controller {

    //param3/array?p1=a,b,c&p2=o,p,q
    @RequestMapping(value="array", method=RequestMethod.GET)
    public  String withParamArray(@RequestParam(value = "p1") List<String> param1 , @RequestParam(value = "p2") String[] param2 ) {

        return "param1 : "+param1 +" param2 : "+Arrays.toString(param2);
    }
}

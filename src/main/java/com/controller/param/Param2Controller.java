package com.controller.param;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Param2Controller {

    @RequestMapping("param")
    public String getParam(@RequestParam("id") Integer id) { //request.getParameter("")
        return "id : " + id;
    }

    @RequestMapping("param/{id}")
    public String getParam2(@PathVariable("id") Integer id) {
        return "id : " + id;
    }

}

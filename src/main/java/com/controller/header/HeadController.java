package com.controller.header;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HeadController {

    //  postman 通过 header 添加自定义头部内容 . 才可以被该 mapping 截获 .
    @RequestMapping(value="/header" , headers="a=b")
    public  String byHeader() {
        return "头文件访问";
    }
}

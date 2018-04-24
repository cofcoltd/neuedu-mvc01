package com.controller.rest;

import com.domain.Emp;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("emp")
public class EmpController {

    @RequestMapping(value = "/{eid}" , method = RequestMethod.GET )
    public String getEmpById(@PathVariable("eid") Integer eid) {
        return "获取 eid : " + eid + " 的员工信息 " ;
    }

    @RequestMapping(method = RequestMethod.POST  )
    public List<Emp> saveEmp(Emp emp) {
        List<Emp> emps = new ArrayList<Emp>();
        emps.add(emp);
        return emps;
    }

    @RequestMapping(method = RequestMethod.PUT  )
    public String modifyEmp() {
        return "修改员工信息" ;
    }

    @RequestMapping(value = "/{eid}" ,method = RequestMethod.DELETE  )
    public String removeEmpById(@PathVariable("eid") Integer eid) {
        return "删除 eid : " + eid + " 的员工信息 " ;
    }

    @RequestMapping(method = RequestMethod.GET  )
    public String getEmps() {
        return "获取所有员工信息" ;
    }


}

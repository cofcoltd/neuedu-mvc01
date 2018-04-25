package com.controller.rest;

import com.domain.Emp;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("emp")
public class EmpController {

    @GetMapping("/{eid}" )
    public String getEmpById(@PathVariable("eid") Integer eid) {
        return "获取 eid : " + eid + " 的员工信息 " ;
    }

    @PostMapping
    public List<Emp> saveEmp(Emp emp) {
        List<Emp> emps = new ArrayList<Emp>();
        emps.add(emp);
        return emps;
    }

    @PutMapping
    public String modifyEmp() {
        return "修改员工信息" ;
    }

    @DeleteMapping("/{eid}")
    public String removeEmpById(@PathVariable("eid") Integer eid) {
        return "删除 eid : " + eid + " 的员工信息 " ;
    }

    @GetMapping
    public String getEmps() {
        return "获取所有员工信息" ;
    }


}

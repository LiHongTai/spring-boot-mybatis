package com.roger.mybatis.controller;

import com.roger.mybatis.entity.Emp;
import com.roger.mybatis.mapper.EmpMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/emp")
public class EmpController {

    @Resource
    private EmpMapper empMapper = null;

    @RequestMapping(value = "/{id}")
    public Emp findById(@PathVariable("id") Integer id) {
        Emp emp = empMapper.findById(id);
        return emp;
    }

}

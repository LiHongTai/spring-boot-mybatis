package com.roger.mybatis.mapper;

import com.roger.mybatis.entity.Emp;

public interface EmpMapper {

    public Emp findById(Integer empno);
}

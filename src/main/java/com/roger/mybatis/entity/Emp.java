package com.roger.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp implements Serializable {

    private Integer empno;
    private String ename;
    private String job;
    private String mgr;
    private LocalDate hiredate;
    private Double sal;
    private Double comm;
    private Integer deptno;

}

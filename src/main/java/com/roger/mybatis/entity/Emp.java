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

    private Integer empNo;
    private String eName;
    private String job;
    private String manager;
    private LocalDate hiredate;
    private Double salary;
    private Double comm;
    private Integer deptNo;
    private Dept dept;

}

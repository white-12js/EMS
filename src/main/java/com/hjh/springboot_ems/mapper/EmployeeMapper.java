package com.hjh.springboot_ems.mapper;

import com.hjh.springboot_ems.entity.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> getEmpList();
    Integer deleteEmpById(int id);
    Integer updataEmpById(int id);
}

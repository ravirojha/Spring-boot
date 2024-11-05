package com.myproject.apiproject.dao;

import com.myproject.apiproject.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> listAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}

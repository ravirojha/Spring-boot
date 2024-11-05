package com.myproject.apiproject.rest;

import com.myproject.apiproject.entity.Employee;
import com.myproject.apiproject.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> listAllEmployees() {
        return employeeService.listAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId) {
        Employee theEmployee = employeeService.findById(employeeId);

        if(theEmployee == null) {
            throw new RuntimeException("Employee not found " + employeeId);
        }

        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        theEmployee.setId(0);

        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployeeById(@PathVariable int employeeId) {
        Employee theEmployee = employeeService.findById(employeeId);

        if(theEmployee == null) {
            throw new RuntimeException("Employee not found " + employeeId);
        }
        employeeService.deleteById(employeeId);

        return "Deleted employee " + employeeId;
    }
}

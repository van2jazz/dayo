package com.dayo.dayo.Controller;

import com.dayo.dayo.Entity.Employee;
import com.dayo.dayo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class Controller {



    @Autowired
    public EmployeeService employeeService;

    @RequestMapping(value = "/getAllEmployee", method = RequestMethod.GET)
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.DELETE)
    public void deleteEmployee(Long employeeId){
        employeeService.deleteEmployee(employeeId);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Employee updateEmployee(Employee employee){
        return employeeService.updateEmployee(employee);
    }
}



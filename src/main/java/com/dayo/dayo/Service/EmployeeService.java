package com.dayo.dayo.Service;

import com.dayo.dayo.Dao.EmployeeDao;
import com.dayo.dayo.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeDao employeeDao;




    public List<Employee> getAllEmployee() {
        return employeeDao.findAll();
    }

    public Employee createEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    public void deleteEmployee(Long employeeId){
        employeeDao.deleteById(employeeId);
    }

    public Employee updateEmployee(Employee employee){
        return employeeDao.save(employee);
    }



}

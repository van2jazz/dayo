package com.dayo.dayo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Employee_Table")
public class Employee {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column (name = "password")
    private int password;

    @Column(name = "department")
    private String department;

    public Employee() {
    }


    public Employee(String name, String username, int password, String department) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

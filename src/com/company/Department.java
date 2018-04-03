package com.company;

import java.util.Arrays;

public class Department implements Working {
  private String name;
  private Employee[] employees;

  public Department(String name) {
    this.name = name;
  }

  public Department(String name, Employee[] employees) {
    this.name = name;
    this.employees = employees;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee[] getEmployees() {
    return employees;
  }

  public void setEmployees(Employee[] employees) {
    this.employees = employees;
  }

  public void removeEmployee(Employee emloyees) {

  }

  public void work(){
    System.out.println("Do something");
  }

  @Override
  public String toString() {
    return "Department{" +
            "name='" + name + '\'' +
            ", employees=" + Arrays.toString(employees) +
            '}';
  }
}


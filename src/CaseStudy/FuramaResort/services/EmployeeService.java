package CaseStudy.FuramaResort.services;

import CaseStudy.FuramaResort.models.Employee;

import java.util.List;

public interface EmployeeService extends Service{
    List<Employee> getAllEmployees();

    void addEmployee(Employee employee);

    void editEmployee(Employee employee, Employee updateE);
}

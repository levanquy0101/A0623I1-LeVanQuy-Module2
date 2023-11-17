package CaseStudy.FuramaResort.controllers;

import CaseStudy.FuramaResort.models.Employee;
import CaseStudy.FuramaResort.services.EmployeeServiceImpl;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        List<Employee> employees = employeeService.getAllEmployees();

// Hiển thị danh sách nhân viên
        for (Employee employee : employees) {
            System.out.println(employee);
        }

// Thêm một nhân viên mới
        Employee newEmployee = new Employee("A", 12, "01/01/1990", 12334, 12345, "0123456789", 010101, "Bachelor", "Staff", 5000000);
        employeeService.addEmployee(newEmployee);

// Chỉnh sửa thông tin nhân viên
//        Employee editEmployee = new Employee("NV001", "Nguyen Van B", "01/01/1990", "Male", "123456789", "0123456789", "example@example.com", "Bachelor", "Manager", 8000000);
//        employeeService.editEmployee(editEmployee);
//    }
}}

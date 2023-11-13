package CaseStudy.FuramaResort.services;

import CaseStudy.FuramaResort.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList;

    static {
        // Khởi tạo danh sách nhân viên
        employeeList = new ArrayList<>();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void editEmployee(Employee employee) {

    }

}

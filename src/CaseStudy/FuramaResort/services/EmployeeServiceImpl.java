package CaseStudy.FuramaResort.services;

import CaseStudy.FuramaResort.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList;


    static {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("JoNa", "01/01/2000", "FeMale", 103293279, 123456789, "jona.doe@example.com", 6384368, "Bachelor", "Manager", 5000));
        employeeList.add(new Employee("Jame", "11/01/2001", "Male", 1032932629, 123256789, "jame.doe@example.com", 6384362, "Bachelor", "Manager", 5000));
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
    public void editEmployee(Employee employee, Employee updateE) {

    }


}

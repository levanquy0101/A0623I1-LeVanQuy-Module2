package CaseStudy.FuramaResort.models;

public class Employee extends Person{
    private int IdEmployee;
    private String level;
    private String position;
    private int salary;


    public Employee(String name, int date, String sex, int cmnd, int phone, String email, int idEmployee, String level, String position, int salary) {
        super(name, date, sex, cmnd, phone, email);
        IdEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return IdEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        IdEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}

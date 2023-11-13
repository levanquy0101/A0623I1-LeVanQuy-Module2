package CaseStudy.FuramaResort.models;

public abstract class Person {
    private String name;
    private  int date;
    private String sex;
    private int cmnd;
    private int phone;
    private String email;

    public Person(String name, int date, String sex, int cmnd, int phone, String email) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

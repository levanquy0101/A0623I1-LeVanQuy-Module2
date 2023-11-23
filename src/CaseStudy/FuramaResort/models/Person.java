package CaseStudy.FuramaResort.models;

public abstract class Person {
    private String name;
    private  String date;
    private String sex;
    private int cmnd;
    private int phone;
    private String email;

    public Person(String name, String date, String sex, int cmnd, int phone, String email) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", sex='" + sex + '\'' +
                ", cmnd=" + cmnd +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}

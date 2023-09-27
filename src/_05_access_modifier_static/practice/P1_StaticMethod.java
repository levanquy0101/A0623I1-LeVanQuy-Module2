package _05_access_modifier_static.practice;

public class P1_StaticMethod {
    public static void main(String[] args) {
        P1_Student.change(); //calling change method

        //creating objects
        P1_Student s1 = new P1_Student(111, "Hoang");
        P1_Student s2 = new P1_Student(222, "Khanh");
        P1_Student s3 = new P1_Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

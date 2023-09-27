package _05_access_modifier_static.exercise;

public class E2_Test {
    public static void main(String[] args) {
        E2_Student student1 = new E2_Student();
        student1.setName("Le Van Quy");
        student1.setClasses("A0623I1");
        System.out.println("Họ và tên: "+student1.getName());
        System.out.println("Lớp: "+student1.getClasses());
    }
}

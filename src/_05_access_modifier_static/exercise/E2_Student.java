package _05_access_modifier_static.exercise;

public class E2_Student {
    private String name = "John";
    private String classes = "C02";
    public E2_Student(){

    }
    public String getName(){
        return name;
    }
    public String getClasses(){
        return classes;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes =classes;
    }
}

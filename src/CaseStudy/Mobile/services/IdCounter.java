package CaseStudy.Mobile.services;

public class IdCounter {
    private static int id = 0;
    public static int getNextId(){
        return ++id;
    }
}

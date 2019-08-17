package Overloading;

public class Overload {
    public void dios(String name){
        System.out.println(name);
    }
    public void dios(String name, int age) {
        System.out.println(name + age);
    }
    public void dios (String name, int age, double height) {
        System.out.println(name + age + height);
    }
}

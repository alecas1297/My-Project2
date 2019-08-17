package Exam;

public class MethodsAndVariables {



/**
 * create a void method, and create 2 methods that return a boolean type and an integer type.
 * when you are done with all assignments in exam package, push your changes to the remote server and merge
 * your branch to the master branch.
 */

    boolean ale = true;

    boolean luis = false;

    int ageAle = 21;
    int ageLuis = 25;

    public void bmw() {
        System.out.println("m3");
    }

    public boolean kingAle() {
        if (ale==true)
            System.out.println("Alejandro es el King");
        return ale;

    }

    public int getAgeLuis() {
        return ageLuis;
    }

    public static void main(String[] args) {
        MethodsAndVariables aleElKing = new MethodsAndVariables();
        aleElKing.kingAle();
    }

}

package Exam;

public class LoopsConditionals {
    /**
     * create a method that prints out a name of the name is not larger than 5 chars
     */
    public void ale(String name) {
        if(name.length()<5)
        System.out.println(name);
    }

    /**
     * print out your name exactly 50 times.
     */



    public static void main(String[] args) {

       // for(int i =1;i<50;i++)
        //System.out.println("Alejandro");
        LoopsConditionals ifStatement = new LoopsConditionals();
        ifStatement.ale("Alejandro");

    }

    }



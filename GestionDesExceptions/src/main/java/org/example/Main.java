package org.example;

public class Main {
    public static void main(String[] args){

        try {
            EntierNaturel entierNaturel = new EntierNaturel(0);
            System.out.println(entierNaturel.getVal());
            EntierNaturel entierNaturel3 = new EntierNaturel(1);

            entierNaturel3.decrementer();
            System.out.println(entierNaturel3.getVal());

            EntierNaturel entierNaturel2 = new EntierNaturel(2);
            entierNaturel2.setVal(3);
            System.out.println(entierNaturel2.getVal());

        } catch(NombreNegatifException e){
            e.printStackTrace();

        }



    }
}
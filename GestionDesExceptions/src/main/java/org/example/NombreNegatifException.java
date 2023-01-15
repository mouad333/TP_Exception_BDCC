package org.example;

public class NombreNegatifException extends Exception {
    private int errorVal;
    public NombreNegatifException(String msg,int errorVal){
        super(msg);
        this.errorVal = errorVal;
    }

}

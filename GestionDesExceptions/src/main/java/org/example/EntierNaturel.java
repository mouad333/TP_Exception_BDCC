package org.example;

public class EntierNaturel {
    private int val;
    public EntierNaturel(int val) throws NombreNegatifException {
        if(val <= 0) throw new NombreNegatifException("nombre doit etre négatif ",this.val);
        this.val=val;
    }

    public void setVal(int val) throws NombreNegatifException {
        boolean isTrue = ((this.val- val)) > 0;
        if(!isTrue) throw new NombreNegatifException("can not be under 0 ",this.val);
        this.val = val;
    }

    public int getVal() {
        return val;
    }
    public void decrementer() throws NombreNegatifException {
        if(val - 1 <= 0 ) throw new NombreNegatifException("on ne peut pas avoir un nombre egale a 0 ",this.val);
        this. val = val -1;
    }
}

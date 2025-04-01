package org.example;

public class NoGenericMethods {
    private int argument1;
    private int argument2;
    private int argument3;

    public NoGenericMethods(int argument1 , int argument2 , int argument3){
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.argument3 = argument3;
    }

    public int getArgument1(){
        return this.argument1;
    }
    public int getArgument2(){
        return this.argument2;
    }
    public int getArgument3(){
        return this.argument3;
    }

    public void setArgument1(int argument1) {
        this.argument1 = argument1;
    }
    public void setArgument2(int argument2) {
        this.argument2 = argument2;
    }
    public void setArgument3(int argument3) {
        this.argument3 = argument3;
    }
}

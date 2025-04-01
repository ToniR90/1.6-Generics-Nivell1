package org.example;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods object1 = new NoGenericMethods(1 , 2 , 3);
        NoGenericMethods object2 = new NoGenericMethods(2 , 3 , 1);
        NoGenericMethods object3 = new NoGenericMethods(3 , 1 , 2);

        System.out.println("Object 1: " + object1.getArgument1() + ", " + object1.getArgument2() + ", " + object1.getArgument3());
        System.out.println("Object 2: " + object2.getArgument1() + ", " + object2.getArgument2() + ", " + object2.getArgument3());
        System.out.println("Object 3: " + object3.getArgument1() + ", " + object3.getArgument2() + ", " + object3.getArgument3());
    }
}
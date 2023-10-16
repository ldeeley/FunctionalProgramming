package org.example;

public class FirstLambda {

    public static void main(String[] args) {

//        the implementation of the single method (myMethod) in MyFuncInterface
        MyFuncInterface myFuncInterface = ()->System.out.println("print a message");

        myFuncInterface.myMethod();

    }

}

package org.example;

public class MyFuncInterfaceReturn {

    public static void main(String[] args) {
        MyFuncInterfaceStringLen myFuncInterfaceStringLen = String::length;
        System.out.println(myFuncInterfaceStringLen.stringLength("Lester"));
    }

}

package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyFunctionPractice {

    public static void main(String[] args) {


        List<String> myList = List.of("Kit","Kat","Shake");
        Function<String,Integer> stringLen = String::length;

        List<Integer> newList = mapMyList(myList, stringLen);

    }

    private static <T,R> List<R> mapMyList(List<T> myList, Function<T, R> stringLen) {

        return myList.stream().map(stringLen).collect(Collectors.toList());
    }

}

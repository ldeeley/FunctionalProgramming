package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredefinedFunctionalInterfaces {

    public static void main(String[] args) {

//        T=String, R=String
//        FunctionalGenerics<String,String> fun = x-> x.substring(1,5);
//        System.out.println(fun.execute("Newcastle United"));
//
//        FunctionalGenerics<String,Integer> fun1 = x-> x.substring(1,5).length();
//        System.out.println(fun1.execute("Newcastle United"));
//
//        BiFunctionalGenerics<String,String,Integer> fun3 = (x,y)->x.length()+y.length();
//        System.out.println(fun3.execute("Lester","Deeley"));

        List<String> stringList = new ArrayList<>();
        stringList.add("Basics");
        stringList.add("");
        stringList.add("Strong");
        stringList.add("Strong");
        stringList.add("");

        Predicate<String> predicate = x->!x.isEmpty();

        List<String> stringList1 = filterList(stringList, predicate);
        stringList1.forEach(System.out::println);

    }

    private static List<String> filterList(List<String> stringList, Predicate<String> predicate) {
        return stringList
                .stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}

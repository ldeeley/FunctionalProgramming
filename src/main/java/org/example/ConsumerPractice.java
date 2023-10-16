package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsumerPractice {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(34,67,8,23,67,89,90);

        Consumer<Integer> integerConsumer = System.out::println;

        integerList.forEach(integerConsumer::accept);

        BiConsumer<Integer,Integer> biConsumer = (x,y)-> System.out.println(x+y);

        biConsumer.accept(6,7);

    }

}

package org.example;

import java.util.Arrays;
import java.util.List;

public class BasicArrays {


    public static void main(String[] args) {

// not dynamic, need to set it's size. cannot change it after
// they are a contiguous block in memory - so the elements are very quick to access (linear) - time complexity = O(1) - the fastest
// Time complexity - for an operations
//        Access - when you know where the element is O(1)
//        Access - when you don't know where it is O(n)
//        Add an element - need to create a new element and then copy them all - O(n)


//        if you know where the element you are looking is
//        But if you don't know, the time complexity is O(n) - where n is the number of items

            int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
// Arrays -This class contains various methods for manipulating arrays
// (such as sorting and searching). This class also contains a static
// factory that allows arrays to be viewed as lists.
        String[] strArray = new String[5];
//        contains pointers to String objects


        Arrays.stream(intArray).forEach(System.out::println);


    }

}

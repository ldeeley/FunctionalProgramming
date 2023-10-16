package org.example;

public class MathsLambda {

    public static void main(String[] args) {

        MyDoMathsFuncInterface add = (x,y)->System.out.println(x+y);

        onTheFly(add,3,5);
        onTheFly((x,y)->System.out.println(x*y),6,7);
        onTheFly((x,y)->System.out.println(x/y),10,2);
        onTheFly((x,y)->System.out.println(y-x),10,6);
    }

    public static void onTheFly(MyDoMathsFuncInterface myDoMathsFuncInterface, int x, int y){
        myDoMathsFuncInterface.doMaths(x,y);
    }

}

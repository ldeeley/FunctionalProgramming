package org.example;

public class BeforeLambda {

//    Creating an external class 'MyRunnableObject'
//    public static void main(String[] args) {
//        MyRunnableObject myRunnableObject = new MyRunnableObject();
//        Thread t = new Thread(myRunnableObject);
//        t.start();
//    }


//    Replacing the external class with an 'Anonymous Inner Class' (that implements the Runnable interface - a functional interface)
//    public static void main(String[] args) {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("my message here");
//            }
//        });
//
//        t.start();
//    }


//    Thread needs to be supplied with an object that implements Runnable interface
//    The Runnable interface is a functional interface - the lambda provides the implementation
    public static void main(String[] args) {
        Thread t = new Thread(()->System.out.println("my message here"));
        t.start();
    }

}

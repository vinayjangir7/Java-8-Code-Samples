package com.edureka.module4.java8;

public class DefaultDemo2{

    public static void main(String...args){
        new D().hello();
    }

    static interface A{
        public default void hello(){
            System.out.println("Hello from A");
        }
    }

    static interface B extends A { }

    static interface C extends A {
    }

    static class D implements B, C {

    }
}

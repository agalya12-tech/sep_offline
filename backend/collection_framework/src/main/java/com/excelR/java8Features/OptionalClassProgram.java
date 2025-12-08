package com.excelR.java8Features;

import java.util.Optional;

public class OptionalClassProgram {
    public static void main(String[] args) {
//      int size=getName().length();
//      System.out.println(size);

        Optional<String> res = getName();
        if(res.isPresent()){
            String name = res.get();
            System.out.println(name.length());
        }else{
        System.out.println("can't find size for null values");
        }
    }

    public static Optional<String> getName(){
        String name="radha";
//        return Optional.of(String.valueOf(name));
        return Optional.ofNullable(name);
    }


    //    public static String getName(){
//        String name=null;
//        return name;
//    }

}

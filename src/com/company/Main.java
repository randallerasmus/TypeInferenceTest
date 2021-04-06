package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(12);
        arrayList.add(9);


        boolean isPresent = arrayList.contains(9);

        if(isPresent){
            System.out.println("this is true");
        }
      else {
            System.out.println("this is not true");
        }



    }
}

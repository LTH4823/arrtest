package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person(180,53);
        Person p2 = new Person(180, 76);
        Person p3 = new Person(165,60);

        Person[] arr = new Person[3];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(Arrays.toString(arr));

        for (Person p :arr) {

            double bmi = p.weight/ Math.pow(p.height/(double)100,2);

            System.out.println(bmi);

        }//for
    }
}

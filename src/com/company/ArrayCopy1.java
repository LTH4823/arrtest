package com.company;

import java.util.Arrays;

public class ArrayCopy1 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] target = new int[arr.length + 1];

        // 원본, 복사 시작 위치, 대상, 대상 위치, 개수
        System.arraycopy(arr,0,target,0,arr.length );

        target[target.length -1] = 6;

        System.out.println(Arrays.toString(target));

        arr = target;

        System.out.println(Arrays.toString(arr));

        System.out.println(arr);
        System.out.println(target);
        System.out.println(arr == target);


    }

}

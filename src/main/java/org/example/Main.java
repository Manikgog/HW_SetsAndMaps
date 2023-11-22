package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOdd(nums);
    }

    public static void printOdd(List<Integer> nums){
        List<Integer> oddNums = new ArrayList<>();
        for (Integer item : nums) {
            if(item%2 != 0){
                oddNums.add(item);
            }
        }
        System.out.println(oddNums);
    }
}
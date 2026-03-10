package com.example;

import java.util.List;

public class EvenNumbers {

    public int nrOfEvenNumbers(List<Integer> list){
        int count = 0;
        for(Integer integer : list){
            if(integer % 2 == 0){
                count++;
            }
        }
        return count;
    }
}

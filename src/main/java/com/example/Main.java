package com.example;


import java.util.List;

public class Main {
    static void main(String[] args) {

        FileNumberReader fileNumberReader = new FileNumberReader();
        String filePath = args[0];
        List<Integer> array = fileNumberReader.readValidIntegers(filePath);
        int count = new EvenNumbers().nrOfEvenNumbers(array);
        System.out.println(count);
    }
}

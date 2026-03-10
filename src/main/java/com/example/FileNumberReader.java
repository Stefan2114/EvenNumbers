package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileNumberReader {

    public ArrayList<Integer> readValidIntegers(String filePath) {
        ArrayList<Integer> numbers = new ArrayList<>();
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    numbers.add(scanner.nextInt());
                } else {
                    scanner.next();
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file was not found at " + filePath);
        }

        return numbers;
    }
}

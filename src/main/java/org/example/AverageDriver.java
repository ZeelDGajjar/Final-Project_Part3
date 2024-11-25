package org.example;
import java.util.*;

public class AverageDriver {
    public static void main(String[] args) {
         System.out.println("Enter the number of scores: ");
         Scanner info = new Scanner(System.in);
         int data = info.nextInt();

         Average average = new Average(data);

        System.out.println(average);
    }
}

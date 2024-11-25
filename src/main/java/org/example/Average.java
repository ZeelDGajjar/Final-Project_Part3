package org.example;
import java.util.Scanner;

public class Average {

    //Data fields
    private double[] data;
    private double mean;

    public Average(int scores){
        data = new double [scores];
        Scanner info = new Scanner(System.in);

        for(int i = 0; i < data.length; i++){
            System.out.printf("Please enter score %d: ", i + 1);
            data[i] = info.nextDouble();
        }

        selectionSort();
        calculateMean();
    }

    public void calculateMean(){
        double total = 0;
        for(double num: data){
            total += num;
        }
        mean = total / data.length;
    }

    public String toString(){
        int[] data = new int[5]; // Create an array with 5 elements


        // Bubble sort to arrange the numbers in descending order
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    // Swap the values if they are in the wrong order
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        // Calculate the total sum of the array
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i]; // Add each value to total
        }

        // Calculate the mean (average)
        double mean = (double) total / data.length;

        // Construct the string for the sorted array manually
        String result = "Data in descending order: ";
        for (int i = 0; i < data.length; i++) {
            result += data[i]; // Add each number to the result string
            if (i < data.length - 1) {
                result += ", "; // Add a comma between numbers
            }
        }

        // Return the final string with the mean
        return result + "\nMean: " + mean;
    }

    public void selectionSort(){ //Still not sure
        for (int i = 0; i < data.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[minIndex]) {
                    minIndex = j;
                }
            }

            //Swap the values
            double temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }

    }

}

package org.example;
import java.util.Scanner;

/**
 *
 * @author 2474008
 */

public class Average {

    // Data fields
    private double[] data;
    private double mean;

    // Constructor: Takes input for 5 scores and initializes the array
    public Average() {
        data = new double[5]; // Fixed size of 5
        Scanner info = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.printf("Please enter score %d: ", i + 1);
            data[i] = info.nextDouble();
        }

        selectionSort();
        calculateMean();
    }

    // Method to calculate the mean
    public void calculateMean() {
        double total = 0;
        for (double num : data) {
            total += num;
        }
        mean = total / data.length;
    }

    // toString method returns a string representation of the data
    public String toString() {
        String result = "Data in descending order: ";
        for (int i = 0; i < data.length; i++) {
            result += data[i]; // Add each number to the result string
            if (i < data.length - 1) {
                result += ", "; // Add a comma between numbers
            }
        }

        return result + "\nMean: " + mean;
    }

    // Method to perform selection sort in descending order
    public void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the found maximum element with the first element
            double temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        Average avg = new Average();
        System.out.println(avg.toString()); // Display the results
    }
}

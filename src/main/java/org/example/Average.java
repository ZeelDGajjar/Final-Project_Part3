package org.example;
import java.util.Scanner;

/**
 * @author 2474008
 * */

public class Average {

    // Data fields
    private double[] data;
    private double mean;

    /**
     * Constructor for Average class that takes input for 5 scores,
     * stores them in an array, and calculates the mean.
     */
    public Average() {
        data = new double[5]; // Fixed size of 5 for storing the scores
        Scanner info = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.printf("Please enter score %d: ", i + 1);
            data[i] = info.nextDouble();
        }

        selectionSort();
        calculateMean();
    }

    /**
     * Calculates the mean of the scores by summing them up and dividing by the number of scores.
     */
    public void calculateMean() {
        double total = 0;
        for (double num : data) {
            total += num;
        }
        mean = total / data.length;
    }

    /**
     * Returns a string representation of the sorted data and the mean.
     * @return A string with the scores in descending order and the mean.
     */
    public String toString() {
        String result = "Data in descending order: ";
        for (int i = 0; i < data.length; i++) {
            result += data[i];
            if (i < data.length - 1) {
                result += ", ";
            }
        }

        return result + "\nMean: " + mean;
    }

    /**
     * Sorts the data array in descending order using the selection sort algorithm.
     */
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
}

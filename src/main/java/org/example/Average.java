package org.example;
import java.util.Scanner;

public class Average {

    //Data fields
    private int[] data;
    private double mean;

    Scanner info = new Scanner(System.in);

    public Average(){
        for(int i = 0; i < 5; i++){
            System.out.printf("Please enter score %d", i + 1);
            data[i] = info.nextInt();

            calculateMean();
            selectionSort();
        }
    }

    public void calculateMean(){
        double total = 0;
        for(int i = 0; i < 5; i++){
            total += data[i];
        }
        mean = total / data.length;
    }

    public String toString(){
        int[] data = new int[4]; ///Can we put five exactly?

        for(int i = 0; i < 5; i++){
            if(data[i] < data[i+1]){
                int num1 = data[i];
                data[i] = data[i + 1];
                data[i + 1] = num1;
            }
        }

        int total = 0;
        for(int i = 0; i < 5; i++){
            total += data[i];
        }

        //double mean = total/5;

        return data.toString() + Integer.valueOf(total/5); ///not sure. does this include all? //how do I add mean in it??
    }

    public void selectionSort(){ //Still not sure
        int arLength = data.length;
        for (int i = 0; i < arLength; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arLength; j++) {
                if (data[j] > data[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }

    }

}

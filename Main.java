import java.util.Random;
import java.util.Scanner;
public class Main {
    // double average
    public static double getAverage(int values[])
    {
        Random rnd = new Random();
        double[] dataPoints = new double[100];
        for (int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }
        double sum = 0;
        for (int x = 0; x < dataPoints.length; x++)
        {
        sum = sum + dataPoints[x];
        }
        double ave = sum / dataPoints.length;
        return ave;
    }

    public static void main(String[] args) {
        // randomizer
        Random rnd = new Random();
        // array
        int[] dataPoints = new int[100];
        Scanner in = new Scanner(System.in);
        int rangedInt = 0;
        // print random numbers 1 - 100
        for (int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }
        for (int x = 0; x < dataPoints.length; x++)
        {
            System.out.println(dataPoints[x]);
        }
        System.out.println("");
        // print average and sum of array
        for (int x : dataPoints)
        {
            System.out.printf(dataPoints[x] + " | ");
        }
        System.out.println("");
        int sum = 0;
        for (int x = 0; x < dataPoints.length; x++)
        {
            sum = sum + dataPoints[x];
        }
        System.out.println(" ");
        int ave = sum / dataPoints.length;
        System.out.println("The sum is " + sum + " and the average is " + ave);

        do
        {
            System.out.print("Pick a number 1 - 100 ");
            rangedInt = in.nextInt();
        }while (rangedInt <= 1 && rangedInt >= 100 );
        // circles through and finds the value selected
        boolean fountTarget = false;
        for (int e = 0; e < dataPoints.length; e++)
        {
            if (dataPoints[e] == rangedInt)
            {
                fountTarget = true;
                System.out.println("Found " + rangedInt + " at point " + e);
            }
        }
        if(!fountTarget)
        {
            System.out.println("Target " + rangedInt + " not found!");
        }
        for (int e = 0; e < dataPoints.length; e++)
        {
            // breaks
            if (dataPoints[e] == rangedInt)
            {
                fountTarget = true;
                System.out.println("Breaking! Found " + rangedInt + " at point " + e);
                break;
            }
        }
        // minimum and maximum
        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int e = 0; e < dataPoints.length; e++)
        {
            if(min > dataPoints[e])
            {
                min = dataPoints[e];
            }
            if(max < dataPoints[e])
            {
                max = dataPoints[e];
            }
        }
        // prints out minimum and maximum and double average
        System.out.println("The minimum is " + min + " and the maximum is " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
}
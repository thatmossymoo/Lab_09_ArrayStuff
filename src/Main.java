import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int[] dataPoints;
        int ARRAY_SIZE = 100;
        dataPoints = new int[ARRAY_SIZE];
        int sum = 0;
        int min = 100; //min = dataPoints[0] was not working for some reason, reasoned that the highest the min could be is 100
        int max = dataPoints[0];
        for (int e = 0; e < dataPoints.length; e++) {
            dataPoints[e] = rnd.nextInt(100) + 1;
            System.out.printf("%3d |", dataPoints[e]);
            sum += dataPoints[e];

            if (min > dataPoints[e]) {
                min = dataPoints[e];
            }
            if (max < dataPoints[e]) {
                max = dataPoints[e];
            }

        }
        int ave = sum / dataPoints.length;
        System.out.println("\nThe sum of the data set is " + sum);
        System.out.println("The average of the data set is " + ave);
        System.out.println("The minimum of the data set is " + min);
        System.out.println("The maximum of the data set is " + max);
        int searchTarget = SafeInput.getRangedInt(in, "Enter value to search for", 1, 100);
        boolean foundTarget = false;
        int countTarget = 0;
        for (int e = 0; e < dataPoints.length; e++) {
            if (dataPoints[e] == searchTarget) {
                foundTarget = true;
                countTarget++;
                System.out.println("Found " + searchTarget + " at index " + e);
            }
        }
        if (!foundTarget) {
            System.out.println("Target " + searchTarget + " not found.");
        }
        System.out.println("Found target " + searchTarget + " " + countTarget + " times.");


        foundTarget = false;
        for (int e = 0; e < dataPoints.length; e++) {
            if (dataPoints[e] == searchTarget) {
                foundTarget = true;
                System.out.println("Breaking! Found " + searchTarget + " at index " + e);
                break;
            }
        }
        if (!foundTarget) {
            System.out.println("Target " + searchTarget + " not found.");
        }

        System.out.println("Average of data points is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[]) {
        double sum = 0;
        double ave;
        for(int e = 0; e <values.length; e++ )
        {
            sum = sum + values[e];
        }
        ave = sum / values.length;
        return ave;
    }
}
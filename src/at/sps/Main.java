package at.sps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum1 = 0;
        double sum2 = 0;
        double sum;

        System.out.println("Geben Sie zwei Zahlen ein um diese zu addieren!");

        do
        {

            try
            {
                System.out.printf("Erste Zahl:");
                sum1 = sc.nextDouble();
                System.out.printf("Zweite Zahl:");
                sum2 = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Bei der Eingabe ist ein Fehler aufgetreten, versuchen Sie es Erneut!");
            }
        } while(sum1 == 0 && sum2 == 0);

        sum = sum1 + sum2;
        System.out.println("Ergebniss: " + sum);

    }
}

package at.sps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum1 = 0;
        double sum2 = 0;
        double sum;
        boolean run = true;

        while (run)
        {
            System.out.println("Geben Sie zwei Zahlen ein um diese zu addieren!");
            try {
                System.out.printf("Erste Zahl: ");
                sum1 = sc.nextDouble();
                System.out.printf("Zweite Zahl: ");
                sum2 = sc.nextDouble();
                sum = sum1 + sum2;
                System.out.println("Ergebniss: " + sum);
            } catch (Exception e) {
                System.out.println("Bei der Eingabe ist ein Fehler aufgetreten, versuchen Sie es Erneut!");
                sc.reset();
            }

            System.out.println("Möchten Sie das Programm beenden? (y/n)");
            String ans = sc.next();
            if (ans.equals("y"))
            {
                run = false;
                System.out.println("Auf Wiedersehen!");
            }
            else if (ans.equals("n"))
                run = true;
            else
                System.out.println("Ungültige Eingabe! Programm wird fortgesetzt.");
        }
    }
}

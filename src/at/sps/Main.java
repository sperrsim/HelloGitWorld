package at.sps;

import java.util.Scanner;

/**
 * @author Simon Sperr
 * @version 2020.1.1, 8.10.2020
 **/
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        String ans = "init";
        boolean adding = true;
        boolean run = true;

        while (run)
        {
            System.out.println("Geben Sie Zahlen ein um diese mit = zu addieren!");
            try {
                int c = 1;
                sum = 0;
                while (adding)
                {
                    Scanner sc = new Scanner(System.in);
                    System.out.printf("%d. Zahl: ", c);
                    ans = sc.next();
                    try
                    {
                        sum += Double.parseDouble(ans);
                    }
                    catch(Exception e)
                    {
                        if(ans.equals("="))
                            adding = false;
                        else
                            System.out.println("Keine Zahl! Eingabe wird nicht gewertet.");
                    }
                    c++;
                }

            } catch (Exception e) {
                System.out.println("Bei der Eingabe ist ein Fehler aufgetreten, versuchen Sie es Erneut!");
            }

            System.out.println("Ergebniss: " + sum);
            Scanner sc = new Scanner(System.in);
            System.out.println("Möchten Sie das Programm beenden? (y/n)");
            ans = sc.next();
            if (ans.equals("y"))
            {
                run = false;
                System.out.println("Auf Wiedersehen!");
            }
            else if (ans.equals("n"))
                adding = true;
            else
            {
                adding = true;
                System.out.println("Ungültige Eingabe! Programm wird fortgesetzt.");
            }
        }
    }
}

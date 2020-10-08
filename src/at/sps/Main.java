package at.sps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum1 = 0;
        String ans = "";
        boolean adding = true;
        boolean run = true;

        while (run)
        {
            System.out.println("Geben Sie Zahlen ein um diese mit = zu addieren!");
            try {
                int c = 1;
                while (adding)
                {
                    Scanner sc = new Scanner(System.in);
                    System.out.printf("%d. Zahl: ", c);
                    ans = sc.next();
                    try
                    {
                        sum1 += Double.parseDouble(ans);
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

            System.out.println("Ergebniss: " + sum1);
            Scanner sc = new Scanner(System.in);
            System.out.println("Möchten Sie das Programm beenden? (y/n)");
            ans = sc.next();
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

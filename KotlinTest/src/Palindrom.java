import java.util.Scanner;

public class Palindrom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in,"Windows-1250");
        System.out.println("Zadej palindrom:");
        String vstup  = sc.nextLine();
        vstup = vstup.toLowerCase().trim();
        String  palindrom = "";
        for(int i = vstup.length();i > 0 ;i--) // i je delka vstupu. i je vetsi jak 0, od i se odecita cyklus o  1;
        {
            palindrom += vstup.charAt(i - 1); // palindrom + vstup prevedeny na Char/znak (delkavstupu - 1)
        }
        System.out.println(palindrom);

        if(vstup.equals(palindrom))
            System.out.println("Ano, toto je palindrom.");
        else
            System.out.println("Toto není palindrom.");

    }
}


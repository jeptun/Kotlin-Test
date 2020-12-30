import java.util.Scanner;
import java.util.Arrays;

public class Caesar
{
    public static void main (String[]args)
    {
       Scanner sc = new Scanner(System.in,"Windows-1250");
       System.out.println("Zadej puvodni zpravu ktera bude prevedena do sifry");
       String vstup = sc.nextLine();
       System.out.printf("Puvodni zprava %s\n",vstup);
       String zprava = "";
       int posun = 3;
       for ( char c :vstup.toCharArray())
       {
           int i = (int)c;
           i+=posun;
           if (i>(int)'z')
           {
               i-=26;
           }
           char znak = (char)i;
           zprava+=znak;
       }
       System.out.printf("Sifra: %s",zprava);
    
    }
}

import java.util.Scanner;

public class AnalyzaZnaku {
    public static void main (String[]args){

        System.out.println("Zadej větu k analýze počtu, abecedních a nepísemných znaků!");
        Scanner sc = new Scanner(System.in,"UTF-8");
        // řetězec který analyzujeme
        String s = sc.nextLine();
        System.out.println(s);
        s = s.toLowerCase();

        // proměné na inicializaci počitadel
        int pocetsamohlasek = 0;
        int pocetsouhlasek = 0;

        // proměné určující písmena
        String samohlasky ="aeiouyáéěíóúůý";
        String souhlasky = "bcčdďfghjklmnpqrřsštťvwxzž";

        // hlavní cyklus
        for ( char c : s.toCharArray())
        {
           if (samohlasky.contains(String.valueOf(c)))
           {
               pocetsamohlasek++;
           }
           else if  (souhlasky.contains(String.valueOf(c)))
            {
                pocetsouhlasek++;
            }
        }
        System.out.printf("Samohlásek: %d\n", pocetsamohlasek);
        System.out.printf("Souhlásek: %d\n", pocetsouhlasek);
        System.out.printf("Nepísmenných znaků: %d\n", s.length() - (pocetsamohlasek + pocetsouhlasek));
    }
}

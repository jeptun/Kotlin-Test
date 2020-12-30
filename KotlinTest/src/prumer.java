import java.util.Scanner; // import java balicku Scanner
import java.util.Arrays;

public class prumer {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in,"Windows-1250");
        System.out.println("Vypocet prumeru  cisel. Zadej pocet cisel!");
        int pocet = Integer.parseInt(sc.nextLine()); // promena pocet vytvari vstup a je prevedena pars  z textu na cisla.
        int cisla [] = new int[pocet]; // promena cisla ktera vytvari pole s promenou pocet.
        for (int i = 0; i < pocet; i ++) // cyklus promena i ma nulu. i je mensi jak zadany vstup od uzivatele. ciklus i se zopakuje.

        {
          System.out.printf("Zadej %d. cislo: ", i + 1 );// vypsani textu $d.= je promena i + 1
          cisla[i]= Integer.parseInt(sc.nextLine()); // pole [] cisla = promena i = novy vstup od uzivatele
        }
        int soucet = 0; // promena soucet s prozatimni hodnotou nula
        for (int i: cisla) // cyklus foreach pro prom i: promena cisla je [] pole
        {
         soucet+=i; // prikaz soucet + i  pocet [] pole
        }
        float prumer = soucet / (float)cisla.length; // prom prumer = soucet / (float znamena necelociselne deleni ) promene cisla.delky znaku v retezci
        System.out.printf("Průměr tvých cisel je: %f", prumer);
    }
}

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Kalkulacka {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Vítejte v kalkulačce");
        String pokracovat = "ano";
        while (pokracovat.equals("ano"))
        {
            System.out.println("Vloz prvni cislo do kalkulacky");
            double prvnicislo = Double.parseDouble(sc.nextLine());
            System.out.println("Vloz druhe cislo do kalkulacky");
            double druhecislo = Double.parseDouble(sc.nextLine());
            System.out.println("Vyberte variantu");
            System.out.println("1 Scitani");
            System.out.println("2 Odcitani");
            System.out.println("3 Nasobeni");
            System.out.println("4 Deleni");
            int volba = Integer.parseInt(sc.nextLine());
            double vysledek = 0;

            switch (volba) {
                case 1:
                    vysledek = prvnicislo + druhecislo;
                    break;
                case 2:
                    vysledek = prvnicislo - druhecislo;
                    break;
                case 3:
                    vysledek = prvnicislo * druhecislo;
                    break;
                case 4:
                    vysledek = prvnicislo / druhecislo;
            }
            if ((volba >= 5) && (volba <= 0)) {
                System.out.println("neplatna volba");
            } else {
                System.out.println(vysledek);

            }
            System.out.println("Přejete si zadat další příklad? [ano/ne]");
            pokracovat = sc.nextLine();
        }

    }
}

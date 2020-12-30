import java.util.Arrays;
import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadej počet čísel:");
        int pocet = Integer.parseInt(sc.nextLine());
        int [] cisla = new int[pocet];
        for (int i = 0; i < pocet; i++) {
            System.out.printf("Zadej %d. cislo: ", i + 1);
            cisla[i] = Integer.parseInt(sc.nextLine());
        }

        int [ ] pole2 = Arrays.copyOfRange(cisla, 0, pocet);
        Arrays.sort(pole2);
        float median = (float) pole2[pole2.length/2];
        for (int a : cisla)
            System.out.println(a + " se od mediánu odchyluje o " + (a - median));

    }
}

package ondrovyúkoly;

import java.util.Scanner;

public class OndrovyÚkoly {

    public static void main(String[] args) {
        System.out.println("Vítej v umocňovači!");
        System.out.println("Zadej číslo k umocnění:");
        Scanner sc = new Scanner(System.in, "UTF-8");
        int číslo = sc.nextInt();
        System.out.println("Mocnina je " + (číslo * číslo));
    }
}

package ondrovyúkoly;

import java.util.Scanner;

public class OndrovyÚkoly {

    public static void main(String[] args) {
        System.out.println("Jak se jmenuješ?");
        Scanner sc = new Scanner(System.in, "UTF-8");
        String jméno = sc.nextLine();
        System.out.println("Jak se máš?");
        String stav = sc.nextLine();
        System.out.println(jméno + " se má " + stav);
    }
}

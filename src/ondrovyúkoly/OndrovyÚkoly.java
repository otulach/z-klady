package ondrovyúkoly;

import java.util.Arrays;
import java.util.Scanner;

public class OndrovyÚkoly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Zadejte zprávu:");
        String zprava = sc.nextLine();
        String z = "";
        System.out.println("Zadejte posun:");
        int posun = sc.nextInt();
        for (char c : zprava.toCharArray()) {
            int i = (int) c;
            i += posun;
            char znak = (char) i;
            z += znak;
        }
        System.out.printf("Zakódovaná zpráva: %s\n", z);
    }
}

package ondrovyúkoly;

import java.util.Arrays;
import java.util.Scanner;

public class OndrovyÚkoly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        String[] tulachovi = {"Ondra", "Anna", "Jarda", "Sona"};
        System.out.println("Zadej někoho z Tulachů");
        String tulach = sc.nextLine();
        Arrays.sort(tulachovi);
        int pozice = Arrays.binarySearch(tulachovi, tulach);
        if (pozice >= 0)
        System.out.println("Je to Tulach!");
else
        System.out.println("Tohle není Tulach!");
        }
    }

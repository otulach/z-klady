package ondrovyúkoly;

public class OndrovyÚkoly {

    public static void main(String[] args) {
        System.out.println("Násobilkovač!");
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.printf("%3d ", a * b);
            }
            System.out.println();
        }
    }
}

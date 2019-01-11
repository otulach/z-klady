package ondrovyúkoly;

public class OndrovyÚkoly {

    public static void main(String[] args) {
        long[] fibonnanci = new long[20];
        fibonnanci[0] = 1;
        fibonnanci[1] = 1;
        for (int i = 2; i < fibonnanci.length; i++) {
            fibonnanci[i] = fibonnanci[i - 1] + fibonnanci[i - 2];
        }
        for (long hodnota : fibonnanci) {
            System.out.printf("%d ", hodnota);
        }
        System.out.println();
    }
}

import java.util.Scanner;

public class Main {

    static long[] D;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        D = new long[N + 2];

        D[1] = 1;
        D[2] = 2;

        for (int i = 3; i <= N; i++) {
            D[i] = (D[i - 1] + D[i - 2]) % 10007;
        }

        System.out.println(D[N]);
    }
}
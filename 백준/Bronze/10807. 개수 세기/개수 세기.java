import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] intArr = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            intArr[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for(int i : intArr) {
            if (i == v) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
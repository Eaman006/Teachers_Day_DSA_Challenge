import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        if (n > 0) {
            int min = a[0];
            int max = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] > max) {
                    count++;
                    max = a[i];
                }
                if (a[i] < min) {
                    count++;
                    min = a[i];
                }
            }
        }

        System.out.println(count);
    }
}

import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int[] L = new int[n];
        L[0] = 1;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] <= a[i]){
                 L[i] = L[i - 1] + 1;
            }
            else{
                 L[i] = 1;
            }
        }
        int[] R = new int[n];
        R[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i + 1] <= a[i]){
                R[i] = R[i + 1] + 1;
            }
            else{
                R[i] = 1;
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, L[i] + R[i] - 1);
        }
        System.out.println(max);
        
    }
}

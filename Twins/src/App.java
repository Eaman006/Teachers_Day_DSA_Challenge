import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Integer [] a = new Integer[n];
        int c = 0;
        int r =0;
        int sum =0;
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
            r=r+a[i];
        }
        sc.close();
        Arrays.sort(a, Collections.reverseOrder());
        while (sum<=r/2) {
            sum = sum+a[c];
            c=c+1;           
        }
        System.out.println(c);
    }
}

import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int c=0;
        for(int i=0; i<n; i++ ){
            int p = sc.nextInt();
            int q= sc.nextInt();
            if (q-p>=2) {
                c++;                                
            }
        }
        sc.close();
        System.out.println(c);
    }
}

import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int c = 1;
        a[0]=sc.nextInt();
        for(int i=1; i<a.length; i++){
            a[i]=sc.nextInt();
            sc.nextLine();
            if (a[i]!=a[i-1] && i>0) {
                c++;                
            }
        }
        sc.close();
        System.out.println(c);        
    }
}

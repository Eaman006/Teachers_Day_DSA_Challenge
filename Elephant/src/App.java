import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        sc.close();
        while (n-5!=0 && n-5>0) {
            r=r+1;
            n=n-5;            
        }
        if (n!=0) {
            r=r+1;            
        }
        System.out.println(r);     
    }
}

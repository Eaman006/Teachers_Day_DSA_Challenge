import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        sc.close();
        int c = 0;
        while(n!=0){
            long a=n%10;
            if (a==7 || a==4) {
                c=c+1;                
            }
            n=n/10;
        }
        if (c==7 || c==4) {
            System.out.println("YES");            
        }
        else{
            System.out.println("NO");
        } 
               
    }
}

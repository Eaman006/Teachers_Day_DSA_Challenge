import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int c = consecutive(a);
        if (b==c) {
            System.out.println("YES");            
        }
        else{
            System.out.println("NO");
        } 


    }
    static int consecutive(int a){
        int n = a+1;
        while (true) {
            if (isPrime(n)) {
                return n;                
            }
            n++;                        
        }
    }
    static boolean isPrime(int a){
        if (a<=1) {
            return false;            
        }
        for(int i =2; i*i<=a; i++){
            if (a%i==0) {
                return false;                
            }
        }
        return true;
    }
}

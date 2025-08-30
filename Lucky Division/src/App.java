import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isLucky(n)) {
            System.out.println("YES");            
        }
        else if (n%7==0||n%4==0||n%47==0) {
            System.out.println("YES");            
        }
        else{
            System.out.println("NO");
        }

    }
    static boolean isLucky(int n){
        
        while (n!=0) {
            int a = n%10;
            if (a!=7 && a!=4) {
                return false;                
            }
            n=n/10;
        }
        return true;
        
    }
}

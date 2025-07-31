import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if (n%2==0 & n!=2) {
            System.out.println("yes");            
        }
        if (n==2) {
            System.out.println("no");            
        }
        else{
            System.out.println("no");
        }
    }
}

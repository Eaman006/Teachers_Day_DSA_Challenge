import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int i = 0;
        while (a<=b) {
            a=3*a;
            b=2*b;
            i=i+1;
        }
        System.out.println(i);
    }
}

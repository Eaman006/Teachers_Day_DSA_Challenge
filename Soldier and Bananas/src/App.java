import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        sc.close();
        int p = 0;
        for(int i=1; i<=w; i++){
            p=p+i*k;
        }
        if (p-n<0) {
            System.out.println(0);
            
        }
        else{
            System.out.println(p-n);

        }
    }
}

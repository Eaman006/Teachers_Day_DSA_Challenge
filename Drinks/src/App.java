import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a=0;
        for(int i=0;i<n;i++){
            int b = sc.nextInt();
            a=a+b;
        }
        sc.close();
        float b=(float)a/100;
        float r=((float)b/n)*100;
        System.out.println(r);

    }
}

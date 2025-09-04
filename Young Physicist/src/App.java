import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int x =0;
        int y=0;
        int z=0;
        for(int i =0; i<n; i++){
            x= x + sc.nextInt();
            y= y+ sc.nextInt();
            z= z+ sc.nextInt();
            sc.nextLine();
            
        }
        sc.close();
        if (x==0 && y==0 && z==0) {
            System.out.println("YES");            
        }
        else{
            System.out.println("NO");
        }
    }
}

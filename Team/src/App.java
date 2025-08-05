import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int c =0;
        for(int i=0; i<n; i++){
            String a = s.nextLine();
            a = a.replace(" ", ""); 
            int d =Integer.parseInt(a);
            int b = d%10;
            d=d/10;
            b=b+d%10;
            d=d/10;
            b=b+d%10;
            if (b==2||b==3) {
                c=c+1;                
            }          
        }
        s.close();
        System.out.println(c);

    }
}

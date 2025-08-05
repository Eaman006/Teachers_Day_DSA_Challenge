import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int c = 0;
        int[] d = new int[n];
        for(int i=0; i<d.length; i++){
            d[i]=s.nextInt();
        }
        s.close();
        for(int i=0; i<d.length; i++){
            if (d[i]>=d[k-1] && d[i]>0) {
                c=c+1;                                                
            }
        }
        System.out.println(c);
    }
}

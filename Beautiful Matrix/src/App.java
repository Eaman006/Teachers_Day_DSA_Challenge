import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[5][5];
        int r = 0;
        int c = 0;
        int m=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                a[i][j]=sc.nextInt();
                if (a[i][j]==1) {
                    r=j+1;
                    c=i+1;                    
                }
            }
            sc.nextLine();
        }
        sc.close();
        if (r>3) {
            m=m+r-3;                        
        }
        else{
            m=3-r;
        }
        if (c>3) {
            m=m+c-3;            
        }
        else{
            m=m+3-c;
        }
        System.out.println(m);
            
    }
}

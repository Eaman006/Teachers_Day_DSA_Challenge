import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        s.close();
        a = a.trim();
        a = a.replace("+", "");
        int [] c = new int[a.length()];
        for(int i = 0; i<c.length; i++){
            c[i]=Character.getNumericValue(a.charAt(i));
        }
        for(int i=0; i<c.length-1; i++){
            for(int j=0; j<c.length-1-i; j++){
                if (c[j]>c[j+1]) {
                    int t=c[j];
                    c[j]=c[j+1];
                    c[j+1]=t;                
                }
            }
        }
        String[] d = new String[c.length];
        for(int i =0;i<d.length;i++){
            d[i]=String.valueOf(c[i]);
        }

        System.out.println(String.join("+",d));
            
    }
}

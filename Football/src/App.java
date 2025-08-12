import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int c=1;
        for(int i =0;i<s.length()-1;i++){
            if (s.charAt(i)==s.charAt(i+1)) {
                c=c+1;                
            }
            else{
                c=1;
            }
            if (c>=7) {
                break;
                
            }            
        }
        if (c>=7) {
            System.out.println("YES");            
        }
        else{
            System.out.println("NO");
        }
    }
}

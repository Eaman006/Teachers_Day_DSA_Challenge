import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String s =sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < sb.length() - 1; j++) {
                if (sb.charAt(j) == 'B' && sb.charAt(j + 1) == 'G') {
                    sb.setCharAt(j, 'G');
                    sb.setCharAt(j + 1, 'B');
                    j++;
                }
            }
        }
        System.out.println(sb.toString());
        
    }
}

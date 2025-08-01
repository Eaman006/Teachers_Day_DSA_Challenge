import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }
        sc.close();
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > 10) {
                System.out.print(s[i].charAt(0));
                System.out.print(s[i].length() - 2);
                System.out.print(s[i].charAt(s[i].length() - 1));
                System.out.println("");

            } 
            else {
                System.out.println(s[i]);
            }

        }
    }
}

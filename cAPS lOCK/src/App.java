import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        boolean c= false;
        StringBuilder result = new StringBuilder();
        if (s.toLowerCase().equals("capslock")) {
            System.out.println(s);
        }
        else if (s.length()==1 && s.equals(s.toLowerCase())) {
            System.out.println(s.toUpperCase());
        }
        else if (s.length()==1 && s.equals(s.toUpperCase())) {
            System.out.println(s.toLowerCase());
        }
        else if(s.equals(s.toUpperCase())){
            System.out.println(s.toLowerCase());
        }
        else if(s.equals(s.toLowerCase())){
            System.out.println(s);
        }
        else if(Character.isLowerCase(s.charAt(0))) {
            result.append(Character.toUpperCase(s.charAt(0)));
            for(int i=1; i<s.length(); i++) {
                result.append(Character.toLowerCase(s.charAt(i)));
            }
            System.out.println(result.toString());
        }
        else{
            System.out.println(s);
        }
        
        

    }
}

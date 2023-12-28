import java.util.Scanner;

public class RemovalOfPairs {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        for (int index = 0; index < size; index++){
            int n = sc.nextInt();
            String s = sc.next();

            if(n==0) {
                System.out.println(0);
                continue;
            }

            boolean flag = true;

            while (flag) {
                flag = false;
                String dummy = "";
                int i = 0;
                while (i < s.length()-1) {
                    if(s.charAt(i) != s.charAt(i+1)) {
                        i += 2;
                        flag = true;
                    }
                    else {
                        dummy += s.charAt(i);
                        i++;
                    }
                }

                if(s.length()%2 !=  0 || i == s.length()-1)
                dummy += s.charAt(s.length()-1);

                if(flag) s = dummy;
                System.out.println(s);
            }

            System.out.println(s.length());

            
        }
    }
}

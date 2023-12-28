import java.util.Scanner;

public class Ulp {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        for (int index = 0; index < size; index++) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder ansBuilder = new StringBuilder();

            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == 'b' || s.charAt(i) == 'c' || s.charAt(i) == 'd') {
                    ansBuilder.append(s.charAt(i));
                    i--;
                    ansBuilder.append(s.charAt(i));
                    i--;
                    ansBuilder.append(s.charAt(i));
                    ansBuilder.append(".");
                } else {
                    ansBuilder.append(s.charAt(i));
                    i--;
                    ansBuilder.append(s.charAt(i));
                    ansBuilder.append(".");
                }
            }

            ansBuilder.deleteCharAt(ansBuilder.length() - 1);
            ansBuilder.reverse();
            String ans = ansBuilder.toString();
            System.out.println(ans);
        }
    }
}

import java.util.Scanner;

public class CanASquare {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        for(int index=0; index<size; index++){
            int n = sc.nextInt();
            long sum = 0;
            int allZero = 1;
            for(int i=0; i<n; i++){
                long temp = sc.nextInt();
                sum += temp;
                if (temp != 0 && allZero == 1) allZero = 0;
            }

            long t = (long)Math.sqrt(sum);
            if (allZero == 1) {
                System.out.println("NO");
            }
            else if (t * t == sum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

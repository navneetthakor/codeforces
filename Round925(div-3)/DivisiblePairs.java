import java.util.Scanner;

public class DivisiblePairs {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        for(int index=0; index<size; index++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int[] a = new int[n];

            for(int i=0; i<n; i++) a[i] = sc.nextInt();

            // to count pairs 
            int cnt = 0;
            for(int i=0; i<n ;i++){
                for(int j=i+1; j<n; j++){
                    if((a[i]+a[j])%x == 0 && (a[i]-a[j])%y == 0) cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}

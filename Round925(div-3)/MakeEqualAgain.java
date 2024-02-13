import java.util.Scanner;

public class MakeEqualAgain {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        for(int index=0; index<size; index++){
            int n = sc.nextInt();
            long[] a = new long[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            long fcnt = 1;
            long bcnt = 1;
            // from start
            for(int i=0; i<n-1; i++){
                if(a[i]==a[i+1]) fcnt++;
                else break;
            }

            // from back 
            for(int i=n-1; i>0; i--){
                if(a[i] == a[i-1]) bcnt++;
                else break;
            }

            long k;
            if(a[0] == a[n-1]){
                k = (long)n - fcnt - bcnt;
            }
            else{
                long max = Math.max(fcnt, bcnt);
                k = (long)n - max;
            }


            if(k < 0)System.out.println(0);
            else System.out.println(k);
        }
    }
}

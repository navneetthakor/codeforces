import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MatchingArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size;
        size = sc.nextInt();

        for(int index=0; index<size; index++){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for(int i=0; i<n; i++) a[i] = sc.nextInt();
            for(int i=0; i<n; i++) b[i] = sc.nextInt();

            Arrays.sort(a);
            Arrays.sort(b);
            MatchingArrays.reverse(b);
            int flag = 0;
            int tx = 0;

            for(int i=0; i<n; i++){
                if(a[i] > b[i]) {
                    tx++;
                    flag = 1;
                }
            }

            if((tx - x)< 0) System.out.println("NO");
            else {
                System.out.println("YES");
                for(int i=0; i<n; i++) System.out.print(b[i]);
                System.out.println();
            }
        }
    }

    static void reverse(int b[]){
        int start = 0;
        int end = b.length-1;

        while (start<=end) {
            int temp = b[start];
            b[start] = b[end];
            b[end] = temp;
            start++;
            end--;
        }
    }
}

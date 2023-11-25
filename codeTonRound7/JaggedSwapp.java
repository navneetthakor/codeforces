import java.util.Scanner;

public class JaggedSwapp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size;
        size = sc.nextInt();

        for(int i=0; i<size; i++){
            int n = sc.nextInt();

            int[] a = new int[n];
            int flag = 0;

            for(int j=0; j<n; j++) {
                a[j] = sc.nextInt();
                if(a[j]>n) {
                    System.out.println("NO");
                    flag =1;
                }
            }

            if(flag == 1) break;
            else if(a[0] != 1) System.out.println("NO");
            else System.out.println("YES");
        }

    }
}
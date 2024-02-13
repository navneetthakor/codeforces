import java.util.Scanner;

public class MakeEqual {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        for(int index=0; index<size; index++){
            int n = sc.nextInt();
            int sum = 0;
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
               arr[i] =  sc.nextInt();
               sum += arr[i];
            }

            int equal = sum/n;
            int extra = 0;
            boolean flag = true;

            for(int i=0; i<n; i++){
                if(arr[i]<equal){
                    if((equal - arr[i]) > extra){
                        flag = false;
                        break;
                    }
                    else{
                        extra -= (equal - arr[i]);
                    }
                }
                else{
                    extra += (arr[i] - equal);
                }
            }

            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

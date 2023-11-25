import java.util.Scanner;
import java.util.ArrayList;

public class OneAndTwos{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size;
        size = sc.nextInt();

        for(int index=0; index<size; index++){
            int n = sc.nextInt();
            int q = sc.nextInt();

            // declaring array 
            int[] a = new int[n];

            // taking array as input 
            for(int i=0; i<n; i++) a[i] = sc.nextInt();

            // finding sum 
            ArrayList<Integer> ar = new ArrayList<>();
            OneAndTwos.findSum(a,ar);

            // now doing operations 
            for(int i=0; i<q; i++){
                int t1 = sc.nextInt();
                if(t1 == 2){
                    int t2 = sc.nextInt();
                    int t3 = sc.nextInt();
                    // performing operation 
                    a[t2-1] = t3;
                    OneAndTwos.findSum(a,ar);
                    continue;
                }
                
                int t2 = sc.nextInt();
                int flag = 0;
                for(int j=0; j<ar.size(); j++){
                    int rem = ar.get(j) - t2;
                    if(ar.get(j) == t2 || ar.contains(rem)){
                        flag = 1;
                        System.out.println("YES");
                        break;
                    }
                }

                if(flag == 0) System.out.println("NO");
            }
        }

    }

    static void findSum(int[] a, ArrayList<Integer> ar){
        ar.clear();
        int sum = 0;
        ar.add(0);
        for(int j=0; j<a.length; j++){
            sum += a[j];
            ar.add(sum);
        }
    }

}

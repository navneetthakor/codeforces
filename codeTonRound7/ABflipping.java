import java.util.Scanner;

public class ABflipping{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size;
        size = sc.nextInt();

        for(int index=0; index<size; index++){
            int n = sc.nextInt();
            String s = sc.next();

            int tot =0;
            int pastA = 0;
            for(int i=0; i<n; i++){
                if(s.charAt(i) == 'B'){
                    tot += pastA;
                    if(pastA != 0) pastA=1;
                    else pastA = 0;
                }else{
                    pastA++;
                }
            }

            System.out.println(tot);
        }

    }
}

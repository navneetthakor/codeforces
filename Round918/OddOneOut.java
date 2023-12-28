import java.util.Scanner;

public class OddOneOut {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        for(int index=0; index<size; index++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int t = a^b^c;
            System.out.println(t);
        }
    }
}

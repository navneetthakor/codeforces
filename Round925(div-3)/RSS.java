import java.util.Scanner;

public class RSS {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        for(int index=0; index<size; index++){
            int n = sc.nextInt();

            if(n>52){
                char c = (char)(96 + (n-52));
                System.out.print(c);
                System.out.print("zz");
                System.out.println();
            } 
            
            else if(n>27){

                System.out.print("a");
                char c = (char)(96 + (n-27));
                System.out.print(c);
                System.out.print("z");
                System.out.println();
            }

            else {
                System.out.print("aa");
                char c = (char)(96 + (n-2));
                System.out.println(c);
            }


        }
    }
}

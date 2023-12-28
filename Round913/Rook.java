import java.util.Scanner;

public class Rook{
    public static void main(String args[]){
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        for(int index=0; index<size; index++){
            String s = sc.next();

            char a = s.charAt(0);
            int b = s.charAt(1);

            for(int i=1; i<=8; i++){
                if((b-48) != i)
                System.out.println(String.valueOf(a) + String.valueOf(i));
            }

            for(int i=97; i<=104; i++){
                if(a != (char)i)
                    System.out.println(String.valueOf((char)i) + String.valueOf(s.charAt(1)));
            }
        }
    }
}
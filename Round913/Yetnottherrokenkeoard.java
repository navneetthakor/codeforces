import java.util.Scanner;

public class Yetnottherrokenkeoard {

    public static void main(String args[]) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        for (int index = 0; index < size; index++) {
            String s = sc.next();
            String newS = "";
            String cap = "";
            String small = "";

            for (int i = 0; i < s.length(); i++) {

                if(s.charAt(i) == 'B'){
                    if(cap.length() == 1 || cap.length() == 0) cap = "";
                    else cap = cap.substring(0, cap.length()-2);
                }
                else if(s.charAt(i) == 'b'){
                    if(small.length() == 1 || small.length() == 0) small = "";
                    else small = small.substring(0, small.length()-2);
                }
                else{
                    if(s.charAt(i) > 96) small += s.charAt(i);
                    else cap += s.charAt(i);
                }

                // if (s.charAt(i) == 'B') {
                //     int temp=1;
                //     String dummy = "";
                //     for (int j = newS.length()-1; j > -1; j--) {
                //         if (newS.charAt(j) < 95 && temp == 1)
                //             temp = 0;
                //         else{
                //             dummy += newS.charAt(j);
                //         }
                //     }

                //     newS = new StringBuilder(dummy).reverse().toString();
                //     // for(int j=dummy.length()-1; j>-1; j--){
                //     //     newS += dummy.charAt(j);
                //     // }

                // } else if (s.charAt(i) == 'b') {
                //    int temp=1;
                //     String dummy = "";
                //     for (int j = newS.length()-1; j > -1; j--) {
                //         if (newS.charAt(j) > 96 && temp == 1)
                //             temp = 0;
                //         else{
                //             dummy += newS.charAt(j);
                //         }
                //     }

                //     newS = new StringBuilder(dummy).reverse().toString();
                //     // for(int j=dummy.length()-1; j>-1; j--){
                //     //     newS += dummy.charAt(j);
                //     // }


                // } else {
                //     newS += String.valueOf(s.charAt(i));
                // }
            }
            System.out.println(cap+small);

        }

    }
}

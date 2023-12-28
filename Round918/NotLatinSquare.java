import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NotLatinSquare {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        for(int index=0; index<size; index++){
            String a[] = new String[3];
            a[0] = sc.next();
            a[1] = sc.next();
            a[2] = sc.next();
            int[] ans = new int[3];
            Arrays.fill(ans, 0);

            boolean flag = true;

            for(int i=0; i<3; i++){
                if (flag) {
                    for(int j=0; j<3; j++){
                        if (a[i].charAt(j) == '?' ) {
                            for(int k=0; k<3; k++){
                                if (k == i) {
                                    continue;
                                }
                                if (a[k].charAt(j) == 'A') ans[0]++;
                                else if (a[k].charAt(j) == 'B') ans[1]++;
                                else ans[2]++;
                            }
                            flag = false;
                            break;
                        }
                    }
                }
                else break;
                
            }

            for(int i=0; i<3; i++){
                if (ans[i] == 0) {
                    char c = (char) ('A' + i);
                    System.out.println(c);
                    break;
                }
            }
        }
    }
}

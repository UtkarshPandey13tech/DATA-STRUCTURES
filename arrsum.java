import java.util.*;

public class arrsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int i, sum = 0, a[] = new int[size];
        System.out.println(" Enter " + size + " elements");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sum = 0;
        for (i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(" Sum of all elemnets of arrays is:" + sum);
    }
}
// output
/* C:\Users\ankur\OneDrive\Desktop\Javanote>java arrsum
5
 Enter 5 elements
5
7
8
9
2
 Sum of all elemnets of arrays is:31 */
//sort by predefined classes in asc and dsc
import java.util.*;
class array10{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i , a[] = new int[n];
System.out.println("enter " +n+ " element: " );
for(i=0; i<n;i++){
 a[i] = sc.nextInt();
}
System.out.println("array element before sorting:");
for(i=0; i<n;i++){
System.out.print(a[i] + " ");
}
Arrays.sort(a);
System.out.println();
System.out.println(" array element after sorting in asc:");
for(i=0; i<n;i++){
System.out.print(a[i] + " ");
}
System.out.println();
System.out.println("array element before sorting in dsc:");
for(i=0; i<n;i++){
System.out.print(a[i] + " ");
}
Arrays.sort(a);
System.out.println();
System.out.println(" array element after sorting in dsc:");
for(i=n-1; i>=0;i--){
System.out.print(a[i] + " ");
}
}
}

// 1st min 1st max 2nd min 2nd max and so on
import java.util.*;
class array15{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
int i,a[] = new int[s];
System.out.println("enter "+s+ " element");
for(i=0;i<s ; i++){
a[i]= sc.nextInt();
}
Arrays.sort(a);
int low , high;
low =0;
high = s-1;
while(low<=high){
System.out.print(a[low] +" " +a[high]+ " ");
low++;
high--;
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array15.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array15
5
enter 5 element
6
5
9
1
3
1 9 3 6 5 5
*/

//sum of odd elements
import java.util.*;
class array4{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int i,a[] = new int[size];
System.out.println(" Enter "+size+" elements:");
for(i=0;i<a.length;i++){
a[i] = sc.nextInt();
}
int sum =0;
for(i=0;i<a.length;i++){
if(a[i]%2!=0){
sum += a[i];
}
}
System.out.println("sum of even elements of array is "+sum);
}
}
/*
output
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array4.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array4
6
 Enter 6 elements:
1
2
3
4
5
6
sum of even elements of array is 9

*/
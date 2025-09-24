//sum of positive elements
import java.util.*;
class array5{
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
if(a[i]<0){
sum += a[i];
}
}
System.out.println("sum of even elements of array is "+sum);
}
}
/*
output
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array5.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array5
5
 Enter 5 elements:
-1
3
-6
9
-4
sum of even elements of array is -11
*/
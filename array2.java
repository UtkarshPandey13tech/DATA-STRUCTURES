//print even elements
import java.util.*;
class array2{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int i,a[] = new int[size];
System.out.println(" Enter "+size+" elements:");
for(i=0;i<a.length;i++){
a[i] = sc.nextInt();
}
for(i=0;i<a.length;i++){
if(a[i]%2==0){
System.out.println("index" +i+ " a["+i+"] =" +a[i]);
}
}
}
}
/*
output
C:\Users\ankur\OneDrive\Desktop\Javanote>java array2
6
 Enter 6 elements:
1
2
3
4
5
6
index1 a[1] =2
index3 a[3] =4
index5 a[5] =6 
*/
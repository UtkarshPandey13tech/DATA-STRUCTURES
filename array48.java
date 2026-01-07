//pattern for array right rotation
import java.util.*;
class array48{
public static void main (String [] args){
Scanner sc= new Scanner (System.in);
System.out.println("enter the size of array:");
int s = sc.nextInt();
int a[] = new int[s];
System.out.println("enter the array element:");
for(int i=0;i<s;i++){
a[i]=sc.nextInt();
}
System.out.println("enter the no. of rotations :");
int r = sc.nextInt();
a= demo.rotateright(a,r);
System.out.println("array element are:"+Arrays.toString(a));
}


class demo{
public static int[]  rotateright(int a [] , int r){
int prev , temp, i , j;
for(i=0;i<r;i++){
prev = a[a.length-1];
for(j=0; j<a.length;j++){
temp = a[j];
a[j]=prev;
prev = temp;
}
}
return a;
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array48.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array48
enter the size of array:
5
enter the array element:
1
2
3
4
5
enter the no. of rotations :
1
array element are:[5, 1, 2, 3, 4]
*/

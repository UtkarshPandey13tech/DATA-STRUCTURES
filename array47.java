//pattern for array left rotation
import java.util.*;
class array47{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array:");
int s = sc.nextInt();
int a[] = new int[s];
System.out.println("enter the array element:");
for(int i=0;i<s;i++){
a[i]=sc.nextInt();
}
System.out.println("enter the no. of rotations :");
int r = sc.nextInt();
a= demo.rotateleft(a,r);
System.out.println("array element are:"+Arrays.toString(a));
}


class demo{
public static int[]  rotateleft(int a [] , int r){
int prev , temp, i , j;
for(i=0;i<r;i++){
prev = a[0];
for(j=a.length-1;j>=0;j--){
temp = a[j];
a[j]=prev;
prev = temp;
}
}
return a ;
}
}
}
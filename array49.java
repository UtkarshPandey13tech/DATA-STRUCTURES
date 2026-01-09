//pattern for array left rotation by temp 
import java.util.*;
class array49{
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
a= demo.rotateleft_temp(a,r);
System.out.println("array element are:"+Arrays.toString(a));
}
class demo{
public static int[] rotateleft_temp(int a[] , int r){
r= r%a.length;
int temp , i , j;
for(i=0;i<r;i++){
temp = a[0];
for(j=0;j<a.length-1;j++){
a[j]=a[j+1];
}
a[a.length-1]=temp;
}
return a;
}
}
}

/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array49.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array49
enter the size of array:
5
enter the array element:
1
2
3
4
5
enter the no. of rotations :
2
array element are:[3, 4, 5, 1, 2]
*/


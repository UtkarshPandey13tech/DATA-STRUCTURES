//pattern for array left rotation by temp method 1 
import java.util.*;
class array51{
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
a= demo.rotateleft_temp_met1(a,r);
System.out.println("array element are:"+Arrays.toString(a));
}
class demo{
static int[] rotateleft_temp_met1(int a[] , int r){
r=r%a.length;
int i,j,n=a.length;
int temp[] = new int[r];
for(i=0;i<r;i++)
temp[i]=a[i];
for(i=r;i<n;i++)
a[i-r]=a[i];
for(i=0;i<r;i++)
a[i+n-r]=temp[i];
return a;
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array51.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array51
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
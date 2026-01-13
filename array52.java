//pattern for array right rotation by temp method 1 
import java.util.*;
class array52{
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
a= demo.rotateright_temp_met1(a,r);
System.out.println("array element are:"+Arrays.toString(a));
}
class demo{
static int[] rotateright_temp_met1(int a[],int r){
r=r%a.length;
int i,j,n=a.length;
int temp[] = new int[r];
for(i=0;i<r;i++)
temp[i]=a[n-r+i];
for(i=n-r-1;i>=0;i--)
a[i+r]=a[i];
for(i=0;i<r;i++)
a[i]=temp[i];
return a;
}
}
}
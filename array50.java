//pattern for array right rotation by temp 
import java.util.*;
class array50{
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
a= demo.rotateright_temp(a,r);
System.out.println("array element are:"+Arrays.toString(a));
}

class demo{
static int[] rotateright_temp(int a[] , int r){
r = r%a.length;
int i,j,temp;
for(i=0;i<r;i++){
 temp = a[a.length-1];
for(j=a.length-1;j>0;j--){
a[j]=a[j-1];
}
a[0]=temp;
}
return a;
}
}
}

/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array50.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array50
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
array element are:[4, 5, 1, 2, 3]
*/

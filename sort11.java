// shell sort asc
import java.util.*;
class sort11{
public static void main(String [] args){
Random r = new Random();
int a[] = new int[10];
for(int i=0;i<a.length;i++){
a[i]=r.nextInt(100);
}
System.out.println("Array element before sorting:"+Arrays.toString(a));
demo.shellSort(a,a.length);
System.out.println("Array element after sorting:"+Arrays.toString(a));
}
class demo{
static void shellSort(int a[] , int n){
int i,j,temp,gap;
for(gap=n/2;gap>=1;gap=gap/2){
for(j=gap;j<n;j++){
for(i=j-gap;i>=0;i=i-gap){
if(a[i+gap]>a[i])
break;
else
temp=a[i+gap];
a[i+gap]=a[i];
a[i]=temp;
}
}
}
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac sort11.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java sort11
Array element before sorting:[95, 76, 17, 86, 13, 77, 0, 68, 96, 93]
Array element after sorting:[0, 13, 17, 68, 76, 77, 86, 93, 95, 96]
*/

// shell sorting desc
import java.util.*;
class sort12{
public static void main(String [] args){
Random r = new Random();
int a[] = new int[10];
for(int i=0;i<a.length;i++){
a[i]=r.nextInt(100);
}
System.out.println("Array element before sorting :"+Arrays.toString(a));
demo.shellSort_desc(a,a.length);
System.out.println("Array element after sorting:"+Arrays.toString(a));
}
class demo{
static void shellSort_desc(int a[] , int n){
int i , j,temp , gap;
for(gap=n/2;gap>=1;gap=gap/2){
for(j=gap;j<n;j++){
for(i=j-gap;i>=0;i=i-gap){
if(a[i+gap]<a[i])
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
C:\Users\ankur\OneDrive\Desktop\Javanote>javac sort12.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java sort12
Array element before sorting :[38, 38, 48, 35, 14, 16, 88, 22, 96, 51]
Array element after sorting:[96, 88, 51, 48, 38, 38, 35, 22, 16, 14]
*/
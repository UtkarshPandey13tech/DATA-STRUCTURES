// merge sort asc
import java.util.*;
class sort9{
public static void main (String [] args){
Random r = new Random();
int a[] = new int[10];
for(int i=0;i<a.length;i++){
a[i]= r.nextInt(100);
}
System.out.println("Array element before sorting :"+Arrays.toString(a));
demo.mergeSort_asc(a,a.length);
System.out.println("Array element After sorting:"+Arrays.toString(a));
}
class demo{
static void mergeSort_asc(int a[] , int n){
if(n<2) // to end the loop
return;
int i , mid = n/2;
int[] l = new int[mid];
int[] r = new int[n-mid];
for(i=0;i<mid;i++)
l[i]=a[i];
for(i=mid;i<n;i++)
r[i-mid]=a[i];
mergeSort_asc(l,mid);
mergeSort_asc(r,n-mid);
merge(a,l,r,mid,n-mid);
}
static void merge(int[] a , int[] l,int[] r, int left , int right){
int i=0,j=0,k=0;
while(i<left && j<right){
if(l[i] <= r[j])
a[k++]=l[i++];
else
a[k++] = r[j++];
}
while(i<left)
a[k++]=l[i++];
while(j<right)
a[k++]=r[j++];
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac sort9.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java sort9
Array element before sorting :[47, 61, 42, 66, 41, 30, 74, 95, 35, 67]
Array element After sorting:[30, 35, 41, 42, 47, 61, 66, 67, 74, 95]
*/

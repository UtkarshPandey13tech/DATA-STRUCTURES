// merge sort desc
import java .util.*;
class sort10{
public static void main (String [] args){
Random r = new Random();
int a[] = new int [10];
for(int i=0;i<a.length;i++){
a[i]=r.nextInt(100);
}
System.out.println("Array element before sorting :"+Arrays.toString(a));
demo.mergeSort_desc(a,a.length);
System.out.println("Array element after sorting :" +Arrays.toString(a));
}
class demo{
static void mergeSort_desc(int a[], int n){
if(n<2) // to end the loop
return;
int i , mid = n/2;
int[] l = new int[mid];
int[] r = new int[n-mid];
for(i=0;i<mid;i++)
l[i]=a[i];
for(i=mid;i<n;i++)
r[i-mid]=a[i];
mergeSort_desc(l,mid);
mergeSort_desc(r,n-mid);
merge(a,l,r,mid,n-mid);
}
static void merge(int[] a , int[] l,int[] r, int left , int right){
int i=0,j=0,k=0;
while(i<left && j<right){
if(l[i] >= r[j])
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
C:\Users\ankur\OneDrive\Desktop\Javanote>javac sort10.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java sort10
Array element before sorting :[76, 62, 31, 35, 69, 82, 71, 93, 49, 10]
Array element after sorting :[93, 82, 76, 71, 69, 62, 49, 35, 31, 10]
*/
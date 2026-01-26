//insertion sort descending order
import java.util.*;
class sort6{
public static void main(String args[]){
Random r = new Random();
int a[] = new int[5];
for(int i=0;i<a.length;i++){
a[i]=r.nextInt(100);
}
System.out.println("Array element before sorting :"+Arrays.toString(a));
demo.insertion_sort_desc(a);
System.out.println("Array element after Sorting:" +Arrays.toString(a));
}
class demo{
static void insertion_sort_desc(int a[]){
int i ,j,temp , n=a.length;
for(i=0;i<n;i++){
temp=a[i];
j=i-1;
while(j>=0 && a[j]<temp){
a[j+1]=a[j];
j--;
}
a[j+1]=temp;
}
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac sort6.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java sort6
Array element before sorting :[91, 95, 36, 20, 95]
Array element after Sorting:[95, 95, 91, 36, 20]
*/
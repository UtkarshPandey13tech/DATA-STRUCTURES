// insertion sort ascending order
import java.util.*;
class sort5{
public static void main(String [] args){
Random r= new Random();
int a[] = new int[5];
for(int i=0;i<a.length;i++){
a[i]=r.nextInt(100);
}
System.out.println("Array elemnent before sorting :"+Arrays.toString(a));
demo.insertion_sort_asc(a);
System.out.println("Array element after sorting:"+Arrays.toString(a));
}
class demo{
static void insertion_sort_asc(int a[]){
int i,j,temp,n=a.length;
for(i=0;i<n;i++){
temp =a[i];
j=i-1;
while(j>=0 && a[j]>temp){
a[j+1]=a[j];
j--;
}
a[j+1]=temp;
}
}
}
}

/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac sort5.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java sort5
Array elemnent before sorting :[48, 56, 34, 27, 97]
Array element after sorting:[27, 34, 48, 56, 97]

*/
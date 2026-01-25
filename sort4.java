//selection sort desc order
import java.util.*;
class sort4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array:");
int s = sc.nextInt();
int a[] = new int[s];
System.out.println("enter the array elements:");
for(int i=0;i<s;i++){
a[i]=sc.nextInt();
}
System.out.println("Array element before sorting:"+Arrays.toString(a));
demo.selection_sort_desc(a);
System.out.println("Array element after sorting:"+Arrays.toString(a));
}
class demo{
static void selection_sort_desc(int a[]){
int i,j,temp , min , n=a.length;
for(i=0;i<n-1;i++){
min = i;
for(j=i+1;j<n;j++){
if(a[j]>a[min]){
min =j;
}
}
if(min!=i){
temp=a[i];
a[i]=a[min];
a[min]=temp;
}
}
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac sort4.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java sort4
enter the size of array:
5
enter the array elements:
3
2
5
1
9
Array element before sorting:[3, 2, 5, 1, 9]
Array element after sorting:[9, 5, 3, 2, 1]
*/
//sorting by selection sort asc order
import java.util.*;
class sort3{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array:");
int s= sc.nextInt();
int a[]=new int[s];
System.out.println("enter the element of array:");
for(int i=0;i<s;i++){
a[i]=sc.nextInt();
}
System.out.println("Array element before sorting:"+Arrays.toString(a));
demo.selection_sort_asc(a);
System.out.println("Array Element After Sorting :"+Arrays.toString(a));
}
class demo{
static void selection_sort_asc(int a[] ){
int i ,j,temp , n=a.length;
for(i=0;i<n-1;i++){
int min=i;
for(j=i+1;j<n;j++){
if(a[j]<a[min]){
min=j;
}
}
if(min !=i){
temp=a[i];
a[i]=a[min];
a[min]=temp;
}
}
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac sort3.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java sort3
Enter the size of array:
5
enter the element of array:
2
3
1
6
4
Array element before sorting:[2, 3, 1, 6, 4]
Array Element After Sorting :[1, 2, 3, 4, 6]
*/



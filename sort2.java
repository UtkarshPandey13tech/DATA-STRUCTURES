//sorting by bubble sort in desc order

import java.util.*;
class sort2{
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
System.out.println("enter the size of array :");
int s = sc.nextInt();
int a[] = new int[s];
System.out.println("enter the element of array :");
for(int i=0;i<s;i++){
a[i] = sc.nextInt();
}
System.out.println("Array element before sorting:" +Arrays.toString(a));
demo.sort_desc(a);
System.out.println("Array element After Sorting:" +Arrays.toString(a));

}
class demo{
static void sort_desc(int a[]){
for(int i=0;i<a.length;i++){
for(int j=0;j<a.length-i-1;j++){
if(a[j]<a[j+1]){
int t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
}
}
}

/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac sort2.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java sort2
enter the size of array :
5
enter the element of array :
2
1
4
3
9
Array element before sorting:[2, 1, 4, 3, 9]
Array element After Sorting:[9, 4, 3, 2, 1]
*/
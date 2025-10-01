// binary search 
import java.util.*;
class array18{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array");
int n = sc.nextInt();
int i , a[] = new int[n];
System.out.println("enter "+n+" element");
for(i=0;i<n;i++){
a[i]= sc.nextInt();
}


Arrays.sort(a);
System.out.println("sorted elements");
for(int j=0;j<n;j++){
System.out.print(a[j] +" ");
}
System.out.println();
System.out.println("enter the element for search");
int key = sc.nextInt();
System.out.println("element " +key+ " found at index");
System.out.println(test.binarysearch(a,key));

}

class test{
static int binarysearch(int a[], int key){
int l=0,h=a.length-1,mid;
 while(l<=h){
 mid = (l+h)/2;
 if(a[mid]==key){
return mid;
}
else if(a[mid]<key){
 l= mid+1;
}
else{
h=mid-1;
}
}
return -1;
}
}
}
/*

C:\Users\ankur\OneDrive\Desktop\Javanote>javac array18.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array18
enter the size of array
5
enter 5 element
6
2
7
8
3
sorted elements
2 3 6 7 8
enter the element for search
6
element 6 found at index
2
*/
// binary search by predefibed 
import java.util.*;
class array23{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array");
int n = sc.nextInt();
int i,a[] = new int[n];
System.out.println("enter " +n+ " element:");
for(i=0;i<n;i++){
a[i]= sc.nextInt();
}
Arrays.sort(a);
System.out.println("sorted array");
for(i=0;i<n;i++){
System.out.print(a[i] +" " );
}
System.out.println();
System.out.println(" enter the element to search ");
int key= sc.nextInt();
int index = Arrays.binarySearch(a,0,a.length,key);
System.out.println("element present at index : " + index);
}
}
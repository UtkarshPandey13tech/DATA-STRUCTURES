//binary search by recursion
import java.util.*;
class array19{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int i,a[] = new int[n];
System.out.println("enter " +n+ " element:");
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.println("sorted array");
for(int j=0;j<n;j++){
System.out.print(a[j] + " ");
}
System.out.println("enter the element for searching");
int key = sc.nextInt();
int index = test.binarys(a,0,a.length-1,key);
if(index == -1){
System.out.println("element is not present in array");
}
else{
System.out.println("index is : " +index);
}
}
class test{
static int binarys(int a[], int l ,int h , int key){
if(l<=h){
int mid =(l+h)/2;
 if(a[mid]==key){
return mid;
}
else if(a[mid]<key){
 return binarys(a,mid+1,h,key);
}
else {
 return binarys(a,l, mid-1,key);
}
}
return -1;
}
}
}


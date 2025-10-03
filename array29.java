//insert element at any location
import java.util.*;
class array29{
public static void main(String [] args){
int a[] ={10,20,30,40,50};
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(test.insertatlocation(a,18,2)));


}
class test{
static int[] insertatlocation(int a[] , int element, int location){
int i , k=0 ,b[] = new int [a.length+1];
for(i=0;i<location;i++){
b[k++]=a[i];
}
b[k++]=element;

for(i=location;i<a.length;i++){
b[k++]=a[i];
}
return b;
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array29.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array29
[10, 20, 30, 40, 50]
[10, 20, 18, 30, 40, 50]
*/
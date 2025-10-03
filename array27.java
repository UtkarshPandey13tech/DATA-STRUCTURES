// insert element at last of array
import java.util.*;
class array27{
public static void main(String [] args){
int a[] = {10,20,30,40,50};
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(test.insertatlast(a,60)));


}

class test{
static int[] insertatlast(int a[] , int element){
int i , b[] = new int [a.length+1];
for(i=0;i<a.length;i++){
b[i]=a[i];
}
b[i]=element;
return b;
}
}
}
/*

C:\Users\ankur\OneDrive\Desktop\Javanote>javac array27.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array27
[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50, 60]
*/
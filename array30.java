//delete element at any location
import java.util.*;
class array30{
public static void main(String [] args){
int a[] ={10,20,30,40,50};
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(test.deleteatlocation(a,0)));
System.out.println(Arrays.toString(test.deleteatlocation(a,1)));
System.out.println(Arrays.toString(test.deleteatlocation(a,2)));
System.out.println(Arrays.toString(test.deleteatlocation(a,3)));
System.out.println(Arrays.toString(test.deleteatlocation(a,4)));

}
class test{ 
static int[] deleteatlocation(int a[] , int location){
int i , k=0, b[] = new int [a.length-1];
for(i=0;i<a.length;i++){
if(i == location){
continue;
}
b[k++]=a[i];
}
return b;
}
}
}
/* C:\Users\ankur\OneDrive\Desktop\Javanote>javac array30.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array30
[10, 20, 30, 40, 50]
[20, 30, 40, 50]
[10, 30, 40, 50]
[10, 20, 40, 50]
[10, 20, 30, 50]
[10, 20, 30, 40]
*/

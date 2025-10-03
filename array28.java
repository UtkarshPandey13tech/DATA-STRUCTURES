//insert at beginning
import java.util.*;
class array28{
public static void main(String [] args){
int a[] ={10,20,30,40,50};
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(test.insertatfirst(a,5)));


}
class test{
static int [] insertatfirst(int a[] , int element){
int i , b[] =new int[a.length+1];
b[0]=element;
for(i=0;i<a.length;i++){
b[i+1]=a[i];
}
return b;
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array28.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array28
[10, 20, 30, 40, 50]
[5, 10, 20, 30, 40, 50]
*/
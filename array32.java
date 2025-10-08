//remove an element from array
import java.util.*;
class array32{
public static void main(String [] args){
int a [] ={1,2,3,4,5};
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(test.deleteelement(a,5)));

}

class test {
static int[] deleteelement(int a[] , int element){
int index = -1, i , k=0 ;
for(i=0;i<a.length;i++){
if(a[i]==element){
index =i;
break;
}
}
if(index != -1){
int b[] = new int [a.length -1];
for(i=0;i<a.length ; i++){
if(i == index){
continue;
} 
b[k++]=a[i];
}
return b;
}
return a;

}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array32.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array32
[1, 2, 3, 4, 5]
[1, 2, 3, 4]

*/
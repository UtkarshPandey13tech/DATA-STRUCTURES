// program to search an element in an array linear search
import java.util.*;
class array17{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
int i , a[]=new int[s];
System.out.println("enter "+s+" element");
for(i=0;i<s;i++){
a[i]=sc.nextInt();
}
System.out.println("enter the element to search");
int key = sc.nextInt();
int index=-1;
for(i=0;i<s;i++){
if(key==a[i]){
index=i;
}
}
System.out.println("element found at index :"+index);
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array17.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array17
5
enter 5 element
6
8
1
9
18
enter the element to search
1
element found at index :2 
*/
//linear search for searching element's first occurance
import java.util.*;
class Demo{
static int linearSearch(int a[] , int key){
 int i,index =-1;
 for(i=0;i<a.length;i++){
    if(key==a[i]){
       index = i;
         break;
}
}
return index;
}
}

class lin_search_1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a[] ={10,3,2,11,5,8,7,11,3,3,5,14};
System.out.println(Arrays.toString(a));
System.out.println("Enter the element you want to search:");
int key = sc.nextInt();
System.out.println(Demo.linearSearch(a,key));
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac lin_search_1.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java lin_search_1
[10, 3, 2, 11, 5, 8, 7, 11, 3, 3, 5, 14]
Enter the element you want to search:
3
1
*/
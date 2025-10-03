// without predefined methods
import java.util.*;
class array26{
public static void main(String [] args){
System.out.println(test.equal(new int[] {1,2,3},new int[] {1,2,3}));
System.out.println(test.equal(new int[] {1,2,3},new int[] {3,2,1}));
int a[] ={1,2,3};
int b[]= {3,2,1};
Arrays.sort(a);
Arrays.sort(b);
System.out.println(test.equal(a,b));

}
}

class test{
static Boolean equal(int a[] , int b[]){
for(int i=0;i<a.length;i++){
if(a[i] != b[i]){
return false;
}
}
return true;
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array26.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array26
true
false
true 
*/
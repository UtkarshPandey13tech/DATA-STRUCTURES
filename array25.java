// equal two arrays with predefined methods
import java.util.*;
class array25{
public static void main(String [] args){
int a[] = {1,2,3};
int b[] = {3,2,1};
System.out.println(Arrays.equals( a, b));
Arrays.sort(a);
Arrays.sort(b);
System.out.println(Arrays.equals(a,b));
}
}
/*

C:\Users\ankur\OneDrive\Desktop\Javanote>javac array25.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array25
false
true
*/
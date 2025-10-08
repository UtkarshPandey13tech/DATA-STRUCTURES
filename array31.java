//delete all elements in an array
import java.util.*;
class array31{
public static void main(String [] args){
int a[] = {10,20,30,40,50};
System.out.println(Arrays.toString(a));
System.out.println(Arrays.toString(test.deleteall(a)));


}

class test {
static int[] deleteall(int a[]){
//int b[] = new int [0]; 
//return b;
//we can do like this also 
a = new int[0];
return a;

}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array31.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array31
[10, 20, 30, 40, 50]
[]
*/
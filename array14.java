// 3rd MAX and 3rd min
import java.util.*;
class array14{
public static void main(String [] args){

int a[] = {4,5,2,3,1,6};
int s = a.length;
Arrays.sort(a);
int thirdmax =a[s-3];
int thirdmin = a[2];
System.out.print("3rd max is" +thirdmax);
System.out.println();
System.out.print("3rd min is" +thirdmin);
}
}
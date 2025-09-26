// max and min element
import java.util.*;
class array6{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int i, min , max, a[] = new int[size];
System.out.println("enter"+size+"element :");
for(i=0;i<a.length;i++){
a[i] = sc.nextInt();
}
max=a[0];
for(i=1;i<a.length;i++){
if(max<a[i]){
max = a[i];
}
}
System.out.println("max = " +max);
min=a[0];
for(i=1;i<a.length;i++){
if(min>a[i]){
min = a[i];
}
}
System.out.println("min = " +min);
}
}
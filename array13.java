//2nd max and 2nd min
import java.util.*;
class array13{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int s= sc.nextInt();
int max , min , i , a[]= new int[s];
System.out.println("Enter "+s+ " Elements:");
for(i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
max=a[0];
for(i=1;i<a.length;i++){
if(max<a[i] ){

  max = a[i];
}
}
Integer secondMax = Integer.MIN_VALUE ;// we cannot assign null ans int we have to write Integer
for ( i = 0; i < s; i++) {
if (a[i] != max && a[i] > secondMax) {
secondMax = a[i];
}
}
System.out.print("2nd max is " +secondMax);

System.out.println();
min=a[0];
for(i=1;i<a.length;i++){
if(min>a[i] ){

  min = a[i];
}
}
Integer secondMin = Integer.MAX_VALUE ;// we cannot assign null ans int we have to write Integer
for ( i = 0; i < s; i++) {
if (a[i] != min && a[i]  <secondMin) {
secondMin = a[i];
}
}
System.out.print("2nd min is " +secondMin);

}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array13.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array13
5
Enter 5 Elements:
7
6
1
2
9
2nd max is 7
2nd min is 2
*/
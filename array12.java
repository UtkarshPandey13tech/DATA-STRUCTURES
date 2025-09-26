import java.util.*;
class array12{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
char t ,a[] = s.toCharArray();
for(int i=0; i<a.length;i++){
for(int j = i+1; j<a.length; j++){
if(a[i]>a[j]){
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("For ascending order");
System.out.print(new String(a));
for(int i=0; i<a.length;i++){
for(int j = i+1; j<a.length; j++){
if(a[i]<a[j]){
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println();
System.out.println("For descending order");
System.out.print(new String(a));
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array12.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array12
6389-=utkarshpandey
For ascending order
-3689=aadehknprstuy
For descending order
yutsrpnkhedaa=9863-
*/
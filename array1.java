import java.util.*;
class array1{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int i,a[] = new int[size];
System.out.println(" Enter "+size+" elements:");
for(i=0;i<a.length;i++){
a[i] = sc.nextInt();
}
for(i=0;i<a.length;i++){
System.out.println("index" +i+ " a["+i+"] =" +a[i]);
}
}
}
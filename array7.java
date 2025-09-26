//replece old element from new element
import java.util.*;
class array7{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int i,a[] = new int[size];
System.out.println("enter " +size+ " elements");
for(i=0;i<a.length;i++){
a[i]= sc.nextInt();
}
System.out.println("array elements before update:");
for(i=0;i<a.length;i++){
System.out.print(a[i] +" ");
}
System.out.println();
int olde,newe;
System.out.println("enter old element :");
olde = sc.nextInt();
System.out.println(" enter new element:");
newe = sc.nextInt();
for(i=0;i<a.length;i++){
if(olde==a[i]){
a[i]= newe;
}
}
System.out.println("array element after update:");
for(i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
}
}
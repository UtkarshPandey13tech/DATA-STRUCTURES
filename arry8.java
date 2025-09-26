// replace index with new element
import java.util.*;
class arry8{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
int size = sc.nextInt();
int i , a[] =new int[ size];
System.out.println(" enter " +size+ " element :");
for(i=0;i<a.length; i++){
a[i] = sc.nextInt();
}
System.out.println(" array before update: ");
for(i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
System.out.println(" enter the index :");
 int index = sc.nextInt();

if( index>=0 && index <a.length){

System.out.println(" enetr the new elment:");
int newe = sc.nextInt();
 a[index] = newe;
}
else{
System.out.println(" array element out of bound");
}
System.out.println(" array after update");
for(i=0;i<a.length;i++){
System.out.print( a[i] +" ");
}
}
}


//program for half asc and half desc
import java.util.*;
class array11{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
int i,j,t, a[] = new int[s];
System.out.println("enter "+s+ " elements:");
for(i=0;i<s;i++){
a[i]=sc.nextInt();
}
System.out.println("Array element before sorting: ");
for(i=0;i<s;i++){
System.out.print(a[i] + " ");
}
//Arrays.sort(a,0,n/2);
//Arrays.sort(a,n/2,n);
for(i=0;i<s/2;i++){
for(j=i+1;j<s/2;j++){
if(a[i]>a[j]){
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
for(i=s/2;i<s;i++){
for(j=i+1;j<s;j++){
if(a[i]<a[j]){
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println();
System.out.println("array after sorting :");
for(i=0;i<s;i++){
System.out.print(a[i] +" ");
}
}
}





 

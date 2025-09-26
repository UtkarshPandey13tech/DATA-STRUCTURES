// sort array in asc and dsc  order
import java.util.*;
class array9{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int i,j,t,a[] = new int[n];
System.out.println("enter " +n+ " element");
for(i=0;i<n;i++){
a[i] = sc.nextInt();
}
System.out.println(" array element before sorting in asc:");
for(i=0;i<n;i++){
System.out.print(a[i]+" ");
}
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
  if(a[i]>a[j]){
     t=a[i];
    a[i]=a[j];
     a[j]=t;
    }
} 
}
System.out.println();
System.out.println("array element after sorting asc");
for(i=0;i<n;i++){
System.out.print( a[i] + " ");
}
System.out.println();
System.out.println(" array element before sorting in dsc:");
for(i=0;i<n;i++){
System.out.print(a[i]+" ");
}
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
  if(a[i]<a[j]){
     t=a[i];
    a[i]=a[j];
     a[j]=t;
    }
} 
}
System.out.println();
System.out.println("array element after sorting dsc");
for(i=0;i<n;i++){
System.out.print( a[i] + " ");
}

}
}

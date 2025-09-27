// print array in wave form
import java.util.*;
class array16{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int s= sc.nextInt();
int i,t,a[] = new int[s];
System.out.println("enter " +s+ " element");
for(i=0;i<s;i++){
a[i]=sc.nextInt();
}
Arrays.sort(a);

System.out.print(a[0]+ " ");
for(i=1;i<s-1;i=i+2)
{
t=a[i];
a[i]=a[i+1];
a[i+1]=t;
System.out.print(a[i] + " " +a[i+1]+" ");
}
if(s%2==0){
System.out.print(a[i]);
}
}
}
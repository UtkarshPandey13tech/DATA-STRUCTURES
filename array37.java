// prog for read and calculate sum of all even elements  present in an array
import java.util.*;
class array37{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the row size of matrix");
int rs = sc.nextInt();
System.out.println("enter the col size of matrix");
int cs = sc.nextInt();
int i , j , sum , a[][] = new int [rs][cs];
System.out.println("enter the matrix element ");
for(i=0;i<rs; i++){
for(j=0;j<cs;j++){
a[i][j] = sc.nextInt();
}
}
sum =0;
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
if(a[i][j]%2==0){
sum += a[i][j];
}
}
}
System.out.println("sum of all elemnt of matrix is:"+sum);
}
}
// prog for read and calculate  col wise sum of elements  present in an array
import java.util.*;
class array39{
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
for(i=0;i<rs;i++){
sum =0;
for(j=0;j<cs;j++){
sum += a[j][i];
}
System.out.println("sum of "+i+" column is:"+sum);

}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array39.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array39
enter the row size of matrix
3
enter the col size of matrix
3
enter the matrix element
1 2 3
4 5 6
7 8 9
sum of 0 column is:12
sum of 1 column is:15
sum of 2 column is:18
*/
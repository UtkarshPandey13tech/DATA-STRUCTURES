//program, for multiplication of matrix
import java.util.*;
class array35{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of row element of A matrix");
int rs1 = sc.nextInt();
System.out.println("enter the size of  column element of A matrix ");
int cs1= sc.nextInt();
System.out.println("enter the size of row element of B matrix");
int rs2 = sc.nextInt();
System.out.println("enter the size of column elment of b matrix");
int cs2 = sc.nextInt();
if(rs1==cs2){
int i,j ,k;
int a[][] = new int [rs1][cs1];
int b[][] = new int [rs2][cs2];
int c[][] = new int [rs1][cs1];
System.out.println("enter matrix A element one by one");
for(i=0;i<rs1;i++){
for(j=0;j<cs1;j++){
a[i][j]=sc.nextInt();
}
}
System.out.println("enter matrix B element one by one ");
for(i=0;i<rs2;i++){
for(j=0;j<cs2;j++){
b[i][j]= sc.nextInt();
}
}
for(i=0;i<rs1;i++){
for(j=0;j<cs2;j++){
c[i][j]= 0;
for(k=0;k<cs1;k++){
c[i][j] = c[i][j] + (a[i][k] *b[k][j]);
}
}
}
System.out.println(" matrix A element ");
for(i=0;i<rs1;i++){
for(j=0;j<cs1;j++){
 System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("matrix B element: ");
for(i=0;i<rs2;i++){
for(j=0;j<cs2;j++){
System.out.print(b[i][j]+" ");
}
System.out.println();
}
System.out.println(" multiplication of both matrix are :");
for(i=0;i<rs1;i++){
for(j=0;j<cs2;j++){
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
else 
{
System.out.println("the matrix cannot be added");
}
}
}
/*

C:\Users\ankur\OneDrive\Desktop\Javanote>javac array35.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array35
enter the size of row element of A matrix
3
enter the size of  column element of A matrix
3
enter the size of row element of B matrix
3
enter the size of column elment of b matrix
3
enter matrix A element one by one
1
2
3
4
5
6
7
8
9
enter matrix B element one by one
1
0
0
0
1
0
0
0
0
 matrix A element
1 2 3
4 5 6
7 8 9
matrix B element:
1 0 0
0 1 0
0 0 0
 multiplication of both matrix are :
1 2 0
4 5 0
7 8 0
*/
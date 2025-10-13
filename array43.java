//program to swap two column
import java.util.*;
class array43{
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
System.out.println("enter the size of row:");
int rs = sc.nextInt();
System.out.println("enter the size of column :");
int cs = sc.nextInt();
int a[][] = new int [rs][cs];
int i, j , n ,m , t;
System.out.println("enter the matrix element :");
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
 a[i][j]=sc.nextInt();
}
}
System.out.println("enter the value of n and m : ");
n = sc.nextInt();
m = sc.nextInt();

System.out.println("element before swapping :");
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
System.out.print(a[i][j] +" ");
}
System.out.println();
}

for(i=0;i<cs;i++){
t= a[i][n-1];
a[i][n-1] = a[i][m-1];
a[i][m-1] = t;
}
System.out.println("element after swapping :");
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
System.out.print(a[i][j] + " ");
}
System.out.println();
}
}
}
/*

C:\Users\ankur\OneDrive\Desktop\Javanote>javac array43.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array43
enter the size of row:
3
enter the size of column :
3
enter the matrix element :
1 2 3
4 5 6
7 8 9
enter the value of n and m :
1
3
element before swapping :
1 2 3
4 5 6
7 8 9
element after swapping :
3 2 1
6 5 4
9 8 7

*/

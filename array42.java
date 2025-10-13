// program to swap the matrix
import java.util.*;
class array42{
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
t= a[n-1][i];
a[n-1][i] = a[m-1][i];
a[m-1][i] = t;
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
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array42.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array42
enter the size of row:
3
enter the size of column :
3
enter the matrix element :
1 2 3
4 5 6
7 8 9
enter the value of n and m :
2
1
element before swapping :
1 2 3
4 5 6
7 8 9
element after swapping :
4 5 6
1 2 3
7 8 9
*/
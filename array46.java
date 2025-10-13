// program to interchange diagonal elements
import java.util.*;
class array46 {
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of row: ");
int rs = sc.nextInt();
System.out.println("enter the size of column : ");
int cs = sc.nextInt();
int a[][]= new int[rs][cs];
int i , j, t;
System.out.println("enter the matrix element :");
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
a[i][j]= sc.nextInt();
}
}
System.out.println("array element before swapping ");
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
System.out.print(a[i][j] + " ");
}
System.out.println();
}
for(i=0;i<rs;i++){
t=a[i][i];
a[i][i]=a[i][rs-1-i];
a[i][rs-1-i]=t;
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
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array46.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array46
enter the size of row:
3
enter the size of column :
3
enter the matrix element :
4 3 2
5 6 7
9 8 1
array element before swapping
4 3 2
5 6 7
9 8 1
element after swapping :
2 3 4
5 6 7
1 8 9
*/
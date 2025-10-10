// prog for finding transpose of matrix in an array
import java.util.*;
class array40{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the row size of matrix");
int rs = sc.nextInt();
System.out.println("enter the col size of matrix");
int cs = sc.nextInt();
int i , j , a[][] = new int [rs][cs];
int trans[][] = new int [cs][rs];
System.out.println("enter the matrix element ");
for(i=0;i<rs; i++){
for(j=0;j<cs;j++){
a[i][j] = sc.nextInt();
}
}
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
 trans[i][j] = a[j][i];
}
}
System.out.println("the original matrix element");
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
System.out.print(a[i][j] +" ");
}
System.out.println();
}
System.out.println("transpose matrix elements are");
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
System.out.print(trans[i][j] + " ");
}
System.out.println();
}
}
}
/*

C:\Users\ankur\OneDrive\Desktop\Javanote>javac array40.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array40
enter the row size of matrix
3
enter the col size of matrix
3
enter the matrix element
1 2 3
4 5 6
7 8 9
the original matrix element
1 2 3
4 5 6
7 8 9
transpose matrix elements are
1 4 7
2 5 8
3 6 9
*/
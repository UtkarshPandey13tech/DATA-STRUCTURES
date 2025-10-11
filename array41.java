//program to check the matrix is identity or not
import java.util.*;
class demo{
public static boolean isidentity(int a[][] , int n ,int m ){
int i , j;
for(i=0;i<n;i++){
for(j=0;j<m;j++){
if(i!=j && a[i][j] !=0){
return false;
}
else if ( i == j && a[i][j] !=1){
return false;
}
}
}
return true;
}
}

class array41{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of row");
int rs = sc.nextInt();
System.out.println("enter the size of column ");
int cs = sc.nextInt();
int i , j , a[][] = new int[rs][cs];
System.out.println("enter the matrix element : ");
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
a[i][j]= sc.nextInt();
}
}
System.out.println(demo.isidentity(a,rs,cs));
}
}
/*

C:\Users\ankur\OneDrive\Desktop\Javanote>javac array41.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array41
enter the size of row
3
enter the size of column
3
enter the matrix element :
1 2 3
4 5 6
7 8 9
false

C:\Users\ankur\OneDrive\Desktop\Javanote>javac array41.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array41
enter the size of row
3
enter the size of column
3
enter the matrix element :
1 0 0
0 1 0
0 0 1
true
*/


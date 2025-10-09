//read and write matrix element
import java.util.*;
class array33{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter rowsize ");
int rsize = sc.nextInt();
System.out.println(" enter column size ");
int csize = sc.nextInt();

int i,j, a[][] = new int [rsize][csize];
// read element 
System.out.println("enter the matrix element :");
for(i=0; i<rsize;i++){
for(j=0;j<csize;j++){
a[i][j]= sc.nextInt();
}
}
System.out.println(" matrix elements are :");
for(i=0;i<rsize;i++){
System.out.print("[");
for(j=0;j<csize;j++){
System.out.print(a[i][j] +"["+i+"," +j+"]");
}
System.out.println("]");
}
}
}
/*

C:\Users\ankur\OneDrive\Desktop\Javanote>javac array33.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array33
enter rowsize
3
 enter column size
4
enter the matrix element :
1
2
3
4
5
6
7
8
9
0
1
2
 matrix elements are :
[1[0,0]2[0,1]3[0,2]4[0,3]]
[5[1,0]6[1,1]7[1,2]8[1,3]]
[9[2,0]0[2,1]1[2,2]2[2,3]]

*/
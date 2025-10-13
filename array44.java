//sum of diagonal element
import java.util.*;
class array44{
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
System.out.println("enter the size of row :");
int rs = sc.nextInt();
System.out.println("enter the size of colulmn : ");
int cs = sc.nextInt();
int a[][] = new int [rs][cs];
int i,j,s;
System.out.println("enter the array element ");
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
a[i][j]= sc.nextInt();
}
}
s=0;
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
if(i==j){
s +=a[i][j];
}
}
}
System.out.println("sum of diagonal elements are :" +s);
}
}
/*

C:\Users\ankur\OneDrive\Desktop\Javanote>javac array44.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array44
enter the size of row :
3
enter the size of colulmn :
3
enter the array element
1 2 3
4 5 6
7 8 9
sum of diagonal elements are :15
*/
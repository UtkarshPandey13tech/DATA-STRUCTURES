//sum of  opposite diagonal element
import java.util.*;
class array45{
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
s +=a[i][rs-1-i];
}
System.out.println("sum of opposite diagonal elements are :" +s);
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac array45.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java array45
enter the size of row :
3
enter the size of colulmn :
3
enter the array element
3 2 1
8 7 6
9 4 3
sum of opposite diagonal elements are :17
*/
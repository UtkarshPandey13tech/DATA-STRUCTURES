//sorting by bubble sort for asc oreder
import java .util.*;
class sort1{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array :");
int a = sc.nextInt();
int s[] = new int[a];
System.out.println("enter the element of array:");
for(int i =0;i<a;i++){
s[i] = sc.nextInt();
}
System.out.println("Before Sorting:"+Arrays.toString(s));
Demo.bubblesortasc(s);
System.out.println("After Sorting:"+Arrays.toString(s));
}
class Demo{
static void bubblesortasc(int s[]){
int i,j,t;
for(i=0;i<s.length-1;i++){
for(j=0;j<s.length-i-1;j++){ 
if(s[j]>s[j+1]){
t=s[j];
s[j]=s[j+1];
s[j+1]=t;
}
}
}
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac sort1.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java sort1
enter the size of array :
5
enter the element of array:
3
2
6
1
5
Before Sorting:[3, 2, 6, 1, 5]
After Sorting:[1, 2, 3, 5, 6]
*/
//quick sort desc
import java.util.*;
class sort8{
public static void main(String [] args){
Random r = new Random();
int a[] = new int[10];
for(int i=0;i<a.length;i++){
a[i]=r.nextInt(100);
}
System.out.println("Array element bfore sorting:"+Arrays.toString(a));
demo.quickSort_desc(a,0,a.length-1);
System.out.println("Array element after sorting:"+Arrays.toString(a));
}
class demo{
static void quickSort_desc(int a[] , int LIndex , int HIndex){
if(LIndex >= HIndex)// terminate recursion
return;
int pivot , lp , rp , temp;
pivot = a[HIndex];
lp = LIndex;
rp = HIndex;
while(lp<rp){
while(a[lp]>= pivot && lp<rp)
lp++;
while(a[rp]<=pivot && lp<rp)
rp--;
temp = a[lp];
a[lp]=a[rp];
a[rp]=temp;
}
temp = a[lp];
a[lp]=a[HIndex];
a[HIndex]=temp;
quickSort_desc(a,LIndex , lp-1);
quickSort_desc(a,lp+1,HIndex);
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac sort8.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java sort8
Array element bfore sorting:[47, 11, 95, 58, 49, 36, 86, 76, 38, 61]
Array element after sorting:[95, 86, 76, 61, 58, 49, 47, 38, 36, 11]
*/
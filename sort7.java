//quick sort asc
import java.util.*;
class sort7{
public static void main(String [] args){
Random r= new Random();
int a[] = new int[10];
for(int i=0;i<a.length;i++){
a[i]=r.nextInt(100);
}
System.out.println("Array element before sorting:"+Arrays.toString(a));
demo.quickSort_asc(a,0,a.length-1);
System.out.println("Array element after sorting:"+Arrays.toString(a));
}
class demo{
static void quickSort_asc(int a[] , int LIndex , int HIndex){
if(LIndex >= HIndex)
return;
int pivot , lp,rp,temp;
pivot = a[HIndex];
lp = LIndex;
rp = HIndex;
while(lp<rp){
while(a[lp]<=pivot && lp<rp)
lp++;
while(a[rp]>=pivot && lp<rp)
rp--;
temp = a[lp];
a[lp]=a[rp];
a[rp] = temp;
}
temp = a[lp];
a[lp]= a[HIndex];
a[HIndex]=temp;
quickSort_asc(a,LIndex , lp-1);
quickSort_asc(a,lp+1,HIndex);
}
}
}
/*
C:\Users\ankur\OneDrive\Desktop\Javanote>javac sort7.java

C:\Users\ankur\OneDrive\Desktop\Javanote>java sort7
Array element before sorting:[44, 15, 99, 83, 67, 40, 83, 51, 75, 22]
Array element after sorting:[15, 22, 40, 44, 51, 67, 75, 83, 83, 99]

*/
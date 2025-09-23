import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int i,a[] = new int[size];
        System.out.println("enter " +size+ " elements : ");
        for (i =0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array element using  while loop");
        int index =0;
        while (index<a.length){
            System.out.println("index "+index+ " a["+index+"] =" +a[index]);
            index ++;
        }
        System.out.println("array element using for loop");
        for (i=0; i<a.length;i++){
            System.out.println("index "+i+ " a["+i+"]=" +a[i]);
        }
        System.out.println("Array element by for each loop:");
        for (int item:a){
            System.out.println("item : "+ item);
        }
    }
}

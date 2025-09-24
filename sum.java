public class sum {
    public static void main(String[] args) {
        int a[] = {5, 7, 8, 9, 2};
        sum(a);
    }
    public static void sum(int a[]) {
           int sum=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
             sum += a[i];
            }
        }
           System.out.println(sum);

    }
    
}

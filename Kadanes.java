public class Kadanes {
  public static void Kadanes(int a[], int size) {
    int curr_sum = 0;
    int max_sum = Integer.MIN_VALUE;
    for (int i = 0; i <= size; i++) {
        curr_sum += a[i];
        if (max_sum < curr_sum) {
            max_sum = curr_sum;
        }
        if (curr_sum < 0) {
            curr_sum = 0;
        }
    }
    System.out.println("MaximumSum: " +max_sum);
}
public static void main(String[] args) {
  int a[]={1,2,3,4,5};
  int ab[]={3,1,7,4,8};
  int n=a.length-1;
  Kadanes(a,n);
}
}

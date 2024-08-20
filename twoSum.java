public class twoSum {
  public static void twoSum() {
    int[] a = { 2, 7, 11, 19 };
    int target = 9;
    int n = a.length;
    int[] b = new int[2];
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (a[i] + a[j] == target) {
                b[0] = i;
                b[1] = j;
                break;
            }
        }
    }
    System.out.println();
    for (int i = 0; i < b.length; i++) {
        System.out.print(+b[i]+" ");
    }
}
public static void main(String[] args) {
  int a[]={1,2,3,4,5};
  int ab[]={3,1,7,4,8};
  int n=a.length-1;
  twoSum();
}
}
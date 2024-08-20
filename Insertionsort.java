public class Insertionsort {
  public static void Insertionsort(int[] ab)
{
    for(int i=0;i<ab.length-1;i++) {
        int j=i+1;
        while(j>0 && ab[j]<ab[j-1]) {
            int temp=ab[j];
            ab[j]=ab[j-1];
            ab[j-1]=temp;
            j--;
        }

    }
    System.out.println("insertion sort : ");
    for(int i=0;i<ab.length;i++) {
        System.out.println(ab[i]);
    }
}


public static void main(String[] args) {
  int a[]={1,2,3,4,5};
  int ab[]={3,1,7,4,8};
  int n=a.length-1;
  Insertionsort(ab);
}
}
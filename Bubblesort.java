public class Bubblesort {
public static void Bubblesort(int[] ab)
{   
    int n=ab.length;
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(ab[j]>ab[j+1]) {
                int temp=ab[j];
                ab[j]=ab[j+1];
                ab[j+1]=temp;
            }
        } 
    }
    System.out.println();
    System.out.println("Bubblesort: ");
    for(int i = 0 ;i<n;i++) {
        System.out.println(ab[i]);
    }
}
public static void main(String[] args) {
  int a[]={1,2,3,4,5};
  int ab[]={3,1,7,4,8};
  int n=a.length-1;
  Bubblesort(ab);

}
}
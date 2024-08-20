public class Selectionsort {
  public static void Selectionsort(int[] ab){
    for(int i=0;i<ab.length;i++){
        int minPos=i;
        for(int j=i+1;j<ab.length;j++) {
            if(ab[j]<ab[minPos]){
                minPos=j;
            }
        }
        int temp=ab[i];
        ab[i] = ab[minPos];
        ab[minPos] = temp;
    }
    System.out.println();
    System.out.println("Selection sort : ");
    for(int i=0;i<ab.length;i++) {
        System.out.println(ab[i]);
    }
}
public static void main(String[] args) {
  int a[]={1,2,3,4,5};
  int ab[]={3,1,7,4,8};
  int n=a.length-1;
  Selectionsort(ab);
}
}


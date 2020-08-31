import java.util.*;

class swap {
  public static void main(String[] args) {
    int arr1[] = {1,2,3,4,5,6};
    int arr2[] = new int[6];

      int temp = arr1[5];
      arr1[5] = arr1[0];
      arr1[0] = temp;

      for (int j=0;j<6 ;j++ ) {
        arr2[j] =  arr1[j];
      }
      for (int i = 0 ;i <=5  ;i ++ ) {
        System.out.print(arr1[i]+" ");
          }

          System.out.println("\n");

          for (int i = 0 ;i <=5  ;i ++ ) {
            System.out.print(arr2[i]+" ");
              }

  }
}

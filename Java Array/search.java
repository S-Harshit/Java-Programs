import java.util.*;

class Reverse {
  public static void main(String[] args) {

    int search;
    int arr1[] = {1,2,3,4,5,6};
    int arr2[] = new int[6];

    Scanner inp = new Scanner(System.in);

    System.out.println("Enter the value to search"); {
          search = inp.nextInt();
      }

      for (int i=0;i<6;i++ ) {
          int temp = arr1[i];
          if(temp==search) {
            System.out.println("Number Exist at "+ i +" index");
          }
      }


      // for (int i = 0 ;i <=5  ;i ++ ) {
      //   System.out.print(arr1[i]);
      //     }
      //
      //     for (int i = 0 ;i <=5  ;i ++ ) {
      //       System.out.print(arr2[i]);
      //         }


  }
}

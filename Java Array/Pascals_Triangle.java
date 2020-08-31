import java.util.Scanner;


class Pascals_Triangle{

public static void main(String args[]) {
  int no_of_rows;
  int no_of_colums;
  int loop;

  Scanner inp = new Scanner(System.in);

  System.out.println("Enter Number Of Rows You Want To Print:");

  no_of_rows = inp.nextInt();
  System.out.print("\n");
  no_of_colums = no_of_rows;
  loop = no_of_rows;

  long arr[][] = new long[no_of_rows][no_of_colums];


    for(int i=0;i<loop;i++) {
      for(int j=0;j<=i;j++) {
        if (j==0) {
          arr[i][j] = 1;
          System.out.print(arr[i][j]+" ");
        }

        if (j==i && j!=0) {
          arr[i][j] = 1;
          System.out.print(arr[i][j]+" ");
        }
        if(j!=0 && j!=i) {
          arr[i][j]  = arr[i-1][j-1] + arr[i-1][j];
          System.out.print(arr[i][j]+" ");
        }

      }
        System.out.print("\n");
    }


  }
}

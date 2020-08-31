/*3.	Write a program to read numbers in an integer array of size 5 and display the following:
i)	Sum of all the elements
ii)	Sum of alternate elements in the array
iii)	Second highest element in the array
*/

		import java.util.*;
class Arrayoperations {
  public static void main(String[] args) {

    int size = 5;
    int sum = 0;
    int sumalt = 0;
    int temp=0;
    int largest =0;
    int userinput=0;

    int j = 0;


    int arr[] = new int[size];

    System.out.println("Enter Elements Of Array: ");
    Scanner inp = new Scanner(System.in);
    for(int i=0 ; i < size ; i++) {
      arr[i] = inp.nextInt();
    }


    System.out.println("Press 1 For Sum of All Elements ");
    System.out.println("Press 2 For Sum of Alternate Elements ");
    System.out.println("Press 3 For Second Largest Element ");

    userinput = inp.nextInt();

    switch(userinput) {
      case 1:


          System.out.println("Sum Of All Elements :");
          for( j = 0;j<size;j++) {
            sum = sum + arr[j];
          }

          System.out.println(sum);

          break;
      case 2:
        System.out.println("\nSum of Every Alternate Element Starting from 0 :");
        for(j=0;j<size;j=j+2) {
            sumalt = sumalt+arr[j];
          }
          System.out.println(sumalt);
          sumalt =0;
          System.out.println("\nSum of Every Alternate Element Starting from 1 :");
          for(j=1;j<size;j=j+2) {
            sumalt = sumalt+arr[j];
          }
          System.out.println(sumalt);
          break;
      case 3:
            for(j=0;j<size;j++) {
              if(j==0) {
                largest = arr[j];
              }
              if(arr[j]>largest) {
                temp = largest;
                largest = arr[j];
              }
            }

        System.out.println("Second Largest :");
        System.out.println(temp);
          break;
    }


    }
  }

//2.	Write a program that initializes an array with ten random integers and then prints four lines of output, containing: 
//•	Every element at an even index
//•	Every odd element
//•	All elements in reverse order
//•	Only the first and last element

ANSWER:
import java.util.*;
class Arraytraversal {
  public static void main(String[] args) {

    int size = 10;
    int greatest=0;
    int temp=0;
    int smallest = 0;
    int difference=0;
    int j = 0;


    int arr[] = new int[size];

    System.out.println("Enter Elements Of Array: ");
    Scanner inp = new Scanner(System.in);
    for(int i=0 ; i < size ; i++) {
      arr[i] = inp.nextInt();
    }

    System.out.println("Element at Every Even Index :");
    for( j = 0;j<size;j=j+2) {
      System.out.print(" "+arr[j]);
    }

    System.out.println("\nEvery Odd Element :");
    for(j=0;j<size;j++) {
      if(arr[j]%2!=0) {
        System.out.print(" "+arr[j]);
      }
    }

    System.out.println("\nElements In Reverse Order :");
    for(j=size-1;j>=0;j--) {
        System.out.print(" "+arr[j]);
    }

    System.out.println("\nElement Present At First And Last Index");
    System.out.print(arr[0]);
    System.out.print(" "+arr[size-1]);
  }
}




//1.	Create an array of integer with size n. Return the difference between the largest and the smallest value inside that array.
//Definition of Done:
//a) The program should ask user to enter the size and elements of the array.
//b) The program should display the difference b/w the largest & smallest element.

import java.util.*;
class Largest_smallest{

  public static void main(String[] args) {

    int size = 0;
    int greatest=0;
    int temp=0;
    int smallest = 0;
    int difference=0;
    int j = 0;

    Scanner inp = new Scanner(System.in);
    System.out.print("Please Input Size of array: ");
    size = inp.nextInt();
    int arr[] = new int[size];

    System.out.println("Enter Elements Of Array: ");

    for(int i=0 ; i < size ; i++) {
      arr[i] = inp.nextInt();
    }

    for(j=0; j<size ; j++) {
      if(j==0) {
      greatest = arr[j];
        }
      if(arr[j]>greatest) {
        greatest = arr[j];
      }
    }

    for(int k=0; k<size;k++) {
       if(k==0) {
         smallest = arr[k];
       }
       if(smallest>arr[k]) {
         smallest = arr[k];
       }
    }

    difference = greatest - smallest;
    System.out.println("Greatest Number :"+ greatest);
    System.out.println("Smallest Number :"+smallest);
    System.out.println("Difference :" +difference);
  }
}



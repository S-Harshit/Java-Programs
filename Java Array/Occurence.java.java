import static java.lang.System.out;

import java.util.Scanner;

public class Occurence{

public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  out.print("Enter the size of the array : ");
  int size = sc.nextInt();

  int arr[] = new int[size];

  for(int i = 0 ; i <size ; i++) {
    arr[i] = sc.nextInt();
  }

  out.print("\nEnter the element you want to find Frequency  : ");
  int find = sc.nextInt();

  int count = 0;
  for(int i = 0 ; i < size ; i++) {

    if(find == arr[i]) {
      count++;
    }
  }

  out.print("\nFrequency of " + find + " is " + count);
}

}

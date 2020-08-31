/*4. Write a program that count occurrence of a given number in the array and its frequency.
	Definition of Done:
a)	The program should ask user to enter the elements of the array
b)	The program should ask the user to enter a number to search and display the frequency of the searched element.
*/


		import static java.lang.System.out;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i = 0 ; i <size ; i++) {
			arr[i] = sc.nextInt();
		}
		
		out.print("\nEnter the elemnt you want to find Frequency  : ");
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



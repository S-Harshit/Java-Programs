// Use a stack to reverse the words of a sentence.
//Keep reading words until you have a word that ends in a period, //
//adding them onto a stack. When you have a word with a period,
// pop the words off and print them. Stop when there are no more words in the input. (20 mins)
//
// Definition of Done
// You should the convert the input as follows:
// Mary had a little lamb. Its fleece was white as snow.
// into
// Lamb little a had mary. Snow as white was fleece its.
// Display the desired resultant stack
import java.util.*;

public class Stack_Reverse{

	public static void main(String[] args) {
// Creating Stack

		String sentence = "Mary had a little lamb. Its fleece was white as snow.";
		String[] arr = sentence.split("[.]");


		 for(String a : arr) {
			 System.out.println(a);
		 }

		 System.out.print("\n");

 Stack<String> sstack = new Stack<>();

for (int i=0 ; i< arr.length ;i++) {

	  String[] splitted = arr[i].split(" ");
		String new_first = splitted[splitted.length-1];
		String new_last = splitted[0];
		if(i>=1) {
				 new_last = splitted[1];
		}
		char c = new_first.charAt(0);
		System.out.print(c+" THIS IS S CAFG\n");
		System.out.print(new_first + "<----------------------\n");
		System.out.print(new_last + "<---------------\n");

//////////////////////////////////////////////

	 for (int j=0;j<splitted.length ;j++ ) {
	 			String forpush = splitted[j];
				sstack.push(forpush);
	 		}
	///////////////////////////////////////////////////
	System.out.print("\n");

	while (!sstack.isEmpty()) {
		System.out.println(sstack.pop());
			}
		}

	}
}

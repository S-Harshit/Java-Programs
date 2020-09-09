import java.util.*;

import java.io.*;
class StudentsTreeMap{
	public static void main(String[] args) throws Exception{

		Scanner inp = new Scanner(System.in);
		int user_inp = 5;
		String name;
		String grade;


		TreeMap<String, String> tm = new TreeMap<String, String>();


		while(user_inp != 0) {

			System.out.println("\nPress '1' to Add Students");
			System.out.println("Press '2' to Remove Students");
			System.out.println("Press '3' to Update Grade");
			System.out.println("Press '4' to View Data");
			System.out.println("Press'0' to quit\n");

			user_inp = inp.nextInt();
			System.out.print("\n");

			switch(user_inp) {
				case 1:
					System.out.println("Enter Student Name:");
					name = inp.next();
					System.out.println("Enter " + name + "'s Grade");
					grade = inp.next();
					tm.put(name,grade);
				break;

				case 2:
					System.out.println("Enter The Name of Student To be Removed");
					name = inp.next();
					tm.remove(name);
				break;

				case 3:
					System.out.println("Enter The Name of Student");
					name = inp.next();
					System.out.println("Enter New Grade");
					grade = inp.next();
					tm.put(name,grade);
				break;

				case 4:
				for (Map.Entry mapElement : tm.entrySet()) {
				String key = (String)mapElement.getKey();
				// Finding the value
				String value = (String)mapElement.getValue();

				System.out.println(key + " : " + value);
				}
			}
		}



 		}
	}

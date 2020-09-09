import java.util.*;
import java.io.*;

class OccurenceHashMap {
	public static void main(String[] args) throws Exception{
		int index = 0;
		String st;
		String word;

		//File Obj
		File obj = new File("D:\\College\\sem 3\\EWA\\alice_in_wonderland.txt");

		//Budder Reader
		BufferedReader obj1 = new BufferedReader(new FileReader(obj));


		HashMap<String, Integer> map = new HashMap<>();

		while((st = obj1.readLine())!= null) {
				String[] arrOfStr = st.split(" ");


				for(int i=0;i<arrOfStr.length;i++) {
						String temp=arrOfStr[i];
						//Using regex
							temp = temp.replaceAll("[^0-9a-zA-Z-:]+", "");

								Integer count = map.get(temp);

							if (count == null) {
								map.put(temp, 1);
								}
							else {
								map.put(temp,count + 1);
								}
							}
						}
			// Output
			for (Map.Entry<String, Integer> e : map.entrySet()) {
				 System.out.println("'"+ e.getKey()+"'" + " occurs :" + e.getValue());
 		 	}
		}
	}

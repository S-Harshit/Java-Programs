// Q1. Write a program that reads a file and displays the words of that file as a list.
// o First display all words. !
// o Then display them in reverse order. !
// o Then display them with all plurals (ending in "s"). !
// o Then display them with all plural words removed and the size of updated list


import java.util.*;
import java.io.*;
class ArrayListQuestion {
  public static void main(String[] args) throws Exception  {
    ////////////////////////////////////////HARSHIT SHARMA//////////////////////////////////////////

          String st;
          String str1;
          int i;
          int size_before;
          int size_after;

          List<String> list = new ArrayList<>();
          List<String> list2 = new ArrayList<>();


          //Reading From FILE
          File file = new File("D:\\College\\sem 3\\Data Structure\\Codes\\Java Linked List\\Words.txt");
          BufferedReader br = new BufferedReader(new FileReader(file));

          //Traversing And Printing In NOrmal ORDER
          System.out.print("\n\n"+"IN NORMAL ORDER:\n");

          while ((st = br.readLine()) != null) {
            list.add(st);
          }
          size_before = list.size();

          ListIterator<String> itr = list.listIterator();
          while (itr.hasNext()) {
            str1 = itr.next();
            System.out.println(str1);
          }

          //Traversing And Printing in Reverse Order
          System.out.print("\n\n"+"IN REVERSE ORDER:\n");
          itr = list.listIterator(list.size());
          while (itr.hasPrevious()) {
            str1 = itr.previous();
            System.out.println(str1);
          }

          //Printing Words Ending With S
          System.out.print("\n\n"+"WORDS EnDinG WITH 'S':\n");
          itr = list.listIterator();
          while(itr.hasNext()) {
            str1 = itr.next();
            str1 = str1.trim();
            String arr[] = str1.split("");

            i = arr.length - 1;

            if(arr[i].equals("s")) {
              System.out.println(str1+ "\n ");
              list2.add(str1);
            }
          }

          //Removing Words Ending With S
          itr = list2.listIterator();
          while(itr.hasNext()) {
            list.remove(itr.next());
          }

          //Updated List
          System.out.println("Updated List :");
          for(String str3 : list) {
            System.out.println(str3);
          }

          //Size After And Before Update
          size_after = list.size();
          System.out.println("\nSize Before : "+size_before + "\nSize After :" +size_after);
  }
}

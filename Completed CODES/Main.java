//Program Shows Kepad Combinations of a Word
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        String st;
        String mainword;
        int k;
        
        int temp=0;
        Long res=12345678910L;
        boolean check;
        boolean flag1=true;
        boolean foruser;
        long userinp;


        //Reading From File
        File file = new File("D:\\College\\sem 3\\EWA\\wordlist.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));


        List<String> list1 = new ArrayList<>();
        Map<Long,List> map = new HashMap();

        //reading rom file adding to a list
         while((st = br.readLine())!=null) {
            list1.add(st);
        }

        //Traversing list1
        for (String s : list1) {

            mainword = String.valueOf(s);
            mainword = mainword.toLowerCase();
            char[] arr = mainword.toCharArray(); // created a char array of word read from list
            int[] arr1 = new int[arr.length];
            for (k = 0; k < arr.length; k++) {
                //Loops For Converting Characters to their respective values on keypad
                for (char ch : "abc".toCharArray()) {
                    if (ch == arr[k]) {
                        arr1[temp] = 2;
                        temp++;
                    }
                }

                for (char ch : "def".toCharArray()) {
                    if (ch == arr[k]) {
                        arr1[temp] = 3;
                        temp++;
                    }
                }

                for (char ch : "ghi".toCharArray()) {
                    if (ch == arr[k]) {

                        arr1[temp] = 4;
                        temp++;
                    }
                }

                for (char ch : "jkl".toCharArray()) {
                    if (ch == arr[k]) {

                        arr1[temp] = 5;
                        temp++;
                    }
                }

                for (char ch : "mno".toCharArray()) {
                    if (ch == arr[k]) {

                        arr1[temp] = 6;
                        temp++;
                    }
                }

                for (char ch : "pqrs".toCharArray()) {
                    if (ch == arr[k]) {

                        arr1[temp] = 7;
                        temp++;
                    }
                }

                for (char ch : "tuv".toCharArray()) {
                    if (ch == arr[k]) {

                        arr1[temp] = 8;
                        temp++;
                    }
                }

                for (char ch : "wxyz".toCharArray()) {
                    if (ch == arr[k]) {
                        arr1[temp] = 9;
                        temp++;
                    }
                }

            }

            //converting array to long for putting in HasMap
            for (int i : arr1) {
                res = res * 10 + i;
            }

            Forlist obj = new Forlist();
            obj.adding(mainword);

            //check if Hashmap already contains Long value and if it does replace else add it
            check = map.containsKey(res);
            if (check) {
                List inc = map.get(res);
                inc.add(mainword);
                map.replace(res, inc);
                System.out.println(res); //remove comment to get combination containing multiple values according to words read
            } else {
                map.put(res, obj.list);
            }

            //values reset after each loop
            temp = 0;
            res = 0L;

        }
        System.out.println("\n^^Some Combinations Are Given Above For Reference^ ---- Note - (Only Shows If One combination has Multiple Words)^\n");
        System.out.println("*******************WELCOME*************************");
        br.close();

        Scanner inp = new Scanner(System.in);

        //Main Loop
        while(flag1) {

            System.out.println("\n--> Enter KeyPad Equivalent Of Word");
            System.out.println("--> Press 0 to exit\n");

            userinp = inp.nextLong();
            foruser = map.containsKey(userinp);

            if(foruser) {
                System.out.println("\nWords That Can BE Formed With "+userinp+" KeyPad combinations is/are "+ map.get(userinp));
            }
            if(userinp == 0) {
                flag1 = false;
            }

        }

        inp.close();


    }

}

class Forlist {

    List<String> list = new ArrayList();
    void adding(String stuff) {
        list.add(stuff);
    }

}

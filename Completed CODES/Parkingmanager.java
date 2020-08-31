import java.util.*;
import java.util.stream.IntStream;
class Parkingmanager {
  public static void main(String[] args) {

    int   flag = 1;


    Scanner inp  = new Scanner(System.in);

    System.out.println("Enter The Maximum Number Of Car That Can be Parked In Driveway: ");
    int max = inp.nextInt();
    int arr[] = new int[max];

    System.out.println("Please Enter Number Of Cars: ");

    for (int k=0;k<max;k++ ) {
          arr[k] = inp.nextInt();
        }


    Stack<Integer> parkingSpace = new Stack<Integer>();

      for (int i=0; i<arr.length; i++ ) {
          parkingSpace.push(arr[i]);
      }

      ///////////////////// Car To Be Retrived/////////////////////////////


      while(flag!=0) {

         System.out.print("Enter The Number on The Car To Be Retrived: \n");
         int car_no = inp.nextInt();
         Integer pos = (Integer) parkingSpace.search(car_no);


         if(pos == -1)
            System.out.println("No car found");

    /////////////////////////////Removing Car//////////////////////////////////////////////

      Queue<Integer> Outside_que= new LinkedList<>();


      for (int j=0;j<pos-1;j++) {     // 40,56,85,45,95
        Outside_que.add(parkingSpace.pop());
          }

      System.out.print("Car with Number "+ car_no + " Has Been Retrived \n");
      parkingSpace.pop();  //Car Retrived



     /////////////////////Displaying Cars////////////////////////////////////////
      for (Integer item : Outside_que ) {
        parkingSpace.push(item);
      }

      Outside_que.clear();


      System.out.println("Cars In Parking:  "+parkingSpace+ "\n");
      System.out.println("Cars on the Street"+ Outside_que+"\n");

      System.out.println("To Exit Press '0' ");
      System.out.println("To Take Out More Cars Press '1' :");

      flag = inp.nextInt();

      }
      inp.close();
    }
}

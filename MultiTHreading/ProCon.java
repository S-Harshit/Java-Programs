//
//Write a producer-consumer program for Ryan and Monica where Monica (Producer) keeps on depositing the money
// up to a certain limit and Ryan (Consumer) keeps withdrawing the money up to a certain number of times.
//When the balance gets insufficient, Ryan will wait for Monica to deposit more money and notify him again.
//Definition of Done:
//Create two thread objects either by extending the Thread class or implementing the Runnable interface
//You can ask the user to enter the initial amount and perform the desired operation inside run()
//Show the desired result

class CommonAccount {
      int bal = 2000;


      int Deposting(int dep) {
            bal = bal +  dep;
            return bal;
      }
      int Withdrawing1(int wit) {
            bal = bal - wit;
            return  bal;
      }

      public int getbal() {

          return bal;
      }
}


class depositwidthraw implements Runnable {
    CommonAccount obj;
    depositwidthraw() {
        obj = new CommonAccount();
    }
  public void run() {
        synchronized (this) {
            if (Thread.currentThread().getName().compareTo("ryan") == 0) {
                for(int i=0;i<5;i++) {
                    if (obj.getbal() > 1000) {
                        makewidthraw();

                    } else {
                        notify();
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }

            else {
                for(int i=0;i<5;i++) {
                    dodeposit();
                    notify();
                }
            }
        }

}
    void makewidthraw() {
        obj.Withdrawing1(1000);
        System.out.println("Balance After " + Thread.currentThread().getName() + " Withdrawing :"+obj.getbal() );
    }
    void dodeposit() {
        obj.Deposting(1000);
        System.out.println("Balance After " + Thread.currentThread().getName() + " Deposited :"+obj.getbal() );

    }


}



public class ProCon {
      public static void main(String[] args) {


            depositwidthraw obj = new depositwidthraw();
            Thread t1 = new Thread(obj,"ryan");
            Thread t2 = new Thread(obj,"monica");

            t1.start();
            t2.start();
      }

}

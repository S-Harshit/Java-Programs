
//
//Write a program to depict “two people one bank account” problem and How Ryan and Monica end up with inconsistent amount
//leading to concurrency issues and how you can solve this issue using the synchronized block/keyword.
//Definition of Done:
//Create two thread objects namely Ryan and Monica either by extending Thread class or implementing Runnable interface
//You can ask the user to enter the initial amount and perform the desired operation inside run()
//Show the desired result

import java.util.Scanner;

class Bankbalance{
     static int balance = 400;

     void withdraw(int Amount) {
         balance = balance - Amount;
     }

     public int getBalance() {
         return balance;
     }
 }

 class RyanAndMonica implements Runnable {
    Bankbalance account;
    RyanAndMonica() {
        account = new Bankbalance();
    }

     @Override
     public void run() {


         for(int i=0;i<5;i++) {
            MakeWithdrawl(100);
        }

     }
     synchronized void MakeWithdrawl(int amount) {
         if(account.getBalance() >= amount) {
             System.out.println(Thread.currentThread().getName()+" Withdrawing " + amount);

             try {
                 System.out.println(Thread.currentThread().getName()+" is going to sleep.");
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println(Thread.currentThread().getName()+" is going to withdraw");
             account.withdraw(amount);
             System.out.println("Remaining Balance :"+account.getBalance());

         }
         else{
             System.out.println("Not Sufficient Balance");
         }

     }
 }


public class Bank {
    public static void main(String[] args) {
        RyanAndMonica obj = new RyanAndMonica();
        Thread t1 = new Thread(obj,"Monica");
        Thread t2 = new Thread(obj,"Ryan");



        t1.start();
        t2.start();
    }
 }

  

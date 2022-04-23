import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      System.out.println("Create a bank account");
      BankAccount b1 = new BankAccount();
      /* System.out.println("1. Diposite money");
      System.out.println("2. Withdraw money");
      System.out.println("3. View balance");
      System.out.println("4. Exit");
      */
      int optionPicked;
      do{
        System.out.println("1. Diposite money");
        System.out.println("2. Withdraw money");
        System.out.println("3. View balance");
        System.out.println("4. Exit");
        Scanner optionPicking = new Scanner(System.in);
        optionPicked =optionPicking.nextInt();
          if(optionPicked == 1){
            b1.deposit();
            System.out.println(b1);
          }
          else if(optionPicked == 2){
            b1.withdraw();
            System.out.println(b1);
          }
          else if(optionPicked == 3){
            System.out.println(b1);
          }
          else if (optionPicked == 4){
            System.out.println(b1 + "remaining.");
            System.out.println("good bye 👋");
          }
          else{
            System.out.println("INVALID option 😭");
          }
        }
        while(optionPicked != 4 );
    

      //BankAccount b2 = new BankAccount();
      //BankAccount b3 = new BankAccount();
      //b1.deposit();
      //b2.deposit();
      //b3.deposit();
      //b1.withdraw();
      //b2.withdraw();
      //b3.withdraw();
      //System.out.println(b1);
      //System.out.println(b2);
      //System.out.println(b3);
    }
  }
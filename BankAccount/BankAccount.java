import java.util.Scanner;
public class BankAccount{
  private double balance;
  private String name;
  /*
  CONSTRUCTOR: BankAccount: Takes input values of a name and an account balance and sets them to the name and balance of a new BankAccount.
  @param n: The name of the BankAccount
  @param b: The balance of the BankAccount
  */
  public BankAccount(String n, double b) {
    name = n;
    balance = b;
  }
  /*
  CONSTRUCTOR: BankAccount: Takes input value of a name and sets it to the name of a new BankAccount. The balance of the Account is set to 0 by default.
  @param n: The name of the BankAccount
  */
  public BankAccount(String n) {
    name = n;
    balance = 0;
  }
  /*
  CONSTRUCTOR: BankAccount: Takes input of a name and account balance via scanners and sets those values to the name and balance of a new BankAccount.
  */
  public BankAccount() {
    Scanner scanN = new Scanner(System.in);
    Scanner scanB = new Scanner(System.in);
    System.out.println("Enter the account name.");
    name = scanN.nextLine();
    System.out.println("Enter the starting balance.");
    balance = scanB.nextDouble();
  }
  /*
  METHOD: deposit: Takes input of a deposit amount and adds that value to the BankAccount's balance.
  @param d: The amount to be deposited
  */
  public void deposit(double d) {
    balance += d;
  }
  /*
  METHOD: withdraw: Takes input of a withdrawal amount and subtracts that value from the BankAccount's balance. If the balance is then less then 0, it prints a statement, but keeps the negative Account balance.
  @param w: The amount to be withdrawn
  */
  public void withdraw(double w) {
    balance -= w;
    if (balance < 0) {
      System.out.println("Your funds were insufficient");
    }
  }
  /*
  METHOD: deposit: Takes input of a deposit amount via a scanner and adds that value to the BankAccount's balance.
  */
  public void deposit() {
    Scanner scanD = new Scanner(System.in);
    System.out.println("Enter the deposit amount for " + name + "\'s account.");
    balance += scanD.nextDouble();
  }
  /*
  METHOD: withdraw: Takes input of a withdraw amount via a scanner and subtracts that value from the BankAccount's balance. If the resulting balance is negative, a statement is printed, but the negative balance remains.
  */
  public void withdraw() {
    Scanner scanW = new Scanner(System.in);
    System.out.println("Enter the withdrawal amount for " + name + "\'s account.");
    balance -= scanW.nextDouble();
    if (balance < 0) {
      System.out.println("Your funds were insufficient");
    }
  }
  /*
  GETTER: getBalance: Gets the BankAccount's balance
  @return: returns the current balance of the BankAccount
  */
  public double getBalance() {
    return balance;
  }
  /*
  GETTER: getName: Gets the BankAccount's name
  @return: returns the name of the BankAccount
  */
  public String getName() {
    return name;
  }
  /*
  METHOD: toString: Changes the default print statement of the BankAccount to the below statement.
  @return: returns the below statement as a default statement to print with the BankAccount as a parameter.
  */
  public String toString() {
    return name + "\'s account has a balance of $" + balance;
  }
}
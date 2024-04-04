import java.util.*;
public class AtmProject {
    public static void main(String[] args) {
      int pin=1234;
      int balance=10000;
      int Credit=0;
      int Debit=0;
      String name;
      Scanner a= new Scanner(System.in);
        System.out.println("Enter Your Pin Number");
        int password =a.nextInt();

        if(password==pin){
            System.out.println("Enter Your Name");
            name = a.next();
            System.out.println("Welcome"+ " "+name);

            while(true){
                System.out.println("Press 1 to Check Your Balance");
                System.out.println("Press 2 to Credit Amount");
                System.out.println("Press 3 to Debit Balance");
                System.out.println("Press 4 to Take Your Receipt");
                System.out.println("Press 5 to EXIT");

                int opt=a.nextInt();
                switch (opt){
                    case 1:
                        System.out.println("Your Current Balance is"+" "+balance);
                        break;

                    case 2:
                        System.out.println("Enter Credit Amount");
                        Credit=a.nextInt();
                        System.out.println("Successfully Credited");
                        balance=Credit+balance;
                        break;

                    case 3:
                        System.out.println("Enter Debit Amount");
                        Debit =a.nextInt();
                        if(Debit>balance) {
                            System.out.println("Insufficient Balance");
                            System.out.println("Try less than your available Balance");
                        }
                        else{
                            System.out.println("Successfully Debited");
                            balance=balance-Debit;
                        }
                        break;
                    case 4:
                        System.out.println("Welcome All Mini ATM");
                        System.out.println("Available balance is"+" "+balance);
                        System.out.println("Amount Deposited"+" "+Credit);
                        System.out.println("Amount Debit"+" "+ Debit);
                        System.out.println("Thanks for Coming");
                        break;
                }
                if(opt==5){
                    System.out.println("Thank you...");
                    break;
                }
            }
        }
        else{
            System.out.println("Wrong Pin Number");
        }

        }
    }

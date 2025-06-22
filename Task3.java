import java.util.*;
class Bank{
    Scanner sc=new Scanner(System.in);
    public void check(int amt){
        System.out.println("Current balance:"+amt);
    }
    public int Withdraw(int amt){
        System.out.println("Enter amount for withdraw");
        int withamt=sc.nextInt();
        if(withamt<=amt){
        amt=amt-withamt;
        System.out.println("Withdraw successful");
       
        }
        else{
            System.out.println("Your balance is low");
        }
         return amt;
    }
    public int Deposit(int amt){
        System.out.println("Enter amount for Deposit");
        int deamt=sc.nextInt();
        amt=amt+deamt;
        System.out.println("Deposit successful");
        return amt;
    }
}
class Task3 extends Bank{
    
    public static void main(String[] args) {
        Task3 obj=new Task3();
        System.out.println("****ATM Interface****");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your 4 digit PIN for ATM");
    int code=sc.nextInt();
     System.out.println("Enter your Bank balance");
    int amt=sc.nextInt();
    System.out.println("1.Check Balance\n2.Withdraw\n3.Deposit\n4.Exit");
    int c,PIN;
    do{
     System.out.println("Enter your choice");
     c=sc.nextInt();
    switch(c){
        case 1:
         System.out.println("Enter your PIN No.:");
         PIN=sc.nextInt();
        if(PIN==code){
        obj.check(amt);
        }
        else{
            System.out.println("Wrong PIN No.\nTry Again..."); 
        }
        break;

        case 2:
         System.out.println("Enter your PIN No.:");
         PIN=sc.nextInt();
        if(PIN==code){
        amt=obj.Withdraw(amt);
         }
        else{
            System.out.println("Wrong PIN No.\nTry Again..."); 
        }
        break;

        case 3:
        System.out.println("Enter your PIN No.:");
         PIN=sc.nextInt();
        if(PIN==code){
        amt=obj.Deposit(amt);
         }
        else{
            System.out.println("Wrong PIN No.\nTry Again..."); 
        }
        break;

        default:
        System.out.println("Invalid choice...");
        break;


   }
    }while(c!=4);
    if(c==4){
        System.out.println("Exit");
    }

    }
}
 
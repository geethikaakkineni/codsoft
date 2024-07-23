import java.util.Scanner;



public class atm {

    public float withdraw(float amount){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount u want to withdraw:");
        float wd=sc.nextFloat();
        if(amount>=wd){
            System.out.println("withdrawal successful");
            amount=amount-wd;
        }
        else{
            System.out.println("insufficient funds!");
        }    
        return amount;
    }

    public float deposit(float amount){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount u want to deposit:");
        float d=sc.nextFloat();
        amount=amount+d;
        System.out.println("deposition successful!");
        return amount;
    }

    public void checkbal(float amount){
        System.out.println("your acc balance:"+amount);
    }


    public static void main(String a[]){
        float bal=25000;
        System.out.println("WELCOME");
        while(true){
            System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("What would you want to do?");
        System.out.println("1.withdraw ");
        System.out.println("2.deposit ");
        System.out.println("3.checkbalance ");
        System.out.println("4.exit ");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();

        atm obj=new atm();
        switch(choice) {
            case 1:
            float afterwd=obj.withdraw(bal);
            System.out.println("your acc balance now:"+afterwd);
            bal=afterwd;
            break;

            case 2:
            float afterd=obj.deposit(bal);
            System.out.println("your acc balance now:"+afterd);
            bal=afterd;
            break;

            case 3:
            obj.checkbal(bal);
            break;

            case 4:
            System.out.println("exiting..");
            System.exit(0);
            break;
            
            default:
            System.out.println("pls enter a valid choice");
        }
        }
    }
}

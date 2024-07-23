import java.util.Random;
import java.util.Scanner;

public class task1{
    public static void main(String a[]){
        Random random=new Random();
        int gnrtdnum = random.nextInt(101);
        Scanner scanner=new Scanner(System.in);
        int score=0;
        int rounds=1;
        while (rounds<=3){
            System.out.println("***ROUND "+rounds+"***");
            int i=0;
            while(i<=2){
                if(i==0){
                    System.out.println("you have 3 chances to guess the number!");
                }
                if(i==1){
                    System.out.println("you have 2 chances to guess the number!");
                }
                if(i==2){
                    System.out.println("you have 1 chance to guess the number!");
                }
                
                System.out.println("enter your guess:");
                int userguess=scanner.nextInt();

                if(userguess>gnrtdnum){
                    System.out.println("too high");
                }
                if (userguess<gnrtdnum) {
                    System.out.println("too low");
                } 
                if(userguess==gnrtdnum){
                    System.out.println("yay! correct");
                    score++;
                    break;
                }
                i++;
                if(i==3){
                    System.out.println("you ran out of your turns");
                    System.out.println("the number is : "+gnrtdnum);
                    System.out.println("your score:"+score);
                    System.out.println();
                }
            }
            rounds++;
        }
    }
}
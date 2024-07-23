import java.util.Scanner;

public class task2 {
    public float markscalculator(float math,float chem,float phy){
        float total=math+chem+phy;
        return total;
    }
    public void gradecalculator(float percent){
        if(percent>=95){
            System.out.println("OVERALL GRADE :A+");
        }
        else if(percent>=85){
            System.out.println("OVERALL GRADE :A");
        }
        else if(percent>=70){
            System.out.println("OVERALL GRADE :B");
        }
        else if(percent>=55){
            System.out.println("OVERALL GRADE :C");
        }
        else if(percent>=35){
            System.out.println("OVERALL GRADE :D");
        }
        else{
            System.out.println("OVERALL GRADE :F");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks in mathematics:");
        float math=sc.nextFloat();
        System.out.println("enter your marks in chemistry:");
        float chem=sc.nextFloat();
        System.out.println("enter your marks in physics:");
        float phy=sc.nextFloat();
        
        task2 t2=new task2();
        float total=t2.markscalculator(math,chem,phy);
        System.out.println();
        System.out.println("TOTAL MARKS : "+total);
        float percent=(total/300)*100;
        System.out.println("AVERAGE PERCENTAGE : "+percent+"%");

        t2.gradecalculator(percent);
    }
}

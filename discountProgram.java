package data_11_08_2023;
import java.util.Scanner;

public class discountProgram
{
    private String name;
    private long mobno;
    private double cost;
    private double dis;
    private double amount;

    public discountProgram()
    {
        
        cost = 0.0;
        dis = 0.0;
        amount = 0.0;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter cost: ");
        cost = in.nextDouble();
    }
    
    public void calculate() {
        int disPercent = 0;
        if (cost <= 10000)
            disPercent = 5;
        else if (cost <= 20000)
            disPercent = 10;
        else if (cost <= 35000)
            disPercent = 15;
        else
            disPercent = 20;
        
        dis = cost * disPercent / 100.0;
        amount = cost - dis;
    }
    
    public void display() {
        
        System.out.println("Amout after discount: " + amount);
    }
    
    public static void main(String args[]) {
        discountProgram obj = new discountProgram();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
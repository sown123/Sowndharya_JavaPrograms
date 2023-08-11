package data_11_08_2023;

import java.util.Scanner;

public class disprogram
{
    private String bname;
    private double price;
    
    public disprogram() {
        bname = "";
        price = 0.0;
    }
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter price : ");
        price = in.nextDouble();
    }
    
    public void calculate() {
        double discount;
        if (price <= 1000)
            discount = price * 0.02;
        else if (price <= 3000)
            discount = price * 0.1;
        else
            discount = price * 0.15;
            
        price -= discount;
    }
    
    public void display() {
     
        System.out.println("Price after discount: " + price);
    }
    
    public static void main(String args[]) {
        disprogram obj = new disprogram();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
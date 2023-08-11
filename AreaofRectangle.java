package CGTraining;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length,breadth,area;
		
		Scanner obj=new Scanner(System.in);
	      
	      System.out.println("Enter length value: ");
	      length=obj.nextInt();
	      System.out.println("Enter breadth value: ");
	      breadth=obj.nextInt();
	      
	      area=length*breadth;
	      
	      System.out.println("Area of Rectangle: " + area);

	}

}

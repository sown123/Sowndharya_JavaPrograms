package CGTraining;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length,breadth;
		float area;
		
		Scanner obj=new Scanner(System.in);
	      
	      System.out.println("Enter length value: ");
	      length=obj.nextInt();
	      System.out.println("Enter breadth value: ");
	      breadth=obj.nextInt();
	      
	      area=(float)length*breadth/2;
	      
	      System.out.println("Area of Triangle: " + area);


	}

}

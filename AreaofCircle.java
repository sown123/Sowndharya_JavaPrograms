package CGTraining;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int radius;
		float area;
		
		Scanner obj=new Scanner(System.in);
	      
	      System.out.println("Enter radius value: ");
	      radius=obj.nextInt();
	      
	      
	      area=(float)(3.14*radius*radius);
	      
	      System.out.println("Area of Circle: " + area);


	}

}

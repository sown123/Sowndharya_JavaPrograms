package CGTraining;

import java.util.Scanner;

public class AreaofSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int side,area;
      Scanner obj=new Scanner(System.in);
      
      System.out.println("Enter side value: ");
      side=obj.nextInt();
      
      area=side*side;
      
      System.out.println("Area of square: "+area);
      
	}

}

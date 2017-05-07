import java.util.Scanner;

public class Project_13_11 {
	
public static void main(String[] args)throws CloneNotSupportedException{
	
	//Object is created with side lengths data
	Octagon Octagon1 = new Octagon(5);
	
	//Outputs various info gathered about octagon
		System.out.println(Octagon1.getArea() + " is the area of the Octagon."); 
		System.out.println(Octagon1.getPerimeter() + " is the perimeter of the Octagon.");
	
		//New object is made through clone method
     Octagon Octagon2 = (Octagon)Octagon1.clone();

     //The two objects are compared
     int result = (Octagon1.compareTo(Octagon2));
		if (result == 1)
			System.out.println("The octagon is greather than its clone.");
		else if (result == -1)
			System.out.println("The octagon is less than its clone."); 
		else
System.out.println("The octagons are equal.");
	
	}

}

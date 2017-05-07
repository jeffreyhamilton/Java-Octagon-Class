
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	

	//Data declared	
	private double side = 1.0;
	
	//no arg constructor created
	public Octagon()
	{
		
	}
	//constructor created
	public Octagon(double side)
	{
		this.side = side;
	}
	//get/set methods based from data above
	public void setSide(double newSide)
	{
		side = newSide;
	}
	
	public double getSide()
	{
		return side;
	}
	
	 @Override
	  public String toString() {
	    return "Octagon: all sides = " + side;
	 }

	  @Override//From Abstract method getArea 
	  public double getArea(){
		  
		  
			double area = (2+4/Math.sqrt(2))*side*side;
			return area;
	  }

	  @Override//From Abstract method getPerimeter
	  public double getPerimeter(){
		  
		  double perimeter = side * 8;
			return perimeter;
		  
	  }
	  
	  @Override // Implement compareTo method 
		public int compareTo(Octagon o) {
			if (getArea() > o.getArea())
				return 1;
			else if (getArea() < o.getArea())
				return -1;
			else
				return 0;
		}

		 //Implement Clone method
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
	}

}
